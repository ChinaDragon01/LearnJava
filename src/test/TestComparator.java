package test;

import bean.DogBean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * **********************************************************************
 * Author: zbl
 * Time: 2020/1/15 10:35
 * Name: Comparator的用法
 * Overview:
 *  参考文献：https://blog.csdn.net/u012250875/article/details/55126531
 * Usage:
 * **********************************************************************
 */
public class TestComparator {

    public static void main(String[] args) {
        List<DogBean> mDogBeanList = new ArrayList<>();

        mDogBeanList.add(new DogBean(1, "A"));
        mDogBeanList.add(new DogBean(3, "B"));
        mDogBeanList.add(new DogBean(5, "C"));

        Collections.sort(mDogBeanList, new Comparator<DogBean>() {
            @Override
            public int compare(DogBean o1, DogBean o2) {
                return o2.age - o1.age;
            }
        });

        System.out.println("狗狗按照年龄排序：" + mDogBeanList);

        Collections.sort(mDogBeanList, new Comparator<DogBean>() {
            @Override
            public int compare(DogBean o1, DogBean o2) {
                return o2.name.compareTo(o1.name);
            }
        });

        System.out.println("狗狗按照年龄倒序排序：" + mDogBeanList);

    }

}
