package designpatternssimple.strategypattern;

import utils.PrintlnUtils;

import java.math.BigDecimal;

/**
 * 策略设计模式 https://mp.weixin.qq.com/s/M84JCjLlfx0_wFyRUg16Cg
 * 策略模式（Strategy Pattern）是定义了一组算法，将每个算法都封装起来，并且使它们之间可以互换。
 *
 * 策略模式（策略设计模式）详解 http://c.biancheng.net/view/1378.html
 *
 *
 *
 * ▐  适用场景
 * 主要是为了消除大量的 if else 代码，将每种判断背后的算法逻辑提取到具体的策略对象中，当算法逻辑修改时对使用者无感知，只需要修改策略对象内部逻辑即可。这类策略对象一般都实现了某个共同的接口，可以达到互换的目的。
 *
 *
 *
 * 多个类只有算法或行为上稍有不同的场景
 *
 * 算法需要自由切换的场景
 *
 * 需要屏蔽算法规则的场景
 *
 * ▐  实践经验
 * 业务流程很简单：
 *
 * 挑选商品
 *
 * 选择不同的优惠方式结账
 *
 * 比如即将到来的双十一活动某些线下商家举办活动，折扣力度如下满300-80，部分商品5折，根据不同会员等级享受不同的折扣最低7折，周年庆活动可享8折等等。假如这些活动折扣不可同享，那么如何去实现以及考虑可扩展性的话策略模式是一种不错的选择。
 */
public class TestStrategyPattern {
    public static void main(String[] args) {
//        BigDecimal bigDecimal = BigDecimal.valueOf(80.0f);
//        PrintlnUtils.println("doubleValue = "+bigDecimal.doubleValue());
//        PrintlnUtils.println("BigDecimal.valueOf(80.0) = "+BigDecimal.valueOf(80.0));
//        PrintlnUtils.println("BigDecimal.valueOf(80.019) = "+BigDecimal.valueOf(80.019));
//        PrintlnUtils.println("BigDecimal.valueOf(80.02) = "+BigDecimal.valueOf(80.02));
//        PrintlnUtils.println("BigDecimal.valueOf(80.013) = "+BigDecimal.valueOf(80.013));
//        PrintlnUtils.println("BigDecimal.valueOf(80.010) = "+BigDecimal.valueOf(80.010));
//        PrintlnUtils.println("BigDecimal.valueOf(80.0f) = "+BigDecimal.valueOf(80.0f));
        //doubleValue = 80.0
        //
        //BigDecimal.valueOf(80.0) = 80.0
        //
        //BigDecimal.valueOf(80.019) = 80.019
        //
        //BigDecimal.valueOf(80.02) = 80.02
        //
        //BigDecimal.valueOf(80.013) = 80.013
        //
        //BigDecimal.valueOf(80.010) = 80.01
        //
        //BigDecimal.valueOf(80.0f) = 80.0
        Price price = new Price();
        price.setDiscountStrategy(new FullReductionStrategyOne());
        CalculationResult discount = price.discount(1006623000L, new BigDecimal(310));
        PrintlnUtils.println("doubleValue = "+discount.getPrice().doubleValue());

    }
}
