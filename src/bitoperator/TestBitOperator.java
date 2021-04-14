package bitoperator;

import utils.PrintlnUtils;

/**
 * Java位运算（按位与、按位或、异或）
 * https://blog.csdn.net/qq_33591873/article/details/112694107
 *
 * java中按位异或（XOR）运算
 * https://blog.csdn.net/weixin_39590058/article/details/80085731
 */
public class TestBitOperator {

    /*
        一、位运算
            位即二进制位或bit位

            所有运算到计算中底层中都会变成位运算，位运算可以提高程序的效率,而且我们在研究JDK或者某个框架的源码时，会发现很多地方都用到了位运算！

            例如我们在对数组进行排序时会大量用到交换两个数的值，如何提高排序效率呢

        二、位运算符的种类
                1.&：按位与
                2.|：按位或
                3.^：按位异或
                4.~：按位取反
                5.<<：左移
                6.>>：右移
                7.>>>：无符号右移


        三、常用位运算解析

            1.按位与（&）
                参加运算的两个数，按二进制位进行与运算。
                运算规则：两个数的二进制同为1，结果才为1，否则为0
                负数按照补码形式进行与运算

                即0 & 0 = 0,0 & 1 = 0,1 & 1 = 1

                例如：3 & 5
                0011
                &
                0101
                =
                0001

                所以3&5的值为1


            2.按位或运算符（|）
                参加运算的两个数，按二进制位进行或运算

                运算规则：两个数的二进制只要一个为1就为1

                即0 | 0 = 0,0 | 1 = 1,1 | 1 = 1

                例如：3 | 5
                0011
                |
                0101
                =
                0111

                所以3|5的值为7


            3.异或运算符（^）
                参加运算的两个数，按二进制位进行异或运算

                运算规则：两个数的二进制值不同，结果为1

                即0 ^ 0 = 0,0 ^ 1 = 1,1 ^ 1 = 0

                例如：3 ^ 5
                0011
                ^
                0101
                =
                0110

                所以3^5的值为6

     */

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        exchangeNumByTem(n1, n2);
        exchangeNumByXor(n1, n2);

        boolean flag = false;

        int len = 5;
        for (int i = 0; i < len; i++) {
            flag |= (i == 2);
            PrintlnUtils.println(" i = " + i+"  flag = "+flag);
        }

        //exchangeNumByTem 通过创建第三个临时变量交换 num1 = 5 numb2 = 3
        //
        //exchangeNumByXor 通过按位异或交换 num1 = 5 numb2 = 3

        //i = 0  flag = false
        //
        // i = 1  flag = false
        //
        // i = 2  flag = true
        //
        // i = 3  flag = true
        //
        // i = 4  flag = true

    }

    /**
     * 对数组进行排序时会大量用到交换两个数的值
     * <p>
     * 通过创建第三个临时变量交换
     *
     * @param num1
     * @param numb2
     */
    public static void exchangeNumByTem(int num1, int numb2) {
        //创建第三个临时变量
        int temp = num1;
        num1 = numb2;
        numb2 = temp;
        PrintlnUtils.println("exchangeNumByTem 通过创建第三个临时变量交换 num1 = " + num1 + " numb2 = " + numb2);

    }

    /**
     * 通过按位异或交换  效率要高
     *
     * @param num1
     * @param numb2
     */
    public static void exchangeNumByXor(int num1, int numb2) {
        num1 = num1 ^ numb2;
        numb2 = numb2 ^ num1;
//        numb2 = num1 ^ numb2;
        num1 = num1 ^ numb2;

        PrintlnUtils.println("exchangeNumByXor 通过按位异或交换 num1 = " + num1 + " numb2 = " + numb2);
    }

}
