package designmodle;

import java.util.ArrayList;
import java.util.List;

/**
 * 是否存在未还清金额
 */
public class UserLogoutUnpaidBillsLimitFilter extends LimitFilter {
    private List<UserCardBillInfo> userCardBillInfoList = new ArrayList<>();

    public UserLogoutUnpaidBillsLimitFilter() {
    }

    @Override
    public boolean doFilter(LogoutLimitFilterChain logoutLimitFilterChain, UserInfo userInfo) {
        //获取用户当前欠款金额
        UserCardBillInfo userCardBillInfo = findUserCardBillInfo(userInfo);
        if (userCardBillInfo == null) {
            return false;
        }
        return true;
    }

    public UserCardBillInfo findUserCardBillInfo(UserInfo userInfo) {

        List<UserCardBillInfo> userCardBillInfoList = getUserCardBillInfoList();

        if (null == userInfo || userCardBillInfoList == null || userCardBillInfoList.isEmpty()) {
            return null;
        }

        for (UserCardBillInfo userCardBillInfo : userCardBillInfoList) {
            if (!userCardBillInfo.userId.isEmpty() && userCardBillInfo.userId.equals(userInfo.userId)) {
                return userCardBillInfo;
            }
        }

        return null;
    }

    public List<UserCardBillInfo> getUserCardBillInfoList() {
        userCardBillInfoList.add(new UserCardBillInfo("us1"));
        userCardBillInfoList.add(new UserCardBillInfo("us2"));
        userCardBillInfoList.add(new UserCardBillInfo("us3"));
        userCardBillInfoList.add(new UserCardBillInfo("us4"));
        return userCardBillInfoList;
    }


}
