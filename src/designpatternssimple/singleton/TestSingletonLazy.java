package designpatternssimple.singleton;

public class TestSingletonLazy {
    public static void main(String[] args) {
//        President president1 = President.getInstance();
//        President president2 = President.getInstance();
//        president1.getName();
//        president2.getName();
//        if (president1 == president2) {
//            PrintlnUtils.println("他们是同一个人");
//        } else {
//            PrintlnUtils.println("他们不是同一个人");
//        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                President.getInstance().getName();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                President.getInstance().getName();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                President.getInstance().getName();
            }
        }).start();

        //产生一个总统！奥巴马 当前线程是：Thread-1
        //
        //产生一个总统！奥巴马 当前线程是：Thread-0
        //
        //产生一个总统！奥巴马 当前线程是：Thread-2
        //
        //我是总统：奥巴马
        //
        //我是总统：奥巴马
        //
        //我是总统：奥巴马
    }
}
