package algorithm;

import utils.DateUtils;
import utils.PrintlnUtils;

/**
 * 算法
 * https://www.pianshen.com/article/4117623995/
 */
public class TestAlg1 {
    public static void main(String[] args) {
//        test1();
//        test2();

        int FIXED_ITEM_COUNT = 2;
//        String number = Integer.valueOf(FIXED_ITEM_COUNT).toString();
//        String number = Integer.toBinaryString(FIXED_ITEM_COUNT).toString();
        String number = Integer.toOctalString(FIXED_ITEM_COUNT);
        PrintlnUtils.println("number = "+number);

    }

    /**
     * 如何求解1+2+3+....+101
     */
    static void test1() {
        String startTime = DateUtils.timestamp2FormatedStr(System.currentTimeMillis());
        PrintlnUtils.println("test1 startTime = " + startTime);
        long i, sum = 0, n = 500000000l;
        for (i = 1; i <= n; i++) {
            sum = sum + i;
        }

        String endTime = DateUtils.timestamp2FormatedStr(System.currentTimeMillis());
        PrintlnUtils.println("test1 endTime = " + endTime);
        PrintlnUtils.println("test1 sum = " + sum);
        PrintlnUtils.println("=======================================================");
    }

    /**
     * 如何求解1+2+3+....+101
     */
    static void test2() {//高效做法
        String startTime = DateUtils.timestamp2FormatedStr(System.currentTimeMillis());
        PrintlnUtils.println("test2 startTime = " + startTime);
        long i, sum = 0, n = 500000000l;
        sum = (1 + n) * n / 2;
        String endTime = DateUtils.timestamp2FormatedStr(System.currentTimeMillis());
        PrintlnUtils.println("test2 endTime = " + endTime);
        PrintlnUtils.println("test2 sum = " + sum);
    }

    //test1 startTime = 2021-08-11｜09:36:53
    //
    //test1 endTime = 2021-08-11｜09:36:54
    //
    //test1 sum = 125000000250000000
    //
    //=======================================================
    //
    //test2 startTime = 2021-08-11｜09:36:54
    //
    //test2 endTime = 2021-08-11｜09:36:54
    //
    //test2 sum = 125000000250000000
}
