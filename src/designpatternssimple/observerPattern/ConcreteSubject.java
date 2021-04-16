package designpatternssimple.observerPattern;

import utils.PrintlnUtils;

/**
 * http://c.biancheng.net/view/1390.html
 * 具体目标
 */
public class ConcreteSubject extends Subject{
    @Override
    public void notifyObserver() {
        PrintlnUtils.println("具体目标发生改变...");
        PrintlnUtils.println("____________________________");
        for (Observer observer : observerList) {
            observer.response();
        }
    }
}
