package designpatternssimple.adapterpattern;

import utils.PrintlnUtils;

/**
 * 适配器模式 http://c.biancheng.net/view/1361.html
 * 适配者2：光能发动机
 */
public class OpticalMotor {
    public void opticalDrive()
    {
        PrintlnUtils.println("光能发动机驱动汽车！");
    }
}
