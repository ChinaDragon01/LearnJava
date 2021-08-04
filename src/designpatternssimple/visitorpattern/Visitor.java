package designpatternssimple.visitorpattern;

/**
 * http://c.biancheng.net/view/1397.html
 * 访问者模式（Visitor模式）详解
 * 抽象访问者
 */
public interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
