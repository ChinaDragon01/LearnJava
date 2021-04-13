package test;

import utils.PrintlnUtils;

import java.util.*;

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



        /*
            {
                        "devId": "FF000000-0000-0038-3000-000000000700-39416",
                        "XXXXXXXXXXXXXXXXXXXX5": "996",
                        "XXXXXXXXXXXXXXXXXXXX4": "996",
                        "XXXXXXXXXXXXXXXXXXXX7": "996",
                        "XXXXXXXXXXXXXXXXXXXX10": "996",
                        "XXXXXXXXXXXXXXXXXXXX6": "996",
                        "XXXXXXXXXXXXXXXXXXXX1": "996",
                        "XXXXXXXXXXXXXXXXXXXX3": "996",
                        "XXXXXXXXXXXXXXXXXXXX2": "996",
                        "devName": "一号主变",
                        "XXXXXXXXXXXXXXXXXXXX9": "996",
                        "XXXXXXXXXXXXXXXXXXXX8": "996"
                    }


         */

        Map<String, String> strMap = new HashMap<>();
        strMap.put("devId", "FF000000-0000-0038-3000-000000000700-39416");
        strMap.put("XXXXXXXXXXXXXXXXXXXX5", "996");
        strMap.put("XXXXXXXXXXXXXXXXXXXX4", "996");
        strMap.put("XXXXXXXXXXXXXXXXXXXX7", "996");
        strMap.put("XXXXXXXXXXXXXXXXXXXX10", "996");
        strMap.put("devName", "一号主变");

        Set<String> strings = strMap.keySet();
        Iterator<String> keyIterator = strings.iterator();
        String key = keyIterator.next();

        Collection<String> values = strMap.values();
        Iterator<String> valuesIterator = values.iterator();
        String value = valuesIterator.next();


        PrintlnUtils.println("key = "+key+" value =  "+value);

    }

    static int add(){
        int a = 1;
        int b = 2;
        int c = a+b;
        return c +10;
    }
}
