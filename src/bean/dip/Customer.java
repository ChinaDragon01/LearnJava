package bean.dip;

import baseinterface.dip.Shop;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/19 下午4:24
 * Name:顾客
 * Overview:
 * Usage:
 * 依赖倒置原则，Dependence Inversion Principle，简称 DIP http://c.biancheng.net/view/1326.html
 * *******************************************************
 */
public class Customer {
    public void shopping(Shop shop) {
        //购物
        System.out.println(shop.sell());
    }
}
