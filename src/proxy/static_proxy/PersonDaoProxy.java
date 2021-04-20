package proxy.static_proxy;

import utils.PrintlnUtils;

/**
 * 静态 代理对象
 */
public class PersonDaoProxy implements IPersonDao{
    private IPersonDao target;

    public PersonDaoProxy(IPersonDao target) {
        this.target = target;
    }

    @Override
    public void update() {
        PrintlnUtils.println("修改个人信息前记录日志");
        this.target.update();
        PrintlnUtils.println("修改个人信息后记录日志");

    }
}
