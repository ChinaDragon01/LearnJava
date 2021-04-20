package designpatternssimple.bridgepattern;

/**
 * 桥接模式 http://c.biancheng.net/view/1364.html
 * 具体实现化角色：黄色
 */
public class Yellow implements Color{
    @Override
    public String getColor() {
        return "yellow";
    }
}
