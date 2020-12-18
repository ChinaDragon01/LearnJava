package test;

import java.util.*;
import java.util.concurrent.locks.Lock;

public class Test {

    static String text = "kk";
    static StringBuffer sStringBuffer;
    static StringBuilder sStringBuilder;
    static List<String> sStringArrayList = new ArrayList<>();
    static LinkedList<String> sStringLinkedList = new LinkedList<>();
    static Set<String> sStringSet;
    static Map<String,String> sStringStringMap = new HashMap<>();

    static Lock sLock;

    // ThreadLocal原理探究 https://zhuanlan.zhihu.com/p/32584040  https://www.cnblogs.com/luxiaoxun/p/8744826.html
    // https://www.jianshu.com/p/1268e47af4d1
    // 打印函数
    static void print(String str){
        //打印当前线程本地内存中sThreadLocal变量的值
        System.out.println(str + ":" +sThreadLocal.get());

        // 清除当前线程本地内存中sThreadLocal变量 解决 内存泄漏
        sThreadLocal.remove();
    }
    // localVariable 存储本地变量
    static ThreadLocal<String> sThreadLocal = new ThreadLocal<>();


     public volatile int num = 0;

     public static void main(String[] args) {
         int cal = cal(5);
         System.out.println("cal result = "+cal);

         text.intern();

         String a1 = "javabase";
         String a2 = "javabase";
         String a3 = "java"+"base";
         String a4 = new String("javabase");
         String a5 = new String("javabase");

         System.out.println("a1 == a2 : "+(a1 == a2));
         System.out.println("a1 == a3 : "+(a1 == a3));
         System.out.println("a1 == a4 : "+(a1 == a4));
         System.out.println("===================");
         System.out.println("a1.equals(a4) : "+(a1.equals(a4) ));
         System.out.println("a3.equals(a4) : "+(a3.equals(a4) ));
         System.out.println("a4.equals(a5) : "+(a4.equals(a5) ));

         //a1 == a2 : true
         //a1 == a3 : true
         //a1 == a4 : false
         //===================
         //a1.equals(a4) : true
         //a3.equals(a4) : true
         //a4.equals(a5) : true


         Thread1 thread1 = new Thread1();
         Thread2 thread2 = new Thread2();

         thread1.start();

         thread2.start();

         System.out.println(" num = ");

         Test2 test2 = new Test2() {
             @Override
             void getA() {

             }
         };

         test2.getData();

         // Java进制转换原理详解
         // https://blog.csdn.net/zhuozuozhi/article/details/80672737
         short s = 125;

         byte b1 = (byte)s; // b = 125； 125在数据范围内，没有变化

         short s2= 129;

         byte b2 = (byte)s2;

         System.out.println(" b1= "+b1+"  b2 = "+b2);
         //  b1= 125  b2 = -127
         // 由于byte的数值表示范围在-128 - 127，所以s 的值在范围内，能够顺利强转不出错，而s2却出现偏差，


         String simpleName = Test.class.getSimpleName();

         TestBean testBean1 = new TestBean("t1",10);
         TestBean testBean2 = new TestBean("t1",10);
         TestBean testBean3 = testBean1;
         System.out.println(simpleName+" testBean1 == testBean2 "+(testBean1 == testBean2));
         System.out.println(simpleName+" testBean1.equals(testBean2)) "+(testBean1.equals(testBean2)));
         System.out.println(simpleName+" testBean1 == testBean3 "+(testBean1 == testBean3));
         System.out.println(simpleName+" testBean1.equals(testBean3)) "+(testBean1.equals(testBean3)));

         // test.TestBean 没有重写 equals时打印的结果

         // testBean1 == testBean2 false
         // testBean1.equals(testBean2)) false
         // testBean1 == testBean3 true
         // testBean1.equals(testBean3)) true


         // test.TestBean 重写 equals 时打印的结果

         //testBean1 == testBean2 false
         // testBean1.equals(testBean2)) true
         // testBean1 == testBean3 true
         // testBean1.equals(testBean3)) true

         TestChildBean.printTag();// 如果 TestChildBean里没有 printTag方法，则调用的是父类里的printTag

         // 强引用置为null,会不会被回收?
         Object obj = new Object();
         Object obj2 = obj;
         obj = null;

         System.out.println("obj2 = "+obj2);

//         System.gc();

//         System.out.println("obj2 = "+obj2);

     }

    // ，求 1,2,3…n 的累加和
    static int cal(int n){
         int sum = 0;
         int i = 1;

        for (; i <=n; ++i) {
        System.out.println("  i = "+i);
            sum = sum + i;
        }

//        for (; i<= n; i++){
//            sum = sum + i;
//            System.out.println("  i = "+i);
//        }

        return sum;
    }


    static class Thread1 extends Thread{
        @Override
        public void run() {
            super.run();
            sThreadLocal.set(" Thread 1 的变量");
            print("Thread 1 - > ");
            System.out.println("Thread 1 输出："+sThreadLocal.get());

        }
    };

    static class Thread2 extends Thread{
        @Override
        public void run() {
            super.run();
            sThreadLocal.set(" Thread 2 的变量");
            print("Thread 2 - > ");
            System.out.println("Thread 2 输出："+sThreadLocal.get());


        }
    };
}
