package test;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/28 下午9:51
 * Name:
 * Overview:
 * Usage:
 * javap -v java字节码解释 https://blog.csdn.net/cc_yuuuu/article/details/87857760
 *  IDEA看字节码文件 https://www.cnblogs.com/woyujiezhen/p/13513865.html
 *
 *  Hex Fiend – 十六进制编辑 [Mac] https://blog.csdn.net/dfman1978/article/details/73499040
 *
 *  Synalyze It! Pro  十六进制编辑
 *
 *  终端输入： javap -c TestJavap.class
 * *******************************************************
 */
public class TestJavap {
    public static void main(String[] args) {
        add();
    }

    static int add(){
        int a = 1;
        int b = 2;
        int c = a+b;
        return c +10;
    }
}
