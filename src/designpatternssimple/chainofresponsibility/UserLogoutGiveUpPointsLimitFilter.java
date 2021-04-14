package designpatternssimple.chainofresponsibility;

import utils.PrintlnUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 是否放弃高额金额。
 */
public class UserLogoutGiveUpPointsLimitFilter extends LimitFilter {
    private List<UserGiveUpPoints> userGiveUpPointsList = new ArrayList<>();
    @Override
    public boolean doFilter(LogoutLimitFilterChain logoutLimitFilterChain, UserInfo userInfo) {
        PrintlnUtils.println("是否放弃高额金额 UserLogoutGiveUpPointsLimitFilter doFilter");
        //获取放弃高额金额用户
        UserGiveUpPoints userGiveUpPoints = findUserGiveUpPoints(userInfo);
        if (userGiveUpPoints != null) {
            PrintlnUtils.println("该用户 放弃高额金额");
            return false;
        }
        return true;
    }

    public UserGiveUpPoints findUserGiveUpPoints(UserInfo userInfo) {
        List<UserGiveUpPoints> userGiveUpPointsList = getUserGiveUpPoints();
        if (null == userInfo || userGiveUpPointsList == null || userGiveUpPointsList.isEmpty()) {
            return null;
        }

        for (UserGiveUpPoints userCardDeposit : userGiveUpPointsList) {
            if (!userCardDeposit.userId.isEmpty() && userCardDeposit.userId.equals(userInfo.userId)) {
                return userCardDeposit;
            }
        }

        return null;
    }

    public List<UserGiveUpPoints> getUserGiveUpPoints() {
        userGiveUpPointsList.add(new UserGiveUpPoints("us1"));
        userGiveUpPointsList.add(new UserGiveUpPoints("us2"));
        userGiveUpPointsList.add(new UserGiveUpPoints("us3"));
        userGiveUpPointsList.add(new UserGiveUpPoints("us4"));
        userGiveUpPointsList.add(new UserGiveUpPoints("us5"));
        return userGiveUpPointsList;
    }
}
