package designpatternssimple.statePattern;

/**
 * 状态模式
 * http://c.biancheng.net/view/1388.html
 * 抽象状态类
 */
public abstract class AbstractState {
    protected ScoreContext hj;  //环境
    protected String stateName; //状态名
    protected int score; //分数

    public abstract void checkState(); //检查当前状态

    public void addScore(int x) {
        score += x;
        System.out.print("加上：" + x + "分，\t当前分数：" + score);
        checkState();
        System.out.println("分，\t当前状态：" + hj.getState().stateName);
    }
}
