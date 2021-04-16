package designpatternssimple.observerPattern2;

import java.util.ArrayList;
import java.util.List;

/**
 * http://c.biancheng.net/view/1390.html
 * 汇率（Rate）类是抽象目标类
 */
abstract public class Rate {
    protected List<Company> companys = new ArrayList<Company>();

    //增加观察者方法
    public void add(Company company) {
        companys.add(company);
    }

    //删除观察者方法
    public void remove(Company company) {
        companys.remove(company);
    }

    public abstract void change(int number);
}
