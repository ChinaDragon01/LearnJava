package designpatternssimple.chainofresponsibility2;

/**
 * http://c.biancheng.net/view/1383.html
 * 抽象处理者：领导类
 */
abstract public class Leader {
    private Leader next;

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }

    /**
     * 处理请求的方法
     *
     * @param leaveDays 请假天数
     */
    public abstract void handleRequest(int leaveDays);
}
