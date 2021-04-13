package designmodle;

abstract public class LimitFilter {
    private LimitFilter limitFilter;

    public LimitFilter getLimitFilter() {
        return limitFilter;
    }

    public void setLimitFilter(LimitFilter limitFilter) {
        this.limitFilter = limitFilter;
    }

    abstract public boolean doFilter(LogoutLimitFilterChain logoutLimitFilterChain, UserInfo userInfo);
}
