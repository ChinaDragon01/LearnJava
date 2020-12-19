package bean.lsp;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/19 下午4:13
 * Name:几维鸟类
 * Overview:
 * Usage:
 * 里氏替换原则 Liskov Substitution Principle，简称 LSP  http://c.biancheng.net/view/1324.html
 * *******************************************************
 */
public class BrownKiwi extends Bird {
    public void setSpeed(double speed) {
        flySpeed = 0;//新西兰的几维鸟由于翅膀退化无法飞行
    }
}
