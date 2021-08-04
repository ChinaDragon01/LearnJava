package designpatternssimple.mementoPattern;

import utils.PrintlnUtils;

/**
 * 备忘录模式
 * http://c.biancheng.net/view/1400.html
 */
public class MementoPatternTest {
    public static void main(String[] args) {

        Originator originator = new Originator();
        originator.setState("s0");
        PrintlnUtils.println("初始状态:" + originator.getState());

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());//保存状态

        originator.setState("s1");
        PrintlnUtils.println("新的状态:" + originator.getState());

        originator.restoreMemento(caretaker.getMemento());
        PrintlnUtils.println("恢复状态:" + originator.getState());

    }
}
