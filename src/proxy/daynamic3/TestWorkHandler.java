package proxy.daynamic3;

import utils.PrintlnUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 原文链接：https://blog.csdn.net/yaomingyang/article/details/80981004
 */
public class TestWorkHandler {
    public static void main(String[] args) {
        //要代理的真实对象
        People people = new Teacher();
        InvocationHandler invocationHandler = new WorkHandler(people);
//        People proxy = (People) Proxy.newProxyInstance(people.getClass().getClassLoader(), people.getClass().getInterfaces(), invocationHandler);
        People proxy = (People) Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(), people.getClass().getInterfaces(), invocationHandler);
        proxy.setName("测试名");
        PrintlnUtils.println(proxy.work());
//        PrintlnUtils.println(proxy.getName());

    }
}
