package proguardcreater;

import java.util.ArrayList;
import java.util.List;


public class SpecificCharacterProguard2 {

    private char[] chars;
    private String fileName;
    private int len = 7;

    private List<String> list = new ArrayList<>();


    /**
     * @param fileName 文件名
     * @param chars    混淆字符
     */
    public SpecificCharacterProguard2(String fileName, char... chars) {
        this.chars = chars;
        this.fileName = fileName;
    }

    public void start() {
        for (int i = 0; i < 2000; i++) {
            StringBuilder k = new StringBuilder();
            for (int i1 = 0; i1 < len; i1++) {
                k.append(getRadomChar());
            }
            String s = k.toString();
            if (list.contains(s)) {
                i--;
                continue;
            }
            list.add(s);
            FileUtils.appendFile(fileName, s);
        }
    }
    // a 97, z 122

    private char getRadomChar() {
        char aChar = chars[(int) (Math.random() * chars.length)];
        return aChar;
    }
}
