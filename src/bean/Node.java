package bean;

/**
 * **********************************************************************
 * Author: zbl
 * Time: 2020/11/17 11:02
 * Name:Java实现单链表反转操作
 * Overview:
 * https://blog.csdn.net/lwkrsa/article/details/82015364
 *
 *         Java单链表反转 详细过程 https://blog.csdn.net/guyuealian/article/details/51119499
 * Usage:
 * **********************************************************************
 */
public class Node {
    private Object data;//数据域
    private Node next;//指针域

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
