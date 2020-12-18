package test;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/2 8:13 上午
 * Name:
 * Overview:
 * Usage:
 * *******************************************************
 */

public class TestBean {
    public String text;
    public int count;
    private final int a = 6;

    public static String tag  = "静态tag";

    public static void printTag(){
        System.out.println(tag);
    }


    public TestBean(){

    }

    public TestBean(String text, int count) {
        this.text = text;
        this.count = count;
    }


    @Override
    public int hashCode() {
        System.out.println(" super.hashCode() = "+ super.hashCode());
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null){
            System.out.println("obj == null里返回");
            return false;
        }

        if (this == obj){
            System.out.println("this == obj 里返回 "+this.text);
            return true;
        }

        if (obj instanceof TestBean){
            TestBean testBean = (TestBean) obj;
            if (testBean.text.equals(this.text)&& testBean.count == this.count){
                System.out.println("instanceof 里返回 "+this.text);
                return true;
            }


        }

        System.out.println("默认 里返回 "+this.text);

        return false;
    }

    @Override
    public String toString() {
        return "test.TestBean{" +
                "text='" + text + '\'' +
                ", count=" + count +
                '}';
    }
}
