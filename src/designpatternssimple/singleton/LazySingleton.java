package designpatternssimple.singleton;

/**
 *
 * 懒汉式单例
 * http://c.biancheng.net/view/1338.html
 *
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null;//保证在所有线程同步

    public static synchronized LazySingleton getInstance() {//方法前加同步

        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;

    }
}
