package proxy.dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Java动态代理InvocationHandler和Proxy学习笔记
 * https://blog.csdn.net/yaomingyang/article/details/80981004
 */
public class VehicalInvacationHandler implements InvocationHandler {

    private final IVehical vehical;
    public VehicalInvacationHandler(IVehical vehical){
        this.vehical = vehical;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---------before-------");
        Object invoke = method.invoke(vehical, args);
        System.out.println("---------after-------");
        return invoke;
    }
}
