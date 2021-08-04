package designpatternssimple.mementoPattern;

//备忘录
/**
 * 备忘录模式
 * http://c.biancheng.net/view/1400.html
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
