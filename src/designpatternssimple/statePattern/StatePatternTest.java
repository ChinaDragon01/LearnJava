package designpatternssimple.statePattern;

/**
 * http://c.biancheng.net/view/1388.html
 * 状态模式
 */
public class StatePatternTest {
    public static void main(String[] args) {
        ScoreContext account = new ScoreContext();
        System.out.println("学生成绩状态测试：");
        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25);
    }
}
