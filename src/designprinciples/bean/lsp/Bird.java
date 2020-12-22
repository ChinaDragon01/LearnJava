package designprinciples.bean.lsp;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/19 下午4:12
 * Name:鸟类
 * Overview:
 * Usage:
 * 里氏替换原则 Liskov Substitution Principle，简称 LSP  http://c.biancheng.net/view/1324.html
 * *******************************************************
 */
public class Bird {
    double flySpeed;
    public void setSpeed(double speed) {
        flySpeed = speed;
    }
    public double getFlyTime(double distance) {
        return (distance / flySpeed);
    }
}
