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
public class TestnewSingleThreadExecutor {

    public static void main(String[] args) {

        //newSingleThreadExecutor 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按先进先出的顺序执行。
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();

        int len = 5;
        for (int i = 0; i < len; i++) {
            final int taskID = i;

            // 向线程池中提交任务
            newSingleThreadExecutor.submit(new Runnable() {
                @Override
                public void run() {
                    PrintlnUtils.println("线程: "+Thread.currentThread().getName()+" 正在执行任务 taskID:  "+taskID);
                }
            });

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 执行上述代码结果如下，可以看出所有的 task 始终是在同一个线程中被执行的。
        //线程: pool-1-thread-1 正在执行任务 taskID:  0
        //
        //线程: pool-1-thread-1 正在执行任务 taskID:  1
        //
        //线程: pool-1-thread-1 正在执行任务 taskID:  2
        //
        //线程: pool-1-thread-1 正在执行任务 taskID:  3
        //
        //线程: pool-1-thread-1 正在执行任务 taskID:  4
    }
}
