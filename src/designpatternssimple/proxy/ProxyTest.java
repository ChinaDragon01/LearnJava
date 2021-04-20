package designpatternssimple.proxy;

/**
 * 代理模式 http://c.biancheng.net/view/1359.html
 *
 * Java代理模式及其应用 https://blog.csdn.net/justloveyou_/article/details/74203025
 *
 * Java中三种代理方式—— 静态代理与两种动态代理的实现机制  https://blog.csdn.net/wufaliang003/article/details/79305688/
 *
 * 韶关“天街e角”公司是一家婺源特产公司的代理公司，用代理模式实现。
 *
 * 本实例中的“婺源特产公司”经营许多婺源特产，它是真实主题，提供了显示特产的 display() 方法，可以用窗体程序实现（点此下载该实例所要显示的图片）。
 * 而韶关“天街e角”公司是婺源特产公司特产的代理，通过调用婺源特产公司的 display() 方法显示代理产品，当然它可以增加一些额外的处理，如包裝或加价等。客户可通过“天街e角”代理公司间接访问“婺源特产公司”的产品，
 */
public class ProxyTest {
    public static void main(String[] args) {
        SgProxy proxy = new SgProxy();
        proxy.display();
    }
}
