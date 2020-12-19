package bean.lsp;

import java.util.HashMap;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/19 上午10:35
 * Name:
 * Overview:
 * Usage:
 * 里氏替换原则 Liskov Substitution Principle，简称 LSP  http://c.biancheng.net/view/1324.html
 * *******************************************************
 */
public class Parent {

    public void test(HashMap<String, String> hashMap) {
        System.out.println("Father test 方法被执行");
    }
}
