package designpatternssimple.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式
 * http://c.biancheng.net/view/1395.html
 * 具体聚合
 */
public class ConcreteAggregate implements Aggregate{
    private List<Object> list = new ArrayList<Object>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
