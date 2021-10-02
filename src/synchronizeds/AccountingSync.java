package synchronizeds;

import utils.PrintlnUtils;

/**
 * Java并发——Synchronized关键字和锁升级
 * https://blog.csdn.net/tongdanping/article/details/79647337?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.control
 */
public class AccountingSync implements Runnable {
    //共享资源(临界资源)
    static int i = 0;

    /**
     * synchronized 修饰实例方法
     */
    public synchronized void increase() {
        i++;
    }


    @Override
    public void run() {
        for (int j = 0; j < 1000_000; j++) {
            increase();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        AccountingSync accountingSync = new AccountingSync();
        Thread thread1 = new Thread(accountingSync);
        Thread thread2 = new Thread(accountingSync);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        //increase 加上synchronized i = 2000000
        //increase 没有 加上synchronized i = 1005579  错误的结果

        //如果increase的synchronized被删除，那么很可能输出结果就会小于2000000，这是因为多个线程同时访问临界资源i

        PrintlnUtils.println("i = "+i);
    }
}
