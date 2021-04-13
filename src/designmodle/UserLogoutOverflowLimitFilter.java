package designmodle;

/**
 * 是否存在溢出款。
 */
public class UserLogoutOverflowLimitFilter extends LimitFilter {
    @Override
    public boolean doFilter(LogoutLimitFilterChain logoutLimitFilterChain, UserInfo userInfo) {
        return false;
    }
}
