package test;

import utils.PrintlnUtils;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2021/1/18 上午9:20
 * Name:让你彻底理解volatile
 * Overview:
 * Usage:
 * https://www.jianshu.com/p/157279e6efdb
 *
 * volatile底层原理详解 https://zhuanlan.zhihu.com/p/133851347
 * *******************************************************
 */
public class Testvolatile {
    private static int count = 0;
    private int a = 0;
    private volatile boolean flag = false;

    public void writer() {
        a = 1;          //1
        flag = true;   //2
    }

    public void reader() {
        if (flag) {      //3
            int i = a; //4
        }
    }

    private static volatile boolean isOver = false;

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!isOver) {
                    count++;

                }
            }
        });
        thread.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        isOver = true;
        PrintlnUtils.println("Testvolatile count = " + count);

        /*
            注意不同点，现在已经将isOver设置成了volatile变量，这样在main线程中将isOver改为了true后，
            thread的工作内存该变量值就会失效，从而需要再次从主内存中读取该值，
            现在能够读出isOver最新值为true从而能够结束在thread里的死循环，从而能够顺利停止掉thread线程。
         */
    }
}
