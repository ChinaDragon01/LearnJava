package designpatternssimple.strategypattern;

import java.math.BigDecimal;

/**
 * https://mp.weixin.qq.com/s/M84JCjLlfx0_wFyRUg16Cg
 * <p>
 * 当有新的需求式，我们只需要添加一个新的接口即可，不需要修改原有的具体策略实现代码即可完成。
 * 定义完策略后，我们再定义一个”环境角色”，假设我们这个环境角色就使用价格对象吧
 */
public class Price {
    private DiscountStrategy discountStrategy;

    /**
     * 获取折扣后的价格
     *
     * @param price 原始价格
     * @return
     */
    public CalculationResult discount(Long userId, BigDecimal price) {
        return discountStrategy.getDiscountPrice(userId, price);
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
