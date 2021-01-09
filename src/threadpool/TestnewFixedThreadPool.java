package threadpool;

import utils.PrintlnUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2021/1/8 下午8:59
 * Name:
 * Overview:
 * Usage:
 * 线程池 https://kaiwu.lagou.com/course/courseInfo.htm?courseId=67#/detail/pc?id=1865
 *
 * 线程池中shutdown()和shutdownNow()方法的区别 https://www.cnblogs.com/aspirant/p/10265863.html
 * *******************************************************
 */
public class TestnewFixedThreadPool {

    public static void main(String[] args) {

        //newFixedThreadPool 创建一个固定数目的、可重用的线程池。
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);

        int len = 10;
        for (int i = 1; i <= len; i++) {
            final int taskID = i;


            // 向线程池中提交任务
            newFixedThreadPool.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        PrintlnUtils.println("线程: " + Thread.currentThread().getName() + " 正在执行任务 taskID:  " + taskID);
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        //上述代码创建了一个固定数量 3 的线程池，因此虽然向线程池提交了 10 个任务，但是这 10 个任务只会被 3 个线程分配执行，执行效果如下：
        //线程: pool-1-thread-1 正在执行任务 taskID:  1
        //
        //线程: pool-1-thread-3 正在执行任务 taskID:  3
        //
        //线程: pool-1-thread-2 正在执行任务 taskID:  2
        //
        //线程: pool-1-thread-3 正在执行任务 taskID:  4
        //
        //线程: pool-1-thread-2 正在执行任务 taskID:  6
        //
        //线程: pool-1-thread-1 正在执行任务 taskID:  5
        //
        //线程: pool-1-thread-3 正在执行任务 taskID:  7
        //
        //线程: pool-1-thread-2 正在执行任务 taskID:  8
        //
        //线程: pool-1-thread-1 正在执行任务 taskID:  9
        //
        //线程: pool-1-thread-2 正在执行任务 taskID:  10
    }
}
