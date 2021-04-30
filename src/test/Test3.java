package test;

import utils.PrintlnUtils;

import java.util.Arrays;
import java.util.List;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/17 上午9:19
 * Name:
 * Overview:
 * Usage:
 * *******************************************************
 */
public class Test3 {
    public static void main(String[] args) {

        String[] strArray = {"1", "2", "3"};
        List<String> strList = Arrays.asList(strArray);

      /*  try {
            strList.add("4");
        } catch (Exception e) {
            e.printStackTrace();
        }
      */

        // 解决 UnsupportedOperationException 异常的方法
//        List<String> strList2 = new ArrayList<>(strList);
//        strList2.add("重新添加 4");
//
//        System.out.println("strList2 : " + strList2.toString());
//
//        System.out.println("-----------------");
//
//        List<String> strNewArrayList = new ArrayList<>();
//        strNewArrayList.add("1");
//        strNewArrayList.add("2");
//        strNewArrayList.add("3");
//        strNewArrayList.add("4");

//        System.out.println("strNewArrayList：" + strNewArrayList);

        /*
            regionMatches(int firstStart,String other, int ortherStart,int length)方法用来从当前字符串参数firstStart指定的位置开始处取长度为length的一个子串，
            并将这个子串和参数other指定的一个子串进行比较。其中other指定的子串是指从other字符串的orther字符串的ortherStart所指定的位置开始，开始截取长度为length 的一个子串。
            如果两个字符串相，该方法就返回true,否则返回FALSE，
         */

        //https://www.jianshu.com/p/eb497adf6297?utm_campaign
        String s = "abcdefg";
        String s2 = "Cde";
        boolean b = s.regionMatches(true, 2, s2, 0, s2.length());
        PrintlnUtils.println("b = "+b);//b = true

    }
}
