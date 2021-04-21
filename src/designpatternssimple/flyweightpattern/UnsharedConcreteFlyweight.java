package designpatternssimple.flyweightpattern;

/**
 * 享元模式 http://c.biancheng.net/view/1371.html
 * 非享元角色
 * 是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中。
 */
public class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
