package designpatternssimple.strategypattern;

import java.math.BigDecimal;

public class CalculationResult {
    private BigDecimal price;

    public CalculationResult(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
