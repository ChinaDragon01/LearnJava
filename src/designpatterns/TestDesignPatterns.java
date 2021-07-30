package designpatterns;

import designpatterns.baseinterface.AbstractFactory;
import designpatterns.baseinterface.Animal;
import designpatterns.baseinterface.AnimalFarm;
import designpatterns.baseinterface.Product;
import designpatterns.bean.MethodFactory;
import designpatterns.bean.SimpleFactory;
import designpatterns.constants.Constants;
import designpatterns.impl.ConcreteFactory2;
import designpatterns.impl.HorseFarm;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/22 上午9:37
 * Name:
 * Overview:
 * Usage:
 * <p>
 * 面向对象设计原则
 * https://blog.csdn.net/ChinaDragon10/article/details/111400763
 * <p>
 * GoF 的 23 种设计模式的分类和功能
 * http://c.biancheng.net/view/1320.html
 * *******************************************************
 */
public class TestDesignPatterns {
    public static void main(String[] args) {

        abstractFactory();
        methodFactory();
        simpleFactory();
    }


    /**
     *  抽象工厂模式 http://c.biancheng.net/view/1348.html
     *
     *  抽象工厂模式 https://www.jianshu.com/p/b96b37e8b760
     */
    private static void abstractFactory() {

        AbstractFactory concreteFactory2 = new ConcreteFactory2();
        Product product = concreteFactory2.newProduct();
        product.show();

        AnimalFarm horseFarm = new HorseFarm();
        Animal animal = horseFarm.newAnimal();
        animal.show();

    }

    /**
     * 工厂方法模式 https://www.jianshu.com/p/b96b37e8b760
     */
    private static void methodFactory() {
        Product product = MethodFactory.makeProudct1();
        product.show();

    }

    /**
     * 简单工厂模式 http://c.biancheng.net/view/8385.html
     */
    private static void simpleFactory() {
        Product product = SimpleFactory.makeProudct(Constants.PRODUCT_1);
        product.show();
    }
}
