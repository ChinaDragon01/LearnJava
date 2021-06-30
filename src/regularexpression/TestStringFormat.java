package regularexpression;

import utils.PrintlnUtils;

import java.text.MessageFormat;

/**
 * Lua中string.format转义符的使用
 * https://blog.csdn.net/canglangclient/article/details/49154093
 *
 * JAVA字符串格式化-String.format()的使用
 * https://blog.csdn.net/lonely_fireworks/article/details/7962171
 *
 * String.format()的详细用法
 * https://blog.csdn.net/anita9999/article/details/82346552?utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-3.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-3.control
 */
public class TestStringFormat {
    public static void main(String[] args) {
        format1();
    }

    static void format1() {
        String strTemp = "11111 %s 22222 %s 33333";
        String str = String.format(strTemp, "RRRRR", "QQQQQ");
        PrintlnUtils.println("str = " + str);
        //str = 11111 RRRRR 22222 QQQQQ 33333

        String strTemp2 = "1111 {0} 2222 {1} ";
        String str2 = MessageFormat.format(strTemp2, "RRRR", "EEEE");
        PrintlnUtils.println("str2 = " + str2);
        //str2 = 1111 RRRR 2222 EEEE

        String strTemp3 = "你%s的业绩在%s组排名%d, 你战胜了%.2f%%的同部门成员，请继续努力";
        String str3 = String.format(strTemp3, "2021-06-30", "S1", 5, 98.1656);
        PrintlnUtils.println("str3 = " + str3);
        //str3 = 你2021-06-30的业绩在S1组排名, 你战胜了98.17%的同部门成员，请继续努力

        String strTemp4 = "你%1s的业绩在%s组排名%2d, 你战胜了%.2f%%的同部门成员，请继续努力";
        String str4 = String.format(strTemp4, "2021-06-30", "S1", 2, 98.16);
        PrintlnUtils.println("str4 = " + str4);
        //str4 = 你2021-06-30的业绩在S1组排名 2, 你战胜了98.16%的同部门成员，请继续努力

        //$ 被格式化的参数索引
        String strTemp5 = "你%1$s的业绩在%2$s组排名%3$d, 你战胜了%4$.2f%%的同部门成员，请继续努力";
        String str5 = String.format(strTemp5, "2021-06-30", "S1", 2, 98.16);
        PrintlnUtils.println("str5 = " + str5);
        //str5 = 你2021-06-30的业绩在S1组排名2, 你战胜了98.16%的同部门成员，请继续努力

        String strTemp6 = "你{0}的业绩在{1}组排名{2}, 你战胜了{3}%的同部门成员，请继续努力";
        String str6 = MessageFormat.format(strTemp6, "2021-06-30", "S1", 2, 98.16);
        PrintlnUtils.println("str6 = " + str6);
        //str6 = 你2021-06-30的业绩在S1组排名2, 你战胜了98.16%的同部门成员，请继续努力
    }
}
