package algorithm;

import utils.PrintlnUtils;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2021/10/2 下午3:24
 * Name:LRU算法四种实现方式介绍
 * Overview:
 *  https://blog.csdn.net/elricboa/article/details/78847305
 * Usage:
 * *******************************************************
 */
public class LRU<K,V> {
    private static final float hashLoadFactory = 0.75f;
    private LinkedHashMap<K, V> map;
    private int cacheSize;

    public LRU(int cacheSize) {
        this.cacheSize = cacheSize;

        //Math.round()，Math.ceil()，Math.floor()的区别 https://blog.csdn.net/zuihongyan518/article/details/96978200
        int capacity = (int) (Math.ceil(cacheSize / hashLoadFactory) + 1);
        map = new LinkedHashMap<>(capacity, hashLoadFactory, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > cacheSize;
            }
        };
    }

    public synchronized V get(K key) {
        return map.get(key);
    }

    public synchronized void put(K key, V value) {
        map.put(key, value);
    }

    public synchronized void clear() {
        map.clear();
    }

    public synchronized int usedSize() {
        return map.size();
    }

    public void print() {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            PrintlnUtils.println(entry.getValue() + "--");
        }
        System.out.println();
    }

}
