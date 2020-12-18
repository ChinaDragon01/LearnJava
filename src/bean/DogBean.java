package bean;

/**
 * **********************************************************************
 * Author: zbl
 * Time: 2020/1/15 10:36
 * Name:
 * Overview:
 * Usage:
 * **********************************************************************
 */
public class DogBean {

    public int age;
    public String name;

    public DogBean() {
    }

    public DogBean(String name) {
        this.name = name;
    }

    public DogBean(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "DogBean{" +
                "狗龄 = " + age +
                ", 狗狗名字 = '" + name + '\'' +
                '}';
    }
}
