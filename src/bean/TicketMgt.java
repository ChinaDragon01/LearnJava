package bean;

import utils.PrintlnUtils;

/**
 * synchronized
 * https://stevenjon.blog.csdn.net/article/details/107393278
 * <p>
 * synchronized关键字主要有两种用法，分别是同步方法和同步代码块，被synchronized修饰的方法或者代码块，在同一时间，只能被一个线程访问。
 */
public class TicketMgt {
    private int ticket = 2;

    /**
     * synchronized修饰实例方法
     * 锁的是对象，同一时间只能有一个线程访问方法。
     */
    public synchronized void blocking() {
        if (ticket > 0) {
            ticket--;
            PrintlnUtils.print("这张票已经被购买了！");
        }
        PrintlnUtils.printl("还剩 " + ticket + " 张");
    }
}
