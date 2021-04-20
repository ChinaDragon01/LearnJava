package proxy.dynamic_proxy;

import utils.PrintlnUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * https://blog.csdn.net/wufaliang003/article/details/79305688/
 * 代理类
 */
public class PersonProxy {
    private Object target;
    private InvocationHandler ph;

    public PersonProxy(Object target, InvocationHandler ph) {
        this.target = target;
        this.ph = ph;
    }

    public Object getPersonProxy() {
        Object obj = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), ph);
        return obj;
    }

    //如果业务不复杂也可以将InvocationHandler的实现类写入Proxy类中：
    public Object getPersonProxy2() {
        Object obj = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                PrintlnUtils.println("开始事务2");
                //执行目标对象方法
                Object returnValue = method.invoke(target, args);
                PrintlnUtils.println("提交事务2");
                return returnValue;

            }
        });
        return obj;
    }
}
