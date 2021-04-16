package designpatternssimple.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * http://c.biancheng.net/view/1390.html
 * 抽象目标
 */
abstract public class Subject {
    protected List<Observer> observerList = new ArrayList<>();

    public void add(Observer observer) {
        observerList.add(observer);
    }

    public void remove(Observer observer) {
        observerList.remove(observer);

    }

    public abstract void notifyObserver(); //通知观察者方法
}
