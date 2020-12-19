package bean.lod;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/19 下午11:12
 * Name:粉丝
 * Overview:
 * Usage:
 * 迪米特法则（Law of Demeter，LoD）又叫作最少知识原则（Least Knowledge Principle，LKP) http://c.biancheng.net/view/1331.html
 * *******************************************************
 */
public class Fans {
    private String name;
    public Fans(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
