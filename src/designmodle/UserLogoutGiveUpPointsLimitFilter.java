package designmodle;

/**
 * 是否放弃高额金额。
 */
public class UserLogoutGiveUpPointsLimitFilter extends LimitFilter {
    @Override
    public boolean doFilter(LogoutLimitFilterChain logoutLimitFilterChain, UserInfo userInfo) {
        return false;
    }
}
