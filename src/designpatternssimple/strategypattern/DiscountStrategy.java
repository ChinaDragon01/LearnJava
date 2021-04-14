package designpatternssimple.strategypattern;

import java.math.BigDecimal;

/**
 * 抽象折扣策略接口
 */
abstract public class DiscountStrategy {
    /**
     * 计算折扣后的价格
     *
     * @param userId
     * @param price 原价
     * @return      折扣后的价格
     */
    public abstract CalculationResult getDiscountPrice(Long userId , BigDecimal price);
}
