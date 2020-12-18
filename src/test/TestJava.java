package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * **********************************************************************
 * Author: zbl
 * Time: 2020/5/28 14:53
 * Name:
 * Overview:
 * Usage:
 * **********************************************************************
 */
public class TestJava {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

       /* for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4) {
                System.out.println(" continue 之前 i = " + i + "  list.get(i) = " + list.get(i));
                continue;
            }
            System.out.println(" i = " + i + "  list.get(i) = " + list.get(i));
        }*/

//        test(list);

        // https://blog.csdn.net/singwhatiwanna/article/details/106580848  5 个刁钻的 String 面试题
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = "ab";
        String s5 = s4 + "c";
        System.out.println("s1 == s2 = " + (s1 == s2) + "  s1.equals(s2) = " + (s1.equals(s2)) + "   s1 == s3  " + (s1 == s3) + "  s1.equals(s3) =  " + (s1.equals(s3)) + "  s1.equals(s5) =  " + (s1.equals(s5)) + "  s1 == s5  =  " + (s1 == s5));
        // s1 == s2 = true  s1.equals(s2) = true   s1 == s3  false  s1.equals(s3) =  true  s1.equals(s5) =  true  s1 == s5  =  false
        // 在Java中==这个符号是比较运算符，它可以基本数据类型和引用数据类型是否相等，如果是基本数据类型，==比较的是值是否相等，如果是引用数据类型，==比较的是两个对象的内存地址是否相等。

        // 字符串不属于8中基本数据类型，字符串对象属于引用数据类型，在上面把“abc”同时赋值给了st1和st2两个字符串对象，指向的都是同一个地址，所以第一个打印语句中的==比较输出结果是 true

        List<String> nameList = getNameList();
        for (String name : nameList) {
            System.out.println("name = " + name);
        }

        getListPerson();
        listRemove();
    }

    public static void test(List<Integer> list) {
        if (list.size() > 0) {
            if (list.get(4) - 2 > 0) {
                if (list.get(6) - 5 > 0) {

                    System.out.println("list.get(6) - 5 = " + (list.get(6) - 5));

                    return;
                }

                System.out.println("list.get(4) - 2 = " + (list.get(4) - 2));
            }
        }

        System.out.println("方法 结束 ");

    }


    //android 如何正确循环删除list中的数据: https://blog.csdn.net/yangjunjin/article/details/99691124

    //删除 List 元素的三种正确方法: https://www.cnblogs.com/cxxjohnson/p/9056834.html
    public static List<String> getNameList() {
        List<String> nameList = new ArrayList<>();
        nameList.add("java");
        nameList.add("android");
        nameList.add("kotlin");
        nameList.add("flutter");

        Iterator<String> iterator = nameList.iterator();
        while (iterator.hasNext()) {
            String tempName = iterator.next();
            System.out.println("tempName = " + tempName);
            if (tempName.equals("java")) {
                iterator.remove();
            }
        }
        return nameList;

    }

    // 使用ListIterator 对List 遍历时添加、修改、删除 https://blog.csdn.net/huaairen/article/details/86687514
    public static List<String> getListPerson() {
        List<String> personList = new ArrayList<>();
        personList.add("p1");
        personList.add("p2");
        personList.add("p3");
        personList.add("p4");
        personList.add("p5");

        ListIterator<String> listIterator = personList.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().equals("p3")) {
                listIterator.set("p_3_p3");
            }
        }

        System.out.println("使用 ListIterator修改后的数据：" + personList);

        return personList;

    }

    public static void listRemove() {
        List<Character> characterList = new ArrayList<>();
        for (char c = 'A'; c <= 'G'; c++) {
            characterList.add(c);
        }

        Iterator<Character> iterator = characterList.iterator();
        while (iterator.hasNext()) {
            char c = iterator.next();
            if (c == 'C') {
                iterator.remove();
            } else {
                System.out.print(c);
                //打印结果：ABDEFG
            }
        }

    }
}
