package test;

import utils.PrintlnUtils;

import java.lang.ref.SoftReference;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/29 下午2:47
 * Name:
 * Overview:
 *  vm:-XX:+PrintGC -Xmx200M
 * Usage:
 * GC 回收机制与分代回收策略 https://kaiwu.lagou.com/course/courseInfo.htm?courseId=67#/detail/pc?id=1856
 *
 * java查看简单GC日志 https://www.cnblogs.com/linliquan/p/11264376.html  https://www.cnblogs.com/qlqwjy/p/7929414.html
 *
 * Java GC日志查看  https://blog.csdn.net/u013613428/article/details/53763925
 * *******************************************************
 */
public class SoftReferenceNormal {
    static class SoftObject {
        byte[] data = new byte[120 * 1024 * 1024];// 120M
    }

    public static void main(String[] args) throws InterruptedException{
        //将缓存数据用软引用持有
        SoftReference<SoftObject> cacheRef = new SoftReference<>(new SoftObject());
        PrintlnUtils.println("第一次GC前 软引用："+cacheRef.get());
        System.gc();

        //进行一次GC后查看对象回收情况
        PrintlnUtils.println("第一次GC后 软引用："+cacheRef.get());

        //再分配一个120M的对象，看看缓存对象回收情况
        SoftObject softObject = new SoftObject();
        PrintlnUtils.println("再次配一个120M的强引用对象后 软引用："+cacheRef.get());

    }
}
