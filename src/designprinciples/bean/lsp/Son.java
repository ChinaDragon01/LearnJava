package designprinciples.bean.lsp;

import java.util.Map;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/19 上午10:38
 * Name:
 * Overview:
 * Usage:
 * 里氏替换原则 Liskov Substitution Principle，简称 LSP  http://c.biancheng.net/view/1324.html
 * *******************************************************
 */
public class Son extends Parent {

    // 如果不重写重写父类 test方法，
    // Son实例调用 test方法 如果传入参数是 hashMap 则调用的是 Parent 父类 test方法，
    // 如果传入参数是Map, 则调用的是自己的test方法

//    @Override
//    public void test(HashMap<String, String> hashMap) {
//        System.out.println("Son 重写父类 test 方法被执行");
//        super.test(hashMap);
////        System.out.println("Son 重写父类 test 方法被执行");
//    }


    public void test(Map<String, String> map) {
        System.out.println("Son test 方法被执行");
    }
}
