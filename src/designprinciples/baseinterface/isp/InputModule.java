package designprinciples.baseinterface.isp;

import designprinciples.bean.isp.Student;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/19 下午3:30
 * Name: 输入模块接口
 * Overview:
 * Usage:
 * 接口隔离原则——面向对象设计原则 http://c.biancheng.net/view/1330.html
 * *******************************************************
 */
public interface InputModule {
    void insert(Student student);

    void delete(String name, int id);

    void modify(String name, int id);
}
