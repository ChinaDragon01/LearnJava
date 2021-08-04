package designpatternssimple.compositePattern;

import utils.PrintlnUtils;

/**
 * 组合模式（详解版）
 * http://c.biancheng.net/view/1373.html
 * <p>
 * 树叶构件：商品
 */
public class Goods implements Articles {
    private String name;//名字
    private int quantity;//数量
    private float unitPrice;//单价

    public Goods(String name, int quantity, float unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public float calculation() {
        return quantity * unitPrice;
    }

    @Override
    public void show() {

        PrintlnUtils.println(name + "(数量：" + quantity + "，单价：" + unitPrice + "元)");

    }
}
