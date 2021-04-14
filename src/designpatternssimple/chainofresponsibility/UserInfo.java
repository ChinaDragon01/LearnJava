package designpatternssimple.chainofresponsibility;

public class UserInfo {
    public UserInfo() {
    }

    public UserInfo(String userId) {
        this.userId = userId;
    }

    public String userId;
    public int state;
}
