package designpatterns.impl;

import designpatterns.baseinterface.Animal;
import utils.PrintlnUtils;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/22 上午11:35
 * Name:
 * Overview:
 * Usage:
 * *******************************************************
 */
public class Cattle implements Animal {
    @Override
    public void show() {
        PrintlnUtils.println("具体产品：牛类");
    }
}
