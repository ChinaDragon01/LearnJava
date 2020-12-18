package bean;
/**
 * **********************************************************************
 * Author: zbl
 * Time: 2020/11/17 11:56
 * Name:
 * Overview:
 *  用数组实现的栈，我们叫作顺序栈，用链表实现的栈，我们叫作链式栈。
 *  https://blog.csdn.net/ChinaDragon10/article/details/109441858
 * Usage:
 * **********************************************************************
 */
public class ArrayStack {
    private String[] items;     // 数组
    private int count;          // 栈中元素个数
    private int n;              // 栈的大小

    /**
     * 初始化数组，申请一个大小为n的数组空间
     *
     * @param n
     */
    public ArrayStack(int n) {
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }


    /**
     * 入栈操作
     *
     * @param item
     * @return
     */
    public boolean push(String item) {

        // 数组空间不够了，直接返回false，入栈失败。
        if (count == n) {
            return false;
        }

        // 将item放到下标为count的位置，并且count加一
        items[count] = item;
        ++count;
        return true;

    }

    /**
     * 出栈操作
     *
     * @return
     */
    public String pop() {

        // 栈为空，则直接返回null
        if (count == 0) {
            return null;
        }

        // 返回下标为count-1的数组元素，并且栈中元素个数count减一
        String temp = items[count - 1];
        --count;
        return temp;

    }

    public String[] getItems() {
        return items;
    }

    public int getCount() {
        return count;
    }

    public int getN() {
        return n;
    }
}
