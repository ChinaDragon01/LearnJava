
/**
 * **********************************************************************
 * Author: zbl
 * Time: 2020/7/31 9:02
 * Name:
 * Overview:
 * Usage:
 * **********************************************************************
 */
public class TestThread {
    private static volatile boolean flag = true;

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();

    }

    static class Thread1 extends Thread {
        @Override
        public void run() {
            super.run();
            while (flag) {
                System.out.println("Thread1 this.getName() = " + this.getName());
            }
        }
    }

    static class Thread2 extends Thread {
        @Override
        public void run() {
            super.run();
            while (flag) {
                System.out.println("Thread2 this.getName() = " + this.getName());
                flag = false;
            }
        }
    }
}
