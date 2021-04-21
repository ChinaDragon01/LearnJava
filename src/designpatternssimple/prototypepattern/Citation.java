package designpatternssimple.prototypepattern;

/**
 * 原型模式 http://c.biancheng.net/view/1343.html
 * 奖状类
 */
public class Citation implements Cloneable {
    String name;
    String info;
    String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name + info + college);
    }

    public Citation clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功！");
        return (Citation) super.clone();
    }
}
