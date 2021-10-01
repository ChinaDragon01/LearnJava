package utils;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/18 下午4:44
 * Name:
 * Overview:
 * Usage:
 * *******************************************************
 */
public class PrintlnUtils {
    public static void println(String text) {
        System.out.println("    "+text + "\n");
    }

    public static void print(String text) {
        System.out.print(text);
    }

    public static void printl(String text) {
        System.out.println(text);
    }

    public static void println(String text,String flag) {
        System.out.println(text + "\n"+flag);
    }
}
