package thread;

/**
 * **********************************************************************
 * Author: zbl
 * Time: 2019/12/24 16:52
 * Name:  java多线程计算素数   https://blog.csdn.net/lingmao555/article/details/77461495
 * Overview:
 * Usage:
 * **********************************************************************
 */
public class SequentialPrimeFinder extends AbstractPrimeFinder {
    /**
     * 实现父类中的方法
     *
     * @param number
     * @return
     */
    @Override
    public int countPrimes(final int number) {
        return countPrimesInRange(1, number);
    }

    /**
     * 程序主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        //计算的区间为1到10000000
        new SequentialPrimeFinder().timeAndCompute(10000000);
    }

}
