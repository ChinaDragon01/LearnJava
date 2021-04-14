package designpatternssimple.strategypattern;

import java.math.BigDecimal;

/**
 *  满减活动 -- 满300减80
 */
public class FullReductionStrategyOne extends DiscountStrategy{
    @Override
    public CalculationResult getDiscountPrice(Long userId, BigDecimal price) {
        if (price.doubleValue() < 300) {
            return new CalculationResult(price);
        }

        BigDecimal dealPrice = price.subtract(BigDecimal.valueOf(80));
        return getDiscountPrice(userId,dealPrice);
    }
}
