package designpatternssimple.mementoPattern;

/**
 * 备忘录模式
 * http://c.biancheng.net/view/1400.html
 */
//发起人
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
