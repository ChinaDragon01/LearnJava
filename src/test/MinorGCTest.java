package test;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/29 上午11:26
 * Name:
 * Overview:
 * VM agrs: -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails
 * -XX:SurvivorRatio=8
 * Usage:
 *
 * GC 回收机制与分代回收策略 https://kaiwu.lagou.com/course/courseInfo.htm?courseId=67#/detail/pc?id=1856
 *
 * java查看简单GC日志 https://www.cnblogs.com/linliquan/p/11264376.html  https://www.cnblogs.com/qlqwjy/p/7929414.html
 * *******************************************************
 */
public class MinorGCTest {
    //在内存中创建 4 个 byte 类型数组来演示内存分配与 GC 的详细过程
    private static final int _1MB = 1024 * 1024;

    public static void testAllocation() {
        byte[] a1, a2, a3, a4;
        a1 = new byte[2 * _1MB];
        a2 = new byte[2 * _1MB];
        a3 = new byte[2 * _1MB];
        a4 = new byte[2 * _1MB];
    }

    public static void main(String[] agrs) {
        testAllocation();
    }
}
