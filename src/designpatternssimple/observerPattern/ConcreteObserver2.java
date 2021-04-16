package designpatternssimple.observerPattern;

import utils.PrintlnUtils;

//具体观察者2
public class ConcreteObserver2 implements Observer{
    @Override
    public void response() {

        PrintlnUtils.println("具体观察者 2 作出反应！");

    }
}
