package designprinciples;

import designprinciples.baseinterface.isp.CountModule;
import designprinciples.baseinterface.isp.InputModule;
import designprinciples.baseinterface.isp.PrintModule;
import designprinciples.bean.dip.Customer;
import designprinciples.bean.dip.Singer;
import designprinciples.bean.isp.Student;
import designprinciples.bean.lod.Agent;
import designprinciples.bean.lod.Company;
import designprinciples.bean.lod.Fans;
import designprinciples.bean.lod.Star;
import designprinciples.bean.lsp.*;
import designprinciples.impl.dip.ChineseSong;
import designprinciples.impl.dip.EnglishSong;
import designprinciples.impl.dip.ShaoguanShop;
import designprinciples.impl.dip.WuyuanShop;
import designprinciples.impl.isp.StuScoreList;

import java.util.HashMap;
import java.util.Map;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/19 上午10:35
 * Name: 测试面向对象设计原则
 * Overview:
 * <p>
 * 面向对象设计原则 https://blog.csdn.net/ChinaDragon10/article/details/111400763
 * <p>
 * 面向对象设计的六大原则 (绝对详细): https://www.cnblogs.com/yeya/p/10655760.html#%E9%87%8C%E6%B0%8F%E6%9B%BF%E6%8D%A2%E5%8E%9F%E5%88%99
 * Usage:
 * *******************************************************
 */
public class TestDesignPrinciples {
    public static void main(String[] args) {

        lsp();
        dip();
        isp();
        lod();
    }

    /**
     * 迪米特法则（Law of Demeter，LoD）又叫作最少知识原则（Least Knowledge Principle，LKP) http://c.biancheng.net/view/1331.html
     */
    static void lod(){

        // 【例1】明星与经纪人的关系实例。
        //分析：明星由于全身心投入艺术，所以许多日常事务由经纪人负责处理，如与粉丝的见面会，与媒体公司的业务洽淡等。
        // 这里的经纪人是明星的朋友，而粉丝和媒体公司是陌生人，所以适合使用迪米特法则

        Agent agent = new Agent();
        agent.setStar(new Star("某某某"));
        agent.setFans(new Fans("粉丝团"));
        agent.setCompany(new Company("中国传媒有限公司"));
        agent.meeting();
        agent.business();

    }

    /**
     * 接口隔离原则（Interface Segregation Principle，ISP）http://c.biancheng.net/view/1330.html
     */
    static void isp() {

        InputModule input = StuScoreList.getInputModule();
        CountModule count = StuScoreList.getCountModule();
        PrintModule print = StuScoreList.getPrintModule();
        Student student = new Student();
        input.insert(student);
        count.countTotalScore();
        Student student1 = print.queryStuInfo("stu1", 1);
        print.printStuInfo(student1);
        //print.delete();

        System.out.println("");
    }

    /**
     * 依赖倒置原则，Dependence Inversion Principle，简称 DIP http://c.biancheng.net/view/1326.html
     */
    static void dip() {

        //面向接口编程，我们的代码就有了更好的扩展性，同时也降低了耦合，提高了系统的稳定性。

        Singer singer = new Singer();
        ChineseSong chineseSong = new ChineseSong();
        EnglishSong englishSong = new EnglishSong();

        singer.sing(chineseSong);
        singer.sing(englishSong);

        System.out.println("");

        Customer wang = new Customer();
        System.out.println("顾客购买以下商品：");
        wang.shopping(new ShaoguanShop());
        wang.shopping(new WuyuanShop());

        System.out.println("");
    }

    /**
     * 里氏替换原则 Liskov Substitution Principle，简称 LSP  http://c.biancheng.net/view/1324.html
     */
    static void lsp() {
        Parent parent = new Parent();
        Son son = new Son();
        HashMap<String, String> hashMap = new HashMap<>();
        Map<String, String> map = new HashMap<>();

        parent.test(hashMap);// Parent test 方法被执行
        System.out.println("");

        // Son类如果不重写重写父类 test方法，
        // Son实例调用 test方法 如果传入参数是 hashMap 则调用的是 Parent 父类 test方法，
        // 如果传入参数是Map, 则调用的是自己的test方法
        son.test(hashMap);//Parent test 方法被执行
        son.test(map);// Son test 方法被执行

        System.out.println("");

        Parent parent1 = new Son();// 父类的引用指向子类的对象
        parent1.test(hashMap);// Parent test 方法被执行

        System.out.println("");

        Bird swallow = new Swallow();
        Bird brownKiwi = new BrownKiwi();
        swallow.setSpeed(120);
        brownKiwi.setSpeed(120);
        System.out.println("如果飞行300公里：");
        try {
            System.out.println("燕子将飞行" + swallow.getFlyTime(300) + "小时.");
            System.out.println("几维鸟将飞行" + brownKiwi.getFlyTime(300) + "小时。");
        } catch (Exception err) {
            System.out.println("发生错误了 err: "+err.toString());
        }

        System.out.println("");
    }
}
