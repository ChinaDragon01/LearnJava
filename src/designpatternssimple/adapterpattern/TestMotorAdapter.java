package designpatternssimple.adapterpattern;

import utils.PrintlnUtils;

/**
 * 适配器模式 http://c.biancheng.net/view/1361.html
 *
 * 用适配器模式（Adapter）模拟新能源汽车的发动机。
 *
 * 分析：新能源汽车的发动机有电能发动机（Electric Motor）和光能发动机（Optical Motor）等，各种发动机的驱动方法不同，例如，电能发动机的驱动方法 electricDrive() 是用电能驱动，而光能发动机的驱动方法 opticalDrive() 是用光能驱动，它们是适配器模式中被访问的适配者。
 *
 * 客户端希望用统一的发动机驱动方法 drive() 访问这两种发动机，所以必须定义一个统一的目标接口 Motor，然后再定义电能适配器（Electric Adapter）和光能适配器（Optical Adapter）去适配这两种发动机。
 */
public class TestMotorAdapter {
    public static void main(String[] args) {
        PrintlnUtils.println("适配器模式测试：");
        Motor motor=(Motor)ReadXML.getObject();
        motor.drive();
    }
}
