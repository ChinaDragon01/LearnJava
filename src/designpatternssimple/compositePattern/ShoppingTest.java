package designpatternssimple.compositePattern;

import utils.PrintlnUtils;

/**
 * 组合模式（详解版）
 * http://c.biancheng.net/view/1373.html
 */
public class ShoppingTest {
    public static void main(String[] args) {

        float totalPrice = 0;
        Bags bigBag, mediumBag, smallRedBag, smallWhiteBag;
        Goods sp;
        bigBag = new Bags("大袋子", BagType.BAG_BIG);
        mediumBag = new Bags("中袋子", BagType.BAG_MIDDLE);
        smallRedBag = new Bags("红色小袋子", BagType.BAG_SMALL);
        smallWhiteBag = new Bags("白色小袋子", BagType.BAG_SMALL);
        sp = new Goods("婺源特产", 2, 7.9f);
        smallRedBag.add(sp);
        sp = new Goods("婺源地图", 1, 9.9f);
        smallRedBag.add(sp);
        sp = new Goods("韶关香菇", 2, 68);
        smallWhiteBag.add(sp);
        sp = new Goods("韶关红茶", 3, 180);
        smallWhiteBag.add(sp);
        sp = new Goods("景德镇瓷器", 1, 380);
        mediumBag.add(sp);
        mediumBag.add(smallRedBag);
        sp = new Goods("李宁牌运动鞋", 1, 198);
        bigBag.add(sp);
        bigBag.add(smallWhiteBag);
        bigBag.add(mediumBag);
        System.out.println("您选购的商品有：");
        bigBag.show();
        totalPrice = bigBag.calculation();
        PrintlnUtils.println("要支付的总价是：" + totalPrice + "元");

        try {
            Articles child = bigBag.getChild(20);
            PrintlnUtils.println(" "+child.calculation());
        } catch (IllegalArgumentException e) {
            PrintlnUtils.println(" 获取异常 "+e.toString());
        }


    }
}
