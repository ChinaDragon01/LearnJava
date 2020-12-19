package impl.isp;

import baseinterface.isp.CountModule;
import baseinterface.isp.InputModule;
import baseinterface.isp.PrintModule;
import bean.isp.Student;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/19 下午3:34
 * Name: 实现类
 * Overview:
 * Usage:
 * 接口隔离原则——面向对象设计原则 http://c.biancheng.net/view/1330.html
 * *******************************************************
 */
public class StuScoreList implements InputModule, CountModule, PrintModule {
    public StuScoreList() {
    }

    public static InputModule getInputModule() {
        return (InputModule) new StuScoreList();
    }

    public static CountModule getCountModule() {
        return (CountModule) new StuScoreList();
    }

    public static PrintModule getPrintModule() {
        return (PrintModule) new StuScoreList();
    }

    public void countTotalScore() {
        System.out.println("统计模块的countTotalScore()方法被调用！");
    }

    public void countAverage() {
        System.out.println("统计模块的countAverage()方法被调用！");
    }

    @Override
    public void printStuInfo(Student student) {
        System.out.println("打印模块的printStuInfo()方法被调用！");

    }

    @Override
    public Student queryStuInfo(String name, int id) {
        System.out.println("打印模块的queryStuInfo()方法被调用！");

        return null;
    }


    @Override
    public void insert(Student student) {
        System.out.println("输入模块的insert()方法被调用！");

    }

    @Override
    public void delete(String name, int id) {
        System.out.println("输入模块的delete()方法被调用！");

    }

    @Override
    public void modify(String name, int id) {
        System.out.println("输入模块的modify()方法被调用！");

    }
}