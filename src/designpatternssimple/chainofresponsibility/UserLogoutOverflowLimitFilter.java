package designpatternssimple.chainofresponsibility;

import utils.PrintlnUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 是否存在溢出款。
 */
public class UserLogoutOverflowLimitFilter extends LimitFilter {
    private List<UserCardDeposit> userCardDepositList = new ArrayList<>();
    @Override
    public boolean doFilter(LogoutLimitFilterChain logoutLimitFilterChain, UserInfo userInfo) {
        PrintlnUtils.println("是否存在溢出款。 UserLogoutOverflowLimitFilter doFilter");

        UserCardDeposit userCardDeposit = findUserCardDeposit(userInfo);
        if (userCardDeposit != null){
            PrintlnUtils.println("该用户 存在溢出款");
            return false;
        }

        if (getLimitFilter() == null) {
            PrintlnUtils.println("当前 userLogoutGiveUpPointsLimitFilter 为空");
            return false;
        }

        return getLimitFilter().doFilter(logoutLimitFilterChain,userInfo);
    }


    public UserCardDeposit findUserCardDeposit(UserInfo userInfo){
        List<UserCardDeposit> userCardDepositList = getUserCardDeposit();
        if (null == userInfo || userCardDepositList == null || userCardDepositList.isEmpty()) {
            return null;
        }

        for (UserCardDeposit userCardDeposit : userCardDepositList) {
            if (!userCardDeposit.userId.isEmpty() && userCardDeposit.userId.equals(userInfo.userId)) {
                return userCardDeposit;
            }
        }

        return null;
    }

    public List<UserCardDeposit> getUserCardDeposit() {
        userCardDepositList.add(new UserCardDeposit("us1"));
        userCardDepositList.add(new UserCardDeposit("us2"));
        userCardDepositList.add(new UserCardDeposit("us3"));
        userCardDepositList.add(new UserCardDeposit("us4"));
        userCardDepositList.add(new UserCardDeposit("us7"));
        return userCardDepositList;
    }

}
