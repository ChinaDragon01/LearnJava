package designpatternssimple.observerPattern2;

/**
 * 具体目标：人民币汇率
 */
public class RMBrate extends Rate {
    @Override
    public void change(int number) {
        for (Company obs : companys) {
            obs.response(number);
        }
    }
}
