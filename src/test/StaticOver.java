package test;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/29 上午9:28
 * Name:
 * Overview:
 * Usage:
 * *******************************************************
 */
public class StaticOver {
    private int nubmer;

    public static void main(String[] args) {
        StaticOver staticOver = new StaticOver();

        try {
            staticOver.method();
        } catch (StackOverflowError error) {// 在method方法中，递归调用了自身，并且没有设置递归结束条件
            error.printStackTrace();
            System.out.println("栈容量溢出 nubmer = "+staticOver.nubmer);
            //java.lang.StackOverflowError
            //	at test.StaticOver.method(StaticOver.java:34)
            //	at test.StaticOver.method(StaticOver.java:34)
            //	at test.StaticOver.method(StaticOver.java:34)
            //	at test.StaticOver.method(StaticOver.java:34)
            //...
            //...
            //栈容量溢出 nubmer = 18267

            //原因就是每调用一次method方法时，都会在虚拟机栈中创建出一个栈帧。
            // 因为是递归调用，method方法并不会退出，也不会将栈帧销毁，所以必然会导致StackOverflowError。
            // 因此当需要使用递归时，需要格外谨慎。

        }

    }

    public void method() {
        nubmer++;
        method();
    }
}
