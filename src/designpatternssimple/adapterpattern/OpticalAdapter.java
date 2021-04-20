package designpatternssimple.adapterpattern;

public class OpticalAdapter implements Motor {
    OpticalMotor opticalMotor;

    public OpticalAdapter() {
        this.opticalMotor = new OpticalMotor();
    }

    public OpticalAdapter(OpticalMotor opticalMotor) {
        this.opticalMotor = opticalMotor != null ? opticalMotor : new OpticalMotor();

    }

    @Override
    public void drive() {
        opticalMotor.opticalDrive();
    }
}
