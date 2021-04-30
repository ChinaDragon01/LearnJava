package test;

import utils.PrintlnUtils;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 关于AtomicInteger的实现原理
 * https://blog.csdn.net/timchen525/article/details/80369734
 */
public class TestAtomicInteger {
    //  请求总数
    public static int clientTotal = 5000;
    // 同时并发执行的线程数
    public static int threadTotal = 200;
    public static int count = 0;

    public static AtomicInteger atomicIntegerCount = new AtomicInteger(0);

    public static void main(String[] args) {

        extracted();
        extracted2();
    }

    private static void extracted2() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(threadTotal);
        final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);

        for (int i = 0; i < clientTotal; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                        add2();
                        semaphore.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    countDownLatch.countDown();

                }
            });
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
        PrintlnUtils.println(" 结果 atomicIntegerCount =  "+atomicIntegerCount);//结果 atomicIntegerCount =  5000


    }

    private static void extracted() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(threadTotal);
        final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);

        for (int i = 0; i < clientTotal; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                        add();
                        semaphore.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        PrintlnUtils.println("  === 异常 " + e.toString());
                    }

                    countDownLatch.countDown();
                }
            });
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
            PrintlnUtils.println("  === await 异常 " + e.toString());
        }
        executorService.shutdown();
        PrintlnUtils.println("count = " + count);//count = 4980 count = 4981

        //上述代码，本意是运行之后，count的值为5000，实际上每次运行的结果都小于5000。
    }

    private static void add() {
        count++;
    }


    private static void add2() {
        atomicIntegerCount.incrementAndGet();
    }

}
