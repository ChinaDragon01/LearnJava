package designpatterns.impl;

import designpatterns.baseinterface.AbstractFactory;
import designpatterns.baseinterface.Product;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/22 上午10:05
 * Name:
 * Overview:
 * Usage:
 * 工厂方法模式 http://c.biancheng.net/view/1348.html
 * *******************************************************
 */
//具体工厂1：实现了厂品的生成方法
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct() {
        return new ConcreteProduct1();
    }
}
