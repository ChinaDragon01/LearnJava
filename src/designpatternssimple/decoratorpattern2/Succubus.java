package designpatternssimple.decoratorpattern2;

import utils.PrintlnUtils;

public class Succubus extends Changer{
    public Succubus(Morrigan m) {
        super(m);
    }

    @Override
    public void display() {
        PrintlnUtils.println("Succubus display ");
        setChanger();
        super.display();
    }

    public void setChanger() {
        ((Original) super.m).setImage("Morrigan0.jpg");
    }
}
