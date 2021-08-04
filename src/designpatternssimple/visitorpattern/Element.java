package designpatternssimple.visitorpattern;

/**
 * http://c.biancheng.net/view/1397.html
 * 访问者模式（Visitor模式）详解
 * 抽象元素类
 */
public interface Element {
    void accept(Visitor visitor);
}
