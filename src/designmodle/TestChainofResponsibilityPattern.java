package designmodle;

/**
 * 责任链模式
 * Chain of Responsibility Pattern
 * <p>
 * 如何利用设计模式改善业务代码 https://mp.weixin.qq.com/s/M84JCjLlfx0_wFyRUg16Cg
 * <p>
 * 责任链模式（职责链模式）详解 http://c.biancheng.net/view/1383.html
 * <p>
 * ▐  实践经验
 * 业务流程很简单：
 * <p>
 * 打电话注销信用卡
 * <p>
 * 工作人员注销信用卡
 * <p>
 * 注销信用卡有个背景是这样的，如果信用卡存在账单未还清，存在溢出款，存在特殊年费未使用等情况是不允许注销信用卡的，鉴于此，我们在注销之前加了一套是否允许注销的检验逻辑。
 * <p>
 * <p>
 * <p>
 * 大体如下：
 * <p>
 * 是否存在账单未还清，比如有已出账单未还清，有未出账单未还清，有年费管理费等未还清等。
 * <p>
 * 是否存在溢出款多余的钱。
 * <p>
 * 是否存在高额积分未使用，需用户确认放弃积分等。
 * <p>
 * 针对这几类情况建立了三类过滤器，分别是：
 * <p>
 * UserLogoutUnpaidBillsLimitFilter：是否存在未还清金额。
 * <p>
 * UserLogoutOverflowLimitFilter：是否存在溢出款。
 * <p>
 * UserLogoutGiveUpPointsLimitFilter：是否放弃高额金额。
 * <p>
 * 判断逻辑是先通过UserLogoutUnpaidBillsLimitFilter判断当前用户是否可以注销信用卡。如果允许继续由 UserLogoutOverflowLimitFilter 判断是否存在溢出款，是否可以注销信用卡；如果没有溢出款继续由UserLogoutGiveUpPointsLimitFilter 判断当前用户是否存在高额积分，前面三条判断，只要有一个不满足就提前返回。
 */
public class TestChainofResponsibilityPattern {
    public static void main(String[] args) {

    }

    public boolean canLogout(String userId) {
        //获取用户信息
        UserInfo userInfo = getUserInfo(userId);

        // 构造注销信用卡限制过滤器链条
        LogoutLimitFilterChain filterChain = new LogoutLimitFilterChain();
        filterChain.addFilter(new UserLogoutUnpaidBillsLimitFilter());
        filterChain.addFilter(new UserLogoutOverflowLimitFilter());
        filterChain.addFilter(new UserLogoutGiveUpPointsLimitFilter());
        boolean checkResult = filterChain.doFilter(filterChain, userInfo);
        return checkResult;
    }


    public UserInfo getUserInfo(String userId) {
        return new UserInfo();
    }
}
