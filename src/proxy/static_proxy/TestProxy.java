package proxy.static_proxy;

/**
 * Java中三种代理方式—— 静态代理与两种动态代理的实现机制
 *https://blog.csdn.net/wufaliang003/article/details/79305688/
 */
public class TestProxy {
    public static void main(String[] args) {

        /*
            静态代理在使用时,需要定义接口或者父类,被代理对象与代理对象一起实现相同的接口或者是继承相同父类.
            静态代理总结:
            1.可以做到在不修改目标对象的功能前提下,对目标功能扩展.
            2.缺点:

            因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
            如何解决静态代理中的缺点呢?答案是可以使用动态代理方式
         */
        PersonDao personDao = new PersonDao();
        PersonDaoProxy proxy = new PersonDaoProxy(personDao);
        proxy.update();



    }
}
