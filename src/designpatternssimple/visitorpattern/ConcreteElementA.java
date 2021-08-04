package designpatternssimple.visitorpattern;

/**
 * http://c.biancheng.net/view/1397.html
 * 访问者模式（Visitor模式）详解
 * 具体元素A类
 */
public class ConcreteElementA implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体元素A的操作。";
    }
}
