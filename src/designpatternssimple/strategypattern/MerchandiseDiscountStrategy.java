package designpatternssimple.strategypattern;

import java.math.BigDecimal;

/**
 * 部分商品5折
 */
public class MerchandiseDiscountStrategy extends DiscountStrategy{
    @Override
    public CalculationResult getDiscountPrice(Long userId, BigDecimal price) {
        BigDecimal dealPrice = price.multiply(BigDecimal.valueOf(0.5));
        return getDiscountPrice(userId,dealPrice);
    }
}
