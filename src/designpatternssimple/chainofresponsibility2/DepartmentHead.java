package designpatternssimple.chainofresponsibility2;

import utils.PrintlnUtils;

/**
 * http://c.biancheng.net/view/1383.html
 * 具体处理者2：系主任类
 */
public class DepartmentHead extends Leader{
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 7){
            PrintlnUtils.println("系主任批准您请假" + leaveDays + "天。");
            return;
        }

        if (getNext() != null) {
            getNext().handleRequest(leaveDays);
        }else {
            PrintlnUtils.println("请假天数太多，没有人批准该假条！");
        }
    }
}
