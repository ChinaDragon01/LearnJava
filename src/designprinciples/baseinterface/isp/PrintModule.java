package designprinciples.baseinterface.isp;

import designprinciples.bean.isp.Student;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/19 下午3:31
 * Name: 打印模块接口
 * Overview:
 * Usage:
 * 接口隔离原则——面向对象设计原则 http://c.biancheng.net/view/1330.html
 * *******************************************************
 */
public interface PrintModule {
    void printStuInfo(Student student);

    Student queryStuInfo(String name, int id);
}
