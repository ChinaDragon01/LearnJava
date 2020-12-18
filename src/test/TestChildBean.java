package test;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/2 9:43 上午
 * Name:
 * Overview:
 * Usage:
 * *******************************************************
 */
public class TestChildBean extends TestBean{


    public static void printTag(){
//        super.printTag(); 子类里不能重写父类的静态方法
        System.out.println("test.TestChildBean 里的 printTag 方法");
    }

}
