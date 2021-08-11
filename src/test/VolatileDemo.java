package test;

/**
 * https://www.cnblogs.com/54chensongxia/p/11806836.html
 */
public class VolatileDemo {
    private boolean started = false;

    public void startSystem() {
        System.out.println(Thread.currentThread().getName() + " begin to start system, time:" + System.currentTimeMillis());
        started = true;
        System.out.println(Thread.currentThread().getName() + " success to start system, time:" + System.currentTimeMillis());
    }

    public void checkStartes() {
        if (started) {
            System.out.println(Thread.currentThread().getName() + " system is running, time:" + System.currentTimeMillis() + " 已 启动");
        } else {
            System.out.println(Thread.currentThread().getName() + " system is not running, time:" + System.currentTimeMillis() + " xxx 未 启动");
        }
    }

    public static void main(String[] args) {
        VolatileDemo volatileDemo = new VolatileDemo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                volatileDemo.startSystem();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                volatileDemo.checkStartes();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                volatileDemo.checkStartes();
            }
        }).start();

    }


}
