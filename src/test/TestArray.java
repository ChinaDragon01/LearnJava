package test;

import java.util.ArrayList;

/**
 * **********************************************************************
 * Author: zbl
 * Time: 2020/8/4 15:46
 * Name:
 * Overview:
 * 数组：https://www.jianshu.com/p/64cb20669470
 * Usage:
 * **********************************************************************
 */
public class TestArray {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Object> objects = new ArrayList<>(20);
        arrayList.add("");

        // 一维数组
        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers = new int[]{3, 4};

        int length = numbers.length;
        for (int i = 0; i < length; i++) {
//            System.out.println(numbers[i]);
        }

        //二维数组
        int[][] numbers2 = new int[][]{{1, 2, 3}, {4, 5, 6,7}, {8,9}};
//        int[][] numbers2 = new int[][]{ {4, 5, 6,7},{1, 2, 3}, {8,9}};

        int length1 = numbers2.length;

        int[] tempNumber;
//        for (int i = 0; i < length1; i++) {// 遍历二维数组
//            tempNumber = numbers2[i];
//            for (int i1 = 0; i1 < tempNumber.length; i1++) {
//                System.out.println(numbers2[i][i1]);
//            }
//
//            System.out.println();
//        }

        // 高效遍历二维数组
        for (int i = 0, k = 0; i < numbers2.length; ) {
            System.out.println(numbers2[i][k]);
            k++;
            if (k >= numbers2[i].length) {
                i++;
                k = 0;
                System.out.println();
            }
        }

    }
}
