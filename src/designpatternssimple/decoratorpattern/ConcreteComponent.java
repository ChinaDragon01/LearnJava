package designpatternssimple.decoratorpattern;

import utils.PrintlnUtils;

public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        PrintlnUtils.println("调用具体构件角色的方法operation()");
    }

    public ConcreteComponent() {
        PrintlnUtils.println("创建具体构件角色");
    }

}
