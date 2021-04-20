package proxy.static_proxy;

import utils.PrintlnUtils;

/**
 *
 * 静态代理
 * 目标对象
 */
public class PersonDao implements IPersonDao {
    @Override
    public void update() {
        PrintlnUtils.println("修改个人信息");

    }
}
