package designpatternssimple.adapterpattern;

/**
 * 适配器模式 http://c.biancheng.net/view/1361.html
 * 电能适配器
 */
public class ElectricAdapter implements Motor {
    private ElectricMotor electricMotor;

    public ElectricAdapter() {
        this.electricMotor =  new ElectricMotor();
    }

    public ElectricAdapter(ElectricMotor electricMotor) {
        this.electricMotor = electricMotor != null ? electricMotor : new ElectricMotor();
    }

    @Override
    public void drive() {
        electricMotor.electricDrive();
    }
}
