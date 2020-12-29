package test;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/29 上午10:51
 * Name:验证活跃线程作为 GC Root
 * Overview:
 * Usage:
 * GC 回收机制与分代回收策略 https://kaiwu.lagou.com/course/courseInfo.htm?courseId=67#/detail/pc?id=1856
 * Java GC日志查看  https://blog.csdn.net/u013613428/article/details/53763925
 * *******************************************************
 */
public class GCRootThread {
    private int _10MB = 10 * 1024 * 1024;
    private byte[] memory = new byte[8 * _10MB];

    public static void main(String[] args) throws Exception {
        System.out.println("开始前内存情况:");
        printMemory();
        AsyncTask at = new AsyncTask(new GCRootThread());
        Thread thread = new Thread(at);
        thread.start();
        System.gc();
        System.out.println("main方法执行完毕，完成GC");
        printMemory();
        thread.join();
        at = null;
        System.gc();
        System.out.println("线程代码执行完毕，完成GC");
        printMemory();

        //开始前内存情况:
        //free is 255 M, total is 258 M,
        //main方法执行完毕，完成GC
        //free is 175 M, total is 258 M,
        //线程代码执行完毕，完成GC
        //free is 15 M, total is 17 M,
    }

    /**
     * 打印出当前JVM剩余空间和总的空间大小
     */
    public static void printMemory() {
        System.out.print("free is " + Runtime.getRuntime().freeMemory()/1024/1024 + " M, ");
        System.out.println("total is " + Runtime.getRuntime().totalMemory()/1024/1024 + " M, ");
    }
    private static class AsyncTask implements Runnable {
        private GCRootThread gcRootThread;
        public AsyncTask(GCRootThread gcRootThread){
            this.gcRootThread = gcRootThread;
        }
        @Override
        public void run() {
            try{
                Thread.sleep(500);
            } catch(Exception e){}
        }
    }
}
