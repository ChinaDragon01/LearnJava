package designpatternssimple.strategypattern2;

public class TestStrategyKitchen {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        CrabCooking crabCooking = new BraisedCrabs();
        kitchen.setStrategy(crabCooking);
        kitchen.cookingMethod();

        crabCooking = new SteamedCrabs();
        kitchen.setStrategy(crabCooking);
        kitchen.cookingMethod();
    }
}
