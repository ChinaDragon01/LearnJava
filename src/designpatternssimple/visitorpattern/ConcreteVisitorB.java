package designpatternssimple.visitorpattern;

/**
 * http://c.biancheng.net/view/1397.html
 * 访问者模式（Visitor模式）详解
 * 具体访问者B类
 */
public class ConcreteVisitorB implements Visitor{
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者B访问-->" + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者B访问-->" + element.operationB());
    }
}
