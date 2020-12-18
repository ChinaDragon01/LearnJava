
import java.util.HashSet;
import java.util.Iterator;

/**
 * **********************************************************************
 * Author: zbl
 * Time: 2020/8/4 9:37
 * Name:
 * Overview:
 * HashMap和HashSet的区别：https://blog.csdn.net/chen213wb/article/details/84647179
 * 深入理解HashSet:  https://blog.csdn.net/Sugar_Rainbow/article/details/68257208?utm_medium=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromMachineLearnPai2-1.edu_weight&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromMachineLearnPai2-1.edu_weight
 * Usage:
 * **********************************************************************
 */
public class TestHashSet {

    public static void main(String[] args) {

        printlnHashSet();
    }

    /*
        HashSet实现Set接口，由哈希表（实际上是一个HashMap实例）支持。它不保证set 的迭代顺序；特别是它不保证该顺序恒久不变，此类允许使用null元素。
        在HashSet中，元素都存到HashMap键值对的Key上面，而Value时有一个统一的值private static final Object PRESENT = new Object();
     */
    static HashSet<String> getHashSet() {
        HashSet hashSet = new HashSet<String>();
        hashSet.add("android");
        hashSet.add("java");
        hashSet.add("kotlin");
        return hashSet;
    }

    static void printlnHashSet() {
        HashSet<String> hashSet = getHashSet();
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next() ： " + iterator.next());
        }
    }

}
