package designpatternssimple.strategypattern2;

import utils.PrintlnUtils;

//具体策略类：红烧大闸蟹
public class BraisedCrabs implements CrabCooking{
    @Override
    public void CookingMethod() {
        PrintlnUtils.println("红烧大闸蟹 BraisedCrabs CookingMethod");
    }
}
