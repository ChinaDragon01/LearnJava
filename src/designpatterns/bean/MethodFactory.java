package designpatterns.bean;

import designpatterns.baseinterface.Product;
import designpatterns.impl.ConcreteProduct1;
import designpatterns.impl.ConcreteProduct2;

/**
 * *******************************************************
 * Author: chinadragon
 *  * Time: 2020/12/22 上午11:20
 *  * Name:
 *  * Overview:
 *  * Usage:
 *  工厂方法模式 http://c.biancheng.net/view/1348.html
 * *******************************************************
 */
public class MethodFactory {

//    public static Product makeProudct1(){
//        return new ConcreteProduct1();
//    }
//
//    public static Product makeProudct2(){
//        return new ConcreteProduct2();
//    }

    // 静态工厂方法
    public static Product makeProudct1(){
        return new ConcreteProduct1();
    }

    public static Product makeProudct2(){
        return new ConcreteProduct2();
    }
}
