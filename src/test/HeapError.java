package test;

import java.util.ArrayList;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/29 上午9:34
 * Name: OutOfMemoryError 内存溢出异常
 * Overview:
 * 理论上，虚拟机栈、堆、方法区都有发生OutOfMemoryError的可能。但是实际项目中，大多发生于堆当中。比如以下代码：
 * Usage:
 * *******************************************************
 */
public class HeapError {
    public static void main(String[] args) {
        //在一个无限循环中，动态的向ArrayList中添加新的HeapError对象。这会不断的占用堆中的内存，
        // 当堆内存不够时，必然会产生OutOfMemoryError，也就是内存溢出异常。
        ArrayList list = new ArrayList<>();
        while (true) {
            list.add(new HeapError());
        }

        //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        //	at java.base/java.util.Arrays.copyOf(Arrays.java:3721)
        //	at java.base/java.util.Arrays.copyOf(Arrays.java:3690)
        //	at java.base/java.util.ArrayList.grow(ArrayList.java:235)
        //	at java.base/java.util.ArrayList.grow(ArrayList.java:242)
        //	at java.base/java.util.ArrayList.add(ArrayList.java:452)
        //	at java.base/java.util.ArrayList.add(ArrayList.java:465)
        //	at test.HeapError.main(HeapError.java:21)
    }
}
