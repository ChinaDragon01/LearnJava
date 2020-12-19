package impl.dip;

import baseinterface.dip.Song;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/19 上午11:45
 * Name:
 * Overview:
 * Usage:
 * 依赖倒置原则，Dependence Inversion Principle，简称 DIP http://c.biancheng.net/view/1326.html
 * *******************************************************
 */
public class ChineseSong implements Song {
    @Override
    public String language() {
        return "唱国语歌";
    }
}
