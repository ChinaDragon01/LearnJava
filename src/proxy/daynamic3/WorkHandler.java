package proxy.daynamic3;

import utils.PrintlnUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 原文链接：https://blog.csdn.net/yaomingyang/article/details/80981004
 */
public class WorkHandler implements InvocationHandler {
    private Object object;//代理类中的真实对象

    public WorkHandler() {
    }

    //构造函数，给我们的真实对象赋值
    public WorkHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在真实的对象执行之前我们可以添加自己的操作
        PrintlnUtils.println("before invoke。。。");
        Object invoke = method.invoke(object, args);
        //在真实的对象执行之后我们可以添加自己的操作
        PrintlnUtils.println("after invoke。。。");
        return invoke;

    }
}
