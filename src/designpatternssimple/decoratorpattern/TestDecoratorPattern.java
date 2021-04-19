package designpatternssimple.decoratorpattern;

import utils.PrintlnUtils;

/**
 * 装饰器模式（装饰设计模式）
 * http://c.biancheng.net/view/1366.html
 */
public class TestDecoratorPattern {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        PrintlnUtils.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
