package designprinciples.impl.dip;

import designprinciples.baseinterface.dip.Shop;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/19 下午4:22
 * Name:韶关网店
 * Overview:
 * Usage:
 * 依赖倒置原则，Dependence Inversion Principle，简称 DIP http://c.biancheng.net/view/1326.html
 * *******************************************************
 */
public class ShaoguanShop implements Shop {
    @Override
    public String sell() {
        return "韶关土特产：香菇、木耳……";
    }
}
