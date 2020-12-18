package test;

import java.util.ArrayList;
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
        List<String> strList2 = new ArrayList<>(strList);
        strList2.add("重新添加 4");

        System.out.println("strList2 : " + strList2.toString());

        System.out.println("-----------------");

        List<String> strNewArrayList = new ArrayList<>();
        strNewArrayList.add("1");
        strNewArrayList.add("2");
        strNewArrayList.add("3");
        strNewArrayList.add("4");

        System.out.println("strNewArrayList：" + strNewArrayList);

    }
}
