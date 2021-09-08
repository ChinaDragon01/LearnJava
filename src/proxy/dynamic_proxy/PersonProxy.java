package proxy.dynamic_proxy;

import bean.User;
import utils.PrintlnUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * https://blog.csdn.net/wufaliang003/article/details/79305688/
 * 代理类
 * <p>
 * java动态代理Proxy.newProxyInstance
 * https://blog.csdn.net/u012326462/article/details/81293186
 */
public class PersonProxy {
    private User target;
    private InvocationHandler ph;

    public PersonProxy(User target, InvocationHandler ph) {
        this.target = target;
        this.ph = ph;
    }

    public User getPersonProxy() {

        User user = (User) Proxy.newProxyInstance(target.getClass().getClassLoader(), User.class.getInterfaces(), ph);
        return user;
    }

    //如果业务不复杂也可以将InvocationHandler的实现类写入Proxy类中：
    public User getPersonProxy2() {
        User obj = (User) Proxy.newProxyInstance(target.getClass().getClassLoader(), User.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                PrintlnUtils.println("开始事务2");
                //执行目标对象方法

                 target.setName("动态代理修改后的名字");
                Object returnValue = method.invoke(target, args);
                PrintlnUtils.println("提交事务2");
                return returnValue;

            }
        });
        return obj;
    }
}
