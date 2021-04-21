package designpatternssimple.flyweightpattern;

import utils.PrintlnUtils;

/**
 * 享元模式 http://c.biancheng.net/view/1371.html
 * 具体享元角色
 */
public class ConcreteFlyweight implements Flyweight{
    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        PrintlnUtils.println("具体享元" + key + "被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.print("具体享元" + key + "被调用，");
        System.out.println("非享元信息是:" + outState.getInfo());
    }
}
