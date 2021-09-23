package synchronizeds;

import bean.TicketMgt;

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
public class TestSynchronized {

    public static void main(String[] args) {

        //javac TestSynchronized.java 编译后i生成 TestSynchronizedjava.class，  用javap -v TestSynchronizedjava.class查看字节码文件：
//        synchronized (TestSynchronized.class) {//同步代码块，锁住的是该类的类对象
//
//        }
        TicketMgt ticketMgt = new TicketMgt();
        int size = 10;
        for (int i = 0; i < size; i++) {
            new Thread(ticketMgt::blocking).start();
        }

        method();

    }


    public static void method() {

    }
}
