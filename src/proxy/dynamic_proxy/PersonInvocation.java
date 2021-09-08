package proxy.dynamic_proxy;

import bean.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 */
public class PersonInvocation implements InvocationHandler {
    User target;

    public PersonInvocation(User target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("修改个人信息前记录日志");
        target.setName("动态代理修改后的名字");
        Object invoke = method.invoke(target, args);
        System.out.println("修改个人信息后记录日志");

        return invoke;
    }
}
