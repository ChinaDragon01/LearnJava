package designpatternssimple.observerPattern;

import utils.PrintlnUtils;

//具体观察者1
public class ConcreteObserver1 implements Observer{
    @Override
    public void response() {

        PrintlnUtils.println("具体观察者 1 作出反应！");

    }
}
