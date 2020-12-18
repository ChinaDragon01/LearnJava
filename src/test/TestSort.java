package test;

import bean.Node;

/**
 * **********************************************************************
 * Author: zbl
 * Time: 2020/11/3 14:48
 * Name:
 * Overview:
 * Usage:
 * **********************************************************************
 */
public class TestSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 3, 2};
        int[] array = bubbleSort(arr, arr.length);

        for (int i : array) {
            System.out.print(i);
        }

        System.out.println("");

//        String text = "上海自来水来自海上";
        String text = "上海自来来自海";
        String level = "level";
        boolean huiWentext = isHuiWen(text);
        boolean huiWenlevel = isHuiWen(level);
        System.out.println(text+"  是否是回文字符串  huiWentext = " + huiWentext);
        System.out.println(level+"  是否是回文字符串  huiWenlevel = " + huiWenlevel);

        //上海自来来自海  是否是回文字符串  huiWentext = false
        //level  是否是回文字符串  huiWenlevel = true


        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        Node node = reverseListNode(head);
        System.out.println("node.getData() = "+node.getData());
    }


    // 判断是否是回文字符串（Java实现） https://www.cnblogs.com/dongtian/p/5665118.html

    /**
     *
     * @param text
     * @return
     */
    public static boolean isHuiWen(String text) {
        int length = text.length();
        System.out.println("length = "+length+" (length / 2) =  "+(length / 2));
        for (int i = 0; i < length / 2; i++) {
            if (text.toCharArray()[i] != text.toCharArray()[length - i - 1]) {
                return false;
            }
        }
        return true;
    }


    /**
     * @param array 数组
     * @param n     数组大小
     */
    static int[] bubbleSort(int[] array, int n) {

        if (n <= 1) return array;

        // 提前退出冒泡循环的标志位
        boolean flag = false;
        int num = 0;
        for (int i = 0; i < n; i++) {

            // 方法一
          /* for (int k = 0; k < n- 1; k++) {
                num ++;

                if (array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                    flag = true;// 表示有数据交换
                }
            }*/

            // 方法二
            for (int k = 0; k < n - i - 1; k++) {
                num++;

                if (array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                    flag = true;// 表示有数据交换
                }
            }

            if (!flag) {
                break;
            }
        }

        System.out.println(" num = " + num);//方法一  num = 30

//        System.out.println(" num = "+num);//方法二   num = 15

        return array;
    }

    /**
     * Java单链表反转 详细过程
     * https://blog.csdn.net/guyuealian/article/details/51119499
     *
     *
     * Java实现单链表反转操作
     * https://blog.csdn.net/lwkrsa/article/details/82015364
     *
     *
     *  JAVA中的引用
     *  https://www.cnblogs.com/czx1/p/10665327.html
     *
     * @param head
     * @return
     */
    public static Node reverseListNode(Node head){
        //单链表为空或只有一个节点，直接返回原单链表
        if (head == null || head.getNext() == null){
            return head;
        }
        //前一个节点指针
        Node preNode = null;
        //当前节点指针
        Node curNode = head;
        //下一个节点指针
        Node nextNode = null;

        while (curNode != null){
            nextNode = curNode.getNext();//nextNode 指向下一个节点
            curNode.setNext(preNode);//将当前节点next域指向前一个节点
            preNode = curNode;//preNode 指针向后移动
            curNode = nextNode;//curNode指针向后移动
        }

        return preNode;
    }
}
