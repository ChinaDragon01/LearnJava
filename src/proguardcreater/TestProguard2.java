package proguardcreater;

/*
https://www.jianshu.com/p/4f3926b263a5 混淆文件生成器
https://github.com/WrBug/FrenziedProguard
 */
public class TestProguard2 {
    public static void main(String[] args) {
        char[] str = new char[]{'a', 'b', 'c', 'd', 'e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        new SpecificCharacterProguard2("proguard-abc.txt", str).start();
    }
}
