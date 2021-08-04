package designpatternssimple.iteratorPattern;

/**
 * 迭代器模式
 * http://c.biancheng.net/view/1395.html
 * 抽象聚合
 */
public interface Aggregate {
    void add(Object obj);

    void remove(Object obj);

    Iterator getIterator();
}
