package test;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/29 上午10:54
 * Name:测试成员变量是否可作为 GC Root
 * Overview:
 * Usage:
 * GC 回收机制与分代回收策略 https://kaiwu.lagou.com/course/courseInfo.htm?courseId=67#/detail/pc?id=1856
 *
 * java查看简单GC日志 https://www.cnblogs.com/linliquan/p/11264376.html  https://www.cnblogs.com/qlqwjy/p/7929414.html
 *
 * Java GC日志查看  https://blog.csdn.net/u013613428/article/details/53763925
 * *******************************************************
 */
public class GCRootClassVariable {
    private GCRootClassVariable classVariable;
    public GCRootClassVariable(int size){
        byte[] memory = new byte[size];
    }

    public static void main(String[] args){
        System.out.println("程序开始:");
        printMemory();
        int _10MB = 10 * 1024 * 1024;
        GCRootClassVariable g = new GCRootClassVariable(4 * _10MB);
        g.classVariable = new GCRootClassVariable(8 * _10MB);
        g = null;
        System.gc();
        System.out.println("GC完成");
        printMemory();

        //程序开始:
        //free is 255 M, total is 258 M,
        //GC完成
        //free is 8 M, total is 10 M,
    }
    /**
     * 打印出当前JVM剩余空间和总的空间大小
     */
    public static void printMemory() {
        System.out.print("free is " + Runtime.getRuntime().freeMemory()/1024/1024 + " M, ");
        System.out.println("total is " + Runtime.getRuntime().totalMemory()/1024/1024 + " M, ");
    }
}
