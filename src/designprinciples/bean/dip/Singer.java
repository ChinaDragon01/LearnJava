package designprinciples.bean.dip;

import designprinciples.baseinterface.dip.Song;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/19 上午11:46
 * Name:
 * Overview:
 * Usage:
 * 依赖倒置原则，Dependence Inversion Principle，简称 DIP http://c.biancheng.net/view/1326.html
 * *******************************************************
 */
public class Singer {
    //唱歌的方法
    public void sing(Song song) {
        System.out.println("歌手" + song.language());
    }
}
