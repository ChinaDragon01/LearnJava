
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * **********************************************************************
 * Author: zbl
 * Time: 2020/8/4 11:49
 * Name:ArrayList和LinkedList增删查改详解
 * Overview:
 *  https://blog.csdn.net/weixin_40219515/article/details/82145752
 * Usage:
 * **********************************************************************
 */
public class TestLinkedList {
    public static void main(String[] args) {
        prilntLinkedList();
    }

    static LinkedList<String> getLinkedList() {

        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("java");
//        linkedList.add("android");
//        linkedList.add("kotlin");
//        linkedList.add("rect_native");
//        linkedList.add("小程序");

        String[] programms = {"java", "android", "hotlin", "rect native", "小程序","spring boot"};

        linkedList = new LinkedList<>(Arrays.asList(programms));

        return linkedList;
    }

    static void prilntLinkedList() {

        LinkedList<String> linkedList = getLinkedList();
        /*int size = linkedList.size();

        for (int i = 0; i < size; i++) {
            System.out.println(linkedList.get(i));
        }
*/
        for (String s : linkedList) {
            System.out.println(s);
        }

    }

    static void printlnArrayList(){
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("china");
        stringList.add("sh");

    }
}
