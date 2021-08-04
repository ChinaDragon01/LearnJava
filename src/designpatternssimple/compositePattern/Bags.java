package designpatternssimple.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式（详解版）
 * http://c.biancheng.net/view/1373.html
 * <p>
 * 树叶构件：袋子
 */
public class Bags implements Articles {
    private String name;
    private List<Articles> articlesList = new ArrayList<>();
    private int mBagType;

    public Bags(String name, @BagType int bagType) {
        this.name = name;
        this.mBagType = bagType;
    }

    public boolean add(Articles articles) {
        if (articles == null) {
            return false;
        }

        return articlesList.add(articles);
    }

    public boolean remove(Articles articles) {
        if (articles == null) {
            return false;
        }

        return articlesList.remove(articles);
    }

    public Articles getChild(int i) {
        if (i < 0 || i >= articlesList.size()) {

            throw new IllegalArgumentException(i + " 是非法数字");
        }

        return articlesList.get(i);
    }

    @Override

    public float calculation() {

        float totalPrice = 0;

        for (Articles articles : articlesList) {
            totalPrice += articles.calculation();
        }

        if (BagType.BAG_BIG == mBagType) {
            return totalPrice + 3;
        }

        if (BagType.BAG_MIDDLE == mBagType) {
            return totalPrice + 2;
        }

        if (BagType.BAG_SMALL == mBagType) {
            return totalPrice + 1;
        }
        
        return totalPrice;
    }

    @Override
    public void show() {//购物清单
        for (Articles articles : articlesList) {
            articles.show();
        }
    }
}
