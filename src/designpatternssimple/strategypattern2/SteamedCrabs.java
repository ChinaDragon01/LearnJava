package designpatternssimple.strategypattern2;

import utils.PrintlnUtils;

//具体策略类：清蒸大闸蟹
public class SteamedCrabs implements CrabCooking{
    @Override
    public void CookingMethod() {
        PrintlnUtils.println("清蒸大闸蟹 SteamedCrabs CookingMethod");
    }
}
