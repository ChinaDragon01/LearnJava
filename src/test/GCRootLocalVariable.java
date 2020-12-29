package test;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/29 上午10:11
 * Name:验证虚拟机栈（栈帧中的局部变量）中引用的对象作为 GC Root
 * Overview:
 * Usage:
 * GC 回收机制与分代回收策略 https://kaiwu.lagou.com/course/courseInfo.htm?courseId=67#/detail/pc?id=1856
 *
 * Java GC日志查看  https://blog.csdn.net/u013613428/article/details/53763925
 * *******************************************************
 */
public class GCRootLocalVariable {
    private int _10MB = 10 * 1024 * 1024;
    private byte[] memory = new byte[8 * _10MB];

    public static void main(String[] args){
        System.out.println("开始时:");
        printMemory();
        method();
        System.gc();
        System.out.println("第二次GC完成");
        printMemory();

        //开始时:
        //free is 255 M, total is 258 M,
        //第一次GC完成
        //free is 175 M, total is 258 M,
        //第二次GC完成
        //free is 15 M, total is 17 M,
    }

    public static void method() {
        GCRootLocalVariable g = new GCRootLocalVariable();
        System.gc();
        System.out.println("第一次GC完成");
        printMemory();
    }

    /**
     * 打印出当前JVM剩余空间和总的空间大小
     */
    public static void printMemory() {
        System.out.print("free is " + Runtime.getRuntime().freeMemory()/1024/1024 + " M, ");
        System.out.println("total is " + Runtime.getRuntime().totalMemory()/1024/1024 + " M, ");
    }
}
