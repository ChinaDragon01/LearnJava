package designpatterns.bean;

import designpatterns.baseinterface.Product;
import designpatterns.constants.Constants;
import designpatterns.impl.ConcreteProduct1;
import designpatterns.impl.ConcreteProduct2;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/22 上午9:19
 * Name:
 * Overview:
 * Usage:
 *
 * 简单工厂模式 http://c.biancheng.net/view/8385.html
 * *******************************************************
 */
public class SimpleFactory {

    public static Product makeProudct(int type) {
        switch (type) {
            case Constants.PRODUCT_1:
                return new ConcreteProduct1();
            case Constants.PRODUCT_2:
                return new ConcreteProduct2();
        }

        return null;

    }
}
