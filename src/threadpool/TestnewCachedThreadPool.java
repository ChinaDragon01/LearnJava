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
 * 线程池中shutdown()和shutdownNow()方法的区别 https://www.cnblogs.com/aspirant/p/10265863.html
 * *******************************************************
 */
public class TestnewCachedThreadPool {

    public static void main(String[] args) {


        //newCachedThreadPool 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();

        int len = 5;
        for (int i = 1; i <= len; i++) {
            final int taskID = i;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 向线程池中提交任务
            newCachedThreadPool.execute(new Runnable() {
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

        newCachedThreadPool.shutdown();

        //线程: pool-1-thread-5 正在执行任务 taskID:  5
        //
        //线程: pool-1-thread-2 正在执行任务 taskID:  2
        //
        //线程: pool-1-thread-3 正在执行任务 taskID:  3
        //
        //线程: pool-1-thread-1 正在执行任务 taskID:  1
        //
        //线程: pool-1-thread-4 正在执行任务 taskID:  4

        //从上面日志中可以看出，缓存线程池会创建新的线程来执行任务。但是如果将代码修改一下，在提交任务之前休眠 1 秒钟，如下：
        //再次执行则打印日志同 SingleThreadPool 一模一样，原因是提交的任务只需要 500 毫秒即可执行完毕，
        // 休眠 1 秒导致在新的任务提交之前，线程 “pool-1-thread-1” 已经处于空闲状态，可以被复用执行任务。

        //线程: pool-1-thread-1 正在执行任务 taskID:  1
        //
        //线程: pool-1-thread-1 正在执行任务 taskID:  2
        //
        //线程: pool-1-thread-1 正在执行任务 taskID:  3
        //
        //线程: pool-1-thread-1 正在执行任务 taskID:  4
        //
        //线程: pool-1-thread-1 正在执行任务 taskID:  5



    }
}
