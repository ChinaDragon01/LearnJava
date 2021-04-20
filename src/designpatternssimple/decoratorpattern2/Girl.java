package designpatternssimple.decoratorpattern2;

import utils.PrintlnUtils;

public class Girl extends Changer {
    public Girl(Morrigan m) {
        super(m);
    }

    @Override
    public void display() {
        PrintlnUtils.println("Girl display ");

        setChanger();
        super.display();
    }

    public void setChanger() {
        ((Original) super.m).setImage("Morrigan2.jpg");
    }
}
