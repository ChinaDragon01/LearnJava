package designpatternssimple.statePattern;

/**
 * 状态模式
 * http://c.biancheng.net/view/1388.html
 * 具体状态类：优秀
 */
public class HighState extends AbstractState {
    public HighState(AbstractState state) {
        hj = state.hj;
        stateName = "优秀";
        score = state.score;
    }
    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score < 90) {
            hj.setState(new MiddleState(this));
        }
    }
}
