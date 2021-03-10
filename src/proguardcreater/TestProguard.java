package proguardcreater;

/*
https://www.jianshu.com/p/4f3926b263a5 混淆文件生成器
https://github.com/WrBug/FrenziedProguard
 */
public class TestProguard {
    public static void main(String[] args) {
        char[] str = new char[]{'a', 'b', 'c', 'd', 'e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//        ChineseProguard.start();
        new SpecificCharacterProguard2("proguard-abc.txt", str).start();
//        new SpecificCharacterProguard("proguard-o0O.txt", '0', 'o', 'O', '8', '〇').start();
//        new SpecificCharacterProguard("proguard-1il.txt", '1', 'i', 'l', 'L', 'I', '丨').start();
//        new SpecificCharacterProguard("proguard-socialism.txt", "富强民主文明和谐自由平等公正法治爱国敬业诚信友善".toCharArray()).start();
    }
}
