package designpatterns.baseinterface;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/22 上午10:03
 * Name:
 * Overview:
 * Usage:
 * 工厂方法模式 http://c.biancheng.net/view/1348.html
 * *******************************************************
 */
//抽象工厂：提供了厂品的生成方法
public interface AbstractFactory {
    Product newProduct();
}
