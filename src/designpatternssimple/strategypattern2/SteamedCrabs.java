package designpatternssimple.strategypattern2;

import utils.PrintlnUtils;

//具体策略类：清蒸大闸蟹 策略模式 http://c.biancheng.net/view/1378.html
public class SteamedCrabs implements CrabCooking{
    @Override
    public void CookingMethod() {
        PrintlnUtils.println("清蒸大闸蟹 SteamedCrabs CookingMethod");
    }
}
