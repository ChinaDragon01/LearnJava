
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;

/**
 * **********************************************************************
 * Author: zbl
 * Time: 2020/7/29 14:36
 * Name:
 * Overview:
 * Java map集合深入学习：https://blog.csdn.net/qq_37939251/article/details/83480242
 * <p>
 * Map的常见问题:      https://blog.csdn.net/icardi9/article/details/78488853
 * <p>
 * java 自定义排序【Comparator升序降序的记法】：https://blog.csdn.net/u013066244/article/details/78895747
 *
 * 复习一波HashMap底层实现原理解析  https://blog.csdn.net/qq_37840993/article/details/108048597
 *
 * HashMap、Hashtable、HashSet三种hash集合的区别：https://blog.csdn.net/u011109589/article/details/80535412?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-4.edu_weight&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-4.edu_weight
 * Usage:
 * **********************************************************************
 */
public class TestMap {
  /*

     https://www.cnblogs.com/wwb0811/p/9602157.html

    HashMap不能保证元素的顺序,HashMap能够将键设为null，也可以将值设为null。

    与之对应的是Hashtable,(注意大小写：不是HashTable)，Hashtable不能将键和值设为null，否则运行时会报空指针异常错误；

    HashMap线程不安全，Hashtable线程安全

  */


    public static void main(String[] args) {
        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();

        mapTolist();
        traverseMap();
        keySortMap();
        valueSortMap();
        printunmodifiableMap();
        treemapSort();

    }

    static Map<String, String> getStringMap() {
        Map<String, String> map = new HashMap<>();
        map.put("java", "java编程语言");
        map.put("android", "android软件开发");
        map.put("kotlin", "android编程语言");

        return map;
    }

    /**
     * 把Map转换为List
     */
    static void mapTolist() {

        System.out.println("======  mapTolist start ====================================");

        Map<String, String> stringMap = getStringMap();
        ArrayList<Map.Entry<String, String>> entriesList = new ArrayList<>(stringMap.entrySet());
        ArrayList<String> keyList = new ArrayList<>(stringMap.keySet());
        ArrayList<String> valuesList = new ArrayList<>(stringMap.values());

        for (Map.Entry<String, String> entry : entriesList) {
            System.out.println("entriesList  getKey : " + entry.getKey() + "  getValue: " + entry.getValue());
        }

        System.out.println("======  mapTolist ====================================");

        for (String s : keyList) {
            System.out.println("keyList : " + s);
        }

        System.out.println("======  mapTolist ====================================");

        for (String s : valuesList) {
            System.out.println("valuesList : " + s);
        }

        System.out.println("======  mapTolist   end   ====================================");

    }

    /**
     * 遍历(Traverse)map
     */
    static void traverseMap() {
        System.out.println("====== traverseMap  start ====================================");
        Map<String, String> stringMap = getStringMap();

        // 最高效
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println("遍历map  getKey : " + entry.getKey() + "  getValue: " + entry.getValue());
        }

        System.out.println("====== traverseMap ====================================");

        //jdk1.8新特性
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        stringMap.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println("forEach 遍历map  getKey : " + key + "  getValue: " + value);
            }
        });
//        }

        System.out.println("====== traverseMap end  ====================================");
    }

    /**
     * 依据map的key对map排序
     */

    static void keySortMap() {
        System.out.println("====== keySortMap  start ====================================");
        Map<String, String> stringMap = getStringMap();
        ArrayList<Map.Entry<String, String>> entries = new ArrayList<>(stringMap.entrySet());
      /*  Collections.sort(entries, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
//                return o1.getKey().charAt(0) - o2.getKey().charAt(0);
                return o1.getKey().compareTo(o2.getKey());
            }
        });*/

//        Collections.sort(entries,(e1,e2) -> e1.getKey().compareTo(e2.getKey()));

        SortedMap<String, String> sortedMap = new TreeMap<>(new Comparator<String>() {// TreeMap默认对key进行排序
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        sortedMap.putAll(stringMap);


        System.out.println(sortedMap);// [android=android软件开发, java=java编程语言, kotlin=android编程语言]
//        System.out.println(entries);// [android=android软件开发, java=java编程语言, kotlin=android编程语言]

        System.out.println("====== keySortMap  end  ====================================");
    }

    /**
     * 依据map的value值对map排序
     */
    static void valueSortMap() {
        System.out.println("====== valueSortMap  start ====================================");
        Map<String, String> stringMap = getStringMap();
        ArrayList<Map.Entry<String, String>> entries = new ArrayList<>(stringMap.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                System.out.println("compareTo值为：" + (o1.getValue().compareTo(o2.getValue())) + "   o1.getValue：" + o1.getValue() + "  o2.getValue：" + o2.getValue());
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        //compareTo值为：-9   o1.getValue：android软件开发  o2.getValue：java编程语言
        //compareTo值为：-4185   o1.getValue：android编程语言  o2.getValue：android软件开发
        //[kotlin=android编程语言, android=android软件开发, java=java编程语言]

        System.out.println(entries);// [kotlin=android编程语言, android=android软件开发, java=java编程语言]


        System.out.println("====== valueSortMap  end ====================================");
    }

    // 初始化一个不可变的map
    private static Map<Integer, String> unmodifiableMap = new HashMap();

    static {
        unmodifiableMap.put(1, "java");
        unmodifiableMap.put(2, "android");
        unmodifiableMap = Collections.unmodifiableMap(unmodifiableMap);

        /*
             mMap.put(3, "kotlin");

             报错信息：
            java.lang.ExceptionInInitializerError
            Caused by: java.lang.UnsupportedOperationException
         */

    }

    /**
     * 打印不可变的map
     */
    static void printunmodifiableMap() {
        System.out.println("====== printunmodifiableMap  start ====================================");
        for (Map.Entry<Integer, String> entry : unmodifiableMap.entrySet()) {
            System.out.println(" getKey :  " + entry.getKey() + "  getValue ：" + entry.getValue());
        }
        System.out.println("====== printunmodifiableMap  end ====================================");
    }

    //下面是初始化一个不可变的map错误的做法
    //加了final只能确保不能 map1 = new，但是可以修改map1中的元素。
    private static final Map<Integer, Integer> map1 = new HashMap<>();

    static {
        map1.put(8, 9);
        map1.put(88, 99);
    }


    /**
     * 创建一个空map
     */
    static Map crateEmptyMap() {

        // 如果希望该map为不可变的
        return Collections.emptyMap();

        // 否则
//        return new HashMap();

    }


    /**
     * TreeMap排序
     * <p>
     * TreeMap默认按key进行升序排序，如果想改变默认的顺序，可以使用比较器:
     */
    static void treemapSort() {
        System.out.println("====== treemapSort  start ====================================");
        Map<String, String> treeMap = new TreeMap<>();
      /*  Map<String, String> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);//降序排序
            }
        });*/

        treeMap.put("k", "kotlin");
        treeMap.put("j", "java");
        treeMap.put("a", "android");

        for (String key : treeMap.keySet()) {
            System.out.println(key + "  " + treeMap.get(key));
        }

        /*
            a  android
            j  java
            k  kotlin

         */

        /*
            降序排序

            k  kotlin
            j  java
            a  android

         */
        System.out.println("====== treemapSort  end ====================================");

    }
}
