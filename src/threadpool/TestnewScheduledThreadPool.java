package threadpool;

import utils.PrintlnUtils;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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
public class TestnewScheduledThreadPool {

    public static void main(String[] args) {

        //newScheduledThreadPool 创建一个定时线程池，支持定时及周期性任务执行。
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        //延迟1秒执行，每隔一秒执行一次
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                Date date = new Date();
                PrintlnUtils.println("线程 "+Thread.currentThread().getName()+" 报时："+date);


            }
        },500,500, TimeUnit.MILLISECONDS);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 使用shutdown关闭定时任务
        scheduledExecutorService.shutdown();

        //线程 pool-1-thread-1 报时：Sat Jan 09 09:00:42 CST 2021
        //
        //线程 pool-1-thread-1 报时：Sat Jan 09 09:00:43 CST 2021
        //
        //线程 pool-1-thread-1 报时：Sat Jan 09 09:00:43 CST 2021
        //
        //线程 pool-1-thread-1 报时：Sat Jan 09 09:00:44 CST 2021
        //
        //线程 pool-1-thread-1 报时：Sat Jan 09 09:00:44 CST 2021
        //
        //线程 pool-1-thread-1 报时：Sat Jan 09 09:00:45 CST 2021
        //
        //线程 pool-1-thread-1 报时：Sat Jan 09 09:00:45 CST 2021
        //
        //线程 pool-1-thread-2 报时：Sat Jan 09 09:00:46 CST 2021
        //
        //线程 pool-1-thread-1 报时：Sat Jan 09 09:00:46 CST 2021
        //
        //线程 pool-1-thread-1 报时：Sat Jan 09 09:00:47 CST 2021



    }
}
