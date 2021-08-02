package designpatternssimple.singleton;

/**
 * 饿汉式单例
 * http://c.biancheng.net/view/1338.html
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }
}
