package designpatternssimple.bridgepattern;

/**
 * 桥接模式 http://c.biancheng.net/view/1364.html
 * 扩展抽象化角色：钱包
 */
public class WalletBag extends Bag {
    @Override
    public String getName() {
        return color.getColor() + "WalletBag";
    }
}
