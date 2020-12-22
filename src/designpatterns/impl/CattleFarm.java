package designpatterns.impl;

import designpatterns.baseinterface.Animal;
import designpatterns.baseinterface.AnimalFarm;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/22 上午11:39
 * Name:
 * Overview:
 * Usage:
 * *******************************************************
 */
//具体工厂：养牛场
public class CattleFarm implements AnimalFarm {
    @Override
    public Animal newAnimal() {
        return new Cattle();
    }
}
