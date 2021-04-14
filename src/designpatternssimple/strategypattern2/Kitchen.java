package designpatternssimple.strategypattern2;

//环境类：厨房
public class Kitchen {
    private CrabCooking strategy;    //抽象策略

    public CrabCooking getStrategy() {
        return strategy;
    }

    public void setStrategy(CrabCooking strategy) {
        this.strategy = strategy;
    }

    public void cookingMethod() {
        strategy.CookingMethod();    //做菜
    }
}
