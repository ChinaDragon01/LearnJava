package dataalgorithm;

/**
 * https://blog.csdn.net/ChinaDragon10/article/details/109379499
 * 复杂度分析
 *
 * 大 O 复杂度表示法
 */
public class Test01 {
    public static void main(String[] args) {

    }

    //求 1,2,3…n 的累加和
    static int cal(int n) {
        int sum = 0;
        int i = 1;
        for (;1 <= n; ++i){
            sum = sum +i;
        }
        return sum;
    }
    /*
        分析
        假设每行代码执行的时间都一样，为 unit_time，在这个假设的基础之上，这段代码的总执行时间是多少呢？

        第 int sum = 0;int i = 1;两行行代码分别需要 1 个 unit_time 的执行时间，for (;1 <= n; ++i)、 sum = sum +i; 行都运行了 n 遍，所以需要 2n*unit_time 的执行时间，
        所以这段代码总的执行时间就是 (2n+2)*unit_time。可以看出来，所有代码的执行时间 T(n) 与每行代码的执行次数成正比。

        一般情况下，只要算法中不存在循环语句、递归语句，即使有成千上万行的代码，其时间复杂度也是Ο(1)。

        复杂度也叫渐进复杂度，包括时间复杂度和空间复杂度，用来分析算法执行效率与数据规模之间的增长关系，可以粗略地表示，越高阶复杂度的算法，执行效率越低。常见的复杂度并不多，从低阶到高阶有：O(1)、O(logn)、O(n)、O(nlogn)、O(n2 )
     */
}
