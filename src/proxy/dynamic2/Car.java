package proxy.dynamic2;

import utils.PrintlnUtils;

public class Car implements IVehical{
    @Override
    public void run() {
        PrintlnUtils.println("Car会跑");
    }
}
