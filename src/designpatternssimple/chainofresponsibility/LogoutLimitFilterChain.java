package designpatternssimple.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class LogoutLimitFilterChain {
    private List<LimitFilter> limitFilterList = new ArrayList<>();

    public void addFilter(LimitFilter limitFilter) {
        limitFilterList.add(limitFilter);
    }

    public boolean doFilter (LogoutLimitFilterChain filterChain, UserInfo userInfo){
        //迭代调用过滤器
        int index = 0;
        if (index < limitFilterList.size()) {
            return limitFilterList.get(index++).doFilter(filterChain, userInfo);
        }
        return true;
    }
}
