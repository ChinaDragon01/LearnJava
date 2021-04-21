package designpatternssimple.flyweightpattern;

/**
 * 享元模式 http://c.biancheng.net/view/1371.html
 * 抽象享元角色
 */
public interface Flyweight {
    public void operation(UnsharedConcreteFlyweight state);
}
