package bitoperator;

import utils.PrintlnUtils;

/**
 * Java的位运算符详解实例： 与（&）、非（~）、或（|）、异或（^） https://blog.csdn.net/is_zhoufeng/article/details/8112199?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.control
 * <p>
 * java中的“|=”的使用方法 https://blog.csdn.net/eininotop/article/details/78168577
 * <p>
 * java中的 |=、&=、^= https://www.cnblogs.com/qubaba/p/11558127.html
 * <p>
 * 高位字节、低位字节  https://www.cnblogs.com/cuijl/p/8005741.html
 * <p>
 * java运算符 |=或者&=~处理标志位 运算意义 https://blog.csdn.net/zt011052/article/details/79499924
 *
 * <p>
 * 与运算（&）、或运算（|）、异或运算（^） https://blog.csdn.net/qq_39416311/article/details/102762635?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-3.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-3.control
 *
 * <p>
 * java中int转成String位数不足前面补零  https://blog.csdn.net/u013991521/article/details/55819876?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.control
 */
public class BitOperator {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        String aBinary = Integer.toBinaryString(a);
        String bBinary = Integer.toBinaryString(b);
        PrintlnUtils.println("aBinary = " + aBinary + "  ， bBinary = " + bBinary);// aBinary = 101  ， bBinary = 110

//        String temp = String.format("%06d", 12);//其中0表示补零而不是补空格，6表示至少6位

        PrintlnUtils.println("String.format aBinary: " + aBinary);

        // 高位补全 aBinary = 0000 0101   bBinary = 0000 0110


        // |=
        //具体规则为：两个二进制对应位为0时该位为0，否则为1。拿5的二进制 0000 0101 和 3的二进制 0000 0011 进行|运算，后三位的的对应位都不是同时等于0，所以最终结果为 0000 0111 也就是7的二进制。

//        a |= b;
//        PrintlnUtils.println("a |= b 结果：  a = " + a + "  b = " + b);// a |= b 结果：  a = 7  b = 6


        // &=
        // 具体规则为：两个二进制对应位都为1时，结果为1，否则结果为都0。拿5的二进制 0000 0101 和 3的二进制 0000 0011 进行&运算，只有最后一位都为1，则最终结果为 0000 0001 也就是1的二进制。
//        a &= b;
//        PrintlnUtils.println("a &= b 结果：  a = " + a + "  b = " + b);// a &= b 结果：  a = 4  b = 6

        //^=
        //具体规则为：两个二进制对应位相同时，结果为0，否则结果为1。拿5的二进制 0000 0101 和 3的二进制 0000 0011 进行^运算，1-5位对应位都是0所以1-5位都为0，第8位都为1所以第8位也为0，其他的对应位都不相等所以为1，则最终结果为 0000 0110 也就是6的二进制。
//        a ^= b;
//        PrintlnUtils.println("a ^= b 结果：  a = " + a + "  b = " + b);// a ^= b 结果：  a = 3  b = 6

        //总结
        //|=：两个二进制对应位都为0时，结果等于0，否则结果等于1；
        //
        //&=：两个二进制的对应位都为1时，结果为1，否则结果等于0；
        //
        //^=：两个二进制的对应位相同，结果为0，否则结果为1。

        /*

               1．与运算符
                与运算符用符号“&”表示，其使用规律如下：
                两个操作数中位都为1，结果才为1，否则结果为0

              2．或运算符
                或运算符用符号“|”表示，其运算规律如下：
                两个位只要有一个为1，那么结果就是1，否则就为0

              3．非运算符
                非运算符用符号“~”表示，其运算规律如下：
               如果位为0，结果是1，如果位为1，结果是0

              4．异或运算符
                异或运算符是用符号“^”表示的，其运算规律是：
                两个操作数的位中，相同则结果为0，不同则结果为1

         */


        //
        boolean flag = false;
        int c = 6;
        flag |= (c == b);//在一个循环体中，flag |= (c==b);如果一直不相等，则flag一直为false,一旦有一个相等则为true；

        PrintlnUtils.println("flag = " + flag);// flag = true

        int k = 22;
        int d = 5;
        int r = k / d;
        int h = k % d;
        PrintlnUtils.println(" r = " + r);// r = 4
        PrintlnUtils.println(" h = " + h);// h = 2

        boolean isTag = true;
        // 初始化一个整型
        int mTag = 0;//初始值0000 0000

        // 在来一个标志常量
        int CHANGE_TAG = 0x80; //1000 0000

        if (isTag) {
            mTag |= CHANGE_TAG; //将标志位置1
        } else {
            mTag &= ~CHANGE_TAG; //初始化或者还原标志位0
        }

        PrintlnUtils.println(" mTag = " + mTag);//mTag = 0

    }

    public static String addZeroForNum(String str, int strLength) {
        int strLen = str.length();
        if (strLen < strLength) {
            while (strLen < strLength) {
                StringBuffer sb = new StringBuffer();
                sb.append("0").append(str);//左补0
//    sb.append(str).append("0");//右补0
                str = sb.toString();
                strLen = str.length();
            }
        }

        return str;
    }

    // String str = String.format("%5d", num).replace(" ", "0");
}
