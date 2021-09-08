package proxy.dynamic2;

import java.lang.reflect.Proxy;

/**
 * 原文链接：https://blog.csdn.net/u012326462/article/details/81293186
 */
public class TestIVehical {
    public static void main(String[] args) {
        IVehical car = new Car();
        IVehical vehical = (IVehical) Proxy.newProxyInstance(car.getClass().getClassLoader(), Car.class.getInterfaces(), new VehicalInvacationHandler(car));
        vehical.run();
    }

}
