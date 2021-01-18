package test;

import utils.PrintlnUtils;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2021/1/18 上午8:37
 * Name:让你彻底理解Synchronized
 * Overview:
 * Usage:
 * https://www.jianshu.com/p/d53bf830fa09
 * *******************************************************
 */
public class TestSynchronizedDemo implements Runnable {
    private static int count = 0;

    public static void main(String[] args) {
        int len = 10;

        for (int i = 0; i < len; i++) {
            Thread thread = new Thread(new TestSynchronizedDemo());
            thread.start();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        PrintlnUtils.println("TestSynchronizedDemo count = " + count);
        // 通过  synchronized (TestSynchronizedDemo.class)最后输出结果：
        //TestSynchronizedDemo count = 10000000

        // 用javap -v SynchronizedDemo.class查看字节码文件：
        synchronized (TestSynchronizedDemo.class){//同步代码块，锁住的是该类的类对象

        }

        method();

    }

    @Override
    public void run() {

        synchronized (TestSynchronizedDemo.class){//
            int len = 1000000;
            for (int i = 0; i < len; i++) {
                count++;
            }
        }

    }

    public static void method(){

    }
}
