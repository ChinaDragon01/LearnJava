package equals;

import bean.DogBean;
import utils.PrintlnUtils;

/**
 * **********************************************************************
 * Author: ChinaDragon
 * Time: 2020/8/3 17:12
 * Name:
 * Overview:
 *
 *  优美的讲解equals和==的区别 https://blog.csdn.net/qq_36522306/article/details/80550210?utm_medium=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromBaidu-1.control&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromBaidu-1.control
 *
 *  在java中==和equals()的区别 https://blog.csdn.net/lcsy000/article/details/82782864
 *
 *  浅谈Java中equals（）和==的区别 https://blog.csdn.net/qq_38162448/article/details/81611894
 *
 *  Java中equals和==的区别 https://www.cnblogs.com/limeiky/p/4831992.html  https://www.cnblogs.com/zhxhdean/archive/2011/03/25/1995431.html
 *
 * java：String使用equals和==比较的区别：https://blog.csdn.net/weixin_42476601/article/details/88659715
 * Usage:
 * **********************************************************************
 */
public class TestEquals {

    public static void main(String[] args) {

        // 把 abc 存入常量池中
        String s1 = "abc";
        // 从 常量池中找 abc
        String s2 = "abc";
        String s3 = s1;
        String s4 = new String("abc");
        String s5 = new String("abc");

        // DogBean里没有重写 equals 方法
        // Object 类里的 equals 方法 也是是调用 == 进行比较
        DogBean dogBean1 = new DogBean("旺旺");
        DogBean dogBean2 = new DogBean("旺旺");
        DogBean dogBean3 = dogBean1;

        PrintlnUtils.println("s1 hashCode：" + s1.hashCode() + ",  s2.hashCode： " + s2.hashCode() + ",  s3.hashCode： " + s3.hashCode() + ",  s4.hashCode： " + s4.hashCode() + ",  s5.hashCode： " + s5.hashCode());
        PrintlnUtils.println("s1 identityHashCode：" + System.identityHashCode(s1) + ", s2 identityHashCode：" + System.identityHashCode(s2) + ", s3 identityHashCode：" + System.identityHashCode(s3) + ",  s4 identityHashCode：" + System.identityHashCode(s4) + ", s5 identityHashCode：" + System.identityHashCode(s5));
        PrintlnUtils.println("s1 == s2 : " + (s1 == s2) + ",  s1 == s3 ： " + (s1 == s3) + ", s1 == s4 ：" + (s1 == s4) + ", s4 == s5 " + (s4 == s5));
        PrintlnUtils.println("s1.equals(s2)：" + s1.equals(s2) + ",  s1.equals(s3)：" + s1.equals(s3) + ",  s1.equals(s4)：" + s1.equals(s4) + ",  s4.equals(s5)：" + s4.equals(s5));

        PrintlnUtils.println("dogBean1.hashCode: "+dogBean1.hashCode()+", dogBean2.hashCode: "+dogBean2.hashCode()+", dogBean3.hashCode: "+dogBean3.hashCode());
        PrintlnUtils.println("dogBean1 identityHashCode："+System.identityHashCode(dogBean1)+"，dogBean2 identityHashCode: "+System.identityHashCode(dogBean2)+"，dogBean3 identityHashCode: "+System.identityHashCode(dogBean3));
        PrintlnUtils.println("dogBean1 == dogBean2 : "+(dogBean1 == dogBean2)+", dogBean1 == dogBean3: "+(dogBean1 == dogBean3));
        PrintlnUtils.println("dogBean1.equals(dogBean2) : "+dogBean1.equals(dogBean2)+", dogBean1.equals(dogBean3): "+dogBean1.equals(dogBean3));

        /*
            java怎么打印一个对象的内存地址:  https://blog.csdn.net/minolk/article/details/81873611

            在Java一般使用HashCode来代表对象的地址，但是两个相同的对象就不行了，两个相同的对象的hashcode是相同的。
            如果要对比两个相同的对象的地址可以使用，System.identityHashCode(传输进去的参数是一个对象)
         */

        //s1 hashCode：96354,  s2.hashCode： 96354,  s3.hashCode： 96354,  s4.hashCode： 96354,  s5.hashCode： 96354
        //
        //s1 identityHashCode：1747585824, s2 identityHashCode：1747585824, s3 identityHashCode：1747585824,  s4 identityHashCode：1023892928, s5 identityHashCode：558638686
        //
        //s1 == s2 : true,  s1 == s3 ： true, s1 == s4 ：false, s4 == s5 false
        //
        //s1.equals(s2)：true,  s1.equals(s3)：true,  s1.equals(s4)：true,  s4.equals(s5)：true
        //
        //dogBean1.hashCode: 381259350, dogBean2.hashCode: 2129789493, dogBean3.hashCode: 381259350
        //
        //dogBean1 identityHashCode：381259350，dogBean2 identityHashCode: 2129789493，dogBean3 identityHashCode: 381259350
        //
        //dogBean1 == dogBean2 : false, dogBean1 == dogBean3: true
        //
        //dogBean1.equals(dogBean2) : false, dogBean1.equals(dogBean3): true

    }

    /*
         "=="操作符的作用

            1、用于基本数据类型的比较

            2、判断引用是否指向堆内存的同一块地址。

     */


}
