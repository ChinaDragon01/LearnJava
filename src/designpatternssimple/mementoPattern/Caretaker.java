package designpatternssimple.mementoPattern;

/**
 * 备忘录模式
 * http://c.biancheng.net/view/1400.html
 */
//管理者
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
