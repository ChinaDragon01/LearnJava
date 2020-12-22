package designpatterns.impl;

import designpatterns.baseinterface.Animal;
import designpatterns.baseinterface.AnimalFarm;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/22 上午11:38
 * Name:
 * Overview:
 * Usage:
 * *******************************************************
 */
//具体工厂：养马场
public class HorseFarm implements AnimalFarm {
    @Override
    public Animal newAnimal() {

        return new Horse();
    }
}
