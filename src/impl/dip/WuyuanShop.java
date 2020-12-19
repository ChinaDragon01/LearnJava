package impl.dip;

import baseinterface.dip.Shop;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/19 下午4:23
 * Name:婺源网店
 * Overview:
 * Usage:
 * 依赖倒置原则，Dependence Inversion Principle，简称 DIP http://c.biancheng.net/view/1326.html
 * *******************************************************
 */
public class WuyuanShop implements Shop {
    @Override
    public String sell() {
        return "婺源土特产：绿茶、酒糟鱼……";
    }
}
