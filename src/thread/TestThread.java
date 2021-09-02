package thread;

import utils.PrintlnUtils;

import java.util.concurrent.atomic.AtomicInteger;

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
 * <p>
 * java-StackTraceElement获取类、方法执行调用栈的详细过程
 * https://blog.csdn.net/lovequanquqn/article/details/81585991
 * **********************************************************************
 */
public class TestThread {
    private static volatile boolean flag = true;
    static AtomicInteger atomicInteger = new AtomicInteger();
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


        int num = 0x8100;
        String strnum = Integer.toString(num);
        int reusltnum = Integer.parseInt(strnum.substring(2), 10);
        PrintlnUtils.println("reusltnum = " + reusltnum+" toBinaryString: "+Integer.toOctalString(2));


//        atomicInteger.set(1);
//        int len = 10;
//        for (int i = len; i > 0; i--) {
//            PrintlnUtils.println("atomicInteger incrementAndGet = " + atomicInteger.incrementAndGet() + " i = " + i);
//        }
//
//        for (int i = 0; i < len; i++) {
//            PrintlnUtils.println("atomicInteger incrementAndGet = " + atomicInteger.decrementAndGet() + " i = " + i);
//        }
//
//
//        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
//        for (int i = 0; i < stackTrace.length; i++) {
//            PrintlnUtils.println(" stackTrace : " + getExtInfo(stackTrace[i]));
//        }


    }

    public static String getExtInfo(StackTraceElement stackTraceElement) {

        String separator = " & ";
        StringBuilder sb = new StringBuilder("[");


        String threadName = Thread.currentThread().getName();
        String fileName = stackTraceElement.getFileName();
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        long threadID = Thread.currentThread().getId();
        int lineNumber = stackTraceElement.getLineNumber();

        sb.append("ThreadId=").append(threadID).append(separator);
        sb.append("ThreadName=").append(threadName).append(separator);
        sb.append("FileName=").append(fileName).append(separator);
        sb.append("ClassName=").append(className).append(separator);
        sb.append("MethodName=").append(methodName).append(separator);
        sb.append("LineNumber=").append(lineNumber);

        sb.append(" ] ");
        return sb.toString();
    }

    static class Thread1 extends Thread {
        @Override
        public void run() {
            super.run();
            //设置线程1中本地变量的值
            localVar.set("localVar1");
            print(this.getName());

            //打印本地变量
            System.out.println(this.getName() + " after remove : " + localVar.get());

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
            System.out.println(this.getName() + " after remove : " + localVar.get());

//            while (flag) {
//                System.out.println("Thread2 this.getName() = " + this.getName());
//                flag = false;
//            }
        }
    }
}
