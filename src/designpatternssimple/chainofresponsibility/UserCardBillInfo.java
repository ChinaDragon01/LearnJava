package designpatternssimple.chainofresponsibility;

public class UserCardBillInfo extends UserInfo {
    public UserCardBillInfo() {
    }

    public UserCardBillInfo(String userId) {
        this.userId = userId;
    }

    public double Bill;
}
