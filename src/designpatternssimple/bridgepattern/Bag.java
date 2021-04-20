package designpatternssimple.bridgepattern;

/**
 * 桥接模式 http://c.biancheng.net/view/1364.html
 * 抽象化角色：包
 *
 *
 * 包类（Bag）是另一个维度，定义为抽象化角色，它有两个扩展抽象化角色：挎包和钱包，它包含了颜色类对象，通过 getName() 方法可以选择相关颜色的挎包和钱包。
 */
abstract public class Bag {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract String getName();
}
