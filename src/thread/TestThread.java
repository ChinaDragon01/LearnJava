package thread;

/**
 * **********************************************************************
 * Author: zbl
 * Time: 2020/7/31 9:02
 * Name:
 * Overview:
 * Usage:
 * 唯一限定私有量 -- ThreadLocal
 * https://blog.csdn.net/weixin_43495590/article/details/96130961
 * <p>
 * Java中的ThreadLocal详解
 * https://www.cnblogs.com/fsmly/p/11020641.html
 * **********************************************************************
 */
public class TestThread {
    private static volatile boolean flag = true;
    static ThreadLocal<String> localVar = new ThreadLocal<>();

    static void print(String str) {
        //打印当前线程中本地内存中本地变量的值
        System.out.println(str + " :" + localVar.get());
        //清除本地内存中的本地变量
        localVar.remove();
    }


    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();


    }

    static class Thread1 extends Thread {
        @Override
        public void run() {
            super.run();
            //设置线程1中本地变量的值
            localVar.set("localVar1");
            print(this.getName());

            //打印本地变量
            System.out.println(this.getName()+" after remove : " + localVar.get());

//            while (flag) {
//                System.out.println("Thread1 this.getName() = " + this.getName());
//            }
        }
    }

    static class Thread2 extends Thread {
        @Override
        public void run() {
            super.run();
            //设置线程1中本地变量的值
            localVar.set("localVar2");
            print(this.getName());

            //打印本地变量
            System.out.println(this.getName()+" after remove : " + localVar.get());

//            while (flag) {
//                System.out.println("Thread2 this.getName() = " + this.getName());
//                flag = false;
//            }
        }
    }
}
