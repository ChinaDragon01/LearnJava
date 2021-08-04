package designpatternssimple.iteratorPattern;

/**
 * 迭代器模式
 * http://c.biancheng.net/view/1395.html
 * 抽象迭代器
 */
public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}
