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
 * *******************************************************
 */
public class ConcreteProduct2 implements Product {
    @Override
    public void show() {
        PrintlnUtils.println("具体产品2显示...");

    }
}
