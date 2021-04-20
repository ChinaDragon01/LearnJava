package designpatternssimple.bridgepattern;

/**
 * 桥接模式 http://c.biancheng.net/view/1364.html
 * 具体实现化角色：红色
 */
public class Red implements Color{
    @Override
    public String getColor() {
        return "red";
    }
}
