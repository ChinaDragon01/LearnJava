package test;

import utils.PrintlnUtils;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.HashSet;
import java.util.Set;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/29 下午3:08
 * Name:  -Xms4M -Xmx4M -Xmn4M -XX:SoftRefLRUPolicyMSPerMB=200
 * Overview:
 * Usage:
 * Java虚拟机究竟是如何处理SoftReference的  https://mp.weixin.qq.com/s/XRCq3IDdGJt3Nq9Mu23U5g
 * *******************************************************
 */

public class SoftReferenceTest {
    //软引用隐藏问题
    //需要注意的是，被软引用对象关联的对象会自动被垃圾回收器回收，但是软引用对象本身也是一个对象，
    // 这些创建的软引用并不会自动被垃圾回收器回收掉。比如如下代码：

    static class SoftObject {
        byte[] data = new byte[1024];// 1KB
    }

    public static int removedsoftRefs = 0;

    public static int CACHE_CAPACTIY = 100 * 1024;// 100M

    //静态集合保存软引用，会导致这些软引用本身无法被垃圾回收器回收
    public static Set<SoftReference<SoftObject>> cache = new HashSet<>(CACHE_CAPACTIY);

    public static ReferenceQueue<SoftObject> sReferenceQueue = new ReferenceQueue<>();

    public static void main(String[] args) {

        for (int i = 0; i < CACHE_CAPACTIY; i++) {
            SoftObject softObject = new SoftObject();
            cache.add(new SoftReference<>(softObject, sReferenceQueue));

            clearUselessSoftReference();

            if (i % 10000 == 0) {
                PrintlnUtils.println("size of cache: " + cache.size());
            }
        }

        PrintlnUtils.println("end!  removedsoftRefs："+removedsoftRefs);

        //虽然每一个SoftObject都被一个软引用所引用，在内存紧张时，GC会将SoftObject所占用的1KB回收。
        // 但是每一个SoftReference又都被Set所引用(强引用)。执行上述代码结果如下：

        //Exception: java.lang.OutOfMemoryError thrown from the UncaughtExceptionHandler in thread "main"
        //
        //Exception: java.lang.OutOfMemoryError thrown from the UncaughtExceptionHandler in thread "Monitor Ctrl-Break"

        //限制堆内存大小为4M，最终程序崩溃，但是异常的原因并不是普通的堆内存溢出，而是"GC overhead"。之所以会抛出这个错误，是由于虚拟机一直在不断回收软引用，回收进行的速度过快，占用的cpu过大(超过98%)，并且每次回收掉的内存过小(小于2%)，导致最终抛出了这个错误。
        //
        //这里需要做优化，合适的处理方式是注册一个引用队列，每次循环之后将引用队列中出现的软引用对象从cache中移除。如下所示：
    }

    public static void clearUselessSoftReference() {
        Reference<? extends SoftObject> reference = sReferenceQueue.poll();
        while (reference != null) {
            if (cache.remove(reference)) {
                removedsoftRefs++;
            }
            reference = sReferenceQueue.poll();
        }
    }

}
