package designpatternssimple.observerPattern;

/**
 * http://c.biancheng.net/view/1390.html
 */
public class TestObserverPattern {
    public static void main(String[] args) {
        Subject concreteSubject = new ConcreteSubject();
        ConcreteObserver1 concreteObserver1 = new ConcreteObserver1();
        ConcreteObserver2 concreteObserver2 = new ConcreteObserver2();
        concreteSubject.add(concreteObserver1);
        concreteSubject.add(concreteObserver2);

        concreteSubject.notifyObserver();
    }
}
