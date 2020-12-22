package designpatterns.impl;

import designpatterns.baseinterface.Product;
import utils.PrintlnUtils;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/22 上午9:12
 * Name:
 * Overview:
 * Usage:
 * 简单工厂模式 http://c.biancheng.net/view/8385.html
 * *******************************************************
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        PrintlnUtils.println("具体产品1显示...");
    }
}
