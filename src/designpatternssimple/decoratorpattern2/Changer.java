package designpatternssimple.decoratorpattern2;

/**
 * http://c.biancheng.net/view/1366.html
 * 抽象装饰角色：变形
 */
public class Changer implements Morrigan{
    Morrigan m;
    public Changer(Morrigan m) {
        this.m = m;
    }


    @Override
    public void display() {

    }

}
