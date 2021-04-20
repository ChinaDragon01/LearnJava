package designpatternssimple.adapterpattern;

import utils.PrintlnUtils;

/**
 * 适配器模式 http://c.biancheng.net/view/1361.html
 * 适配者1：电能发动机
 */
public class ElectricMotor {
    public void electricDrive(){
        PrintlnUtils.println("电能发动机驱动汽车！");
    }
}
