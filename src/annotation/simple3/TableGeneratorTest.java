package annotation.simple3;

import utils.PrintlnUtils;

import java.util.StringJoiner;

/**
 * https://www.cnblogs.com/takumicx/p/9356963.html
 */
public class TableGeneratorTest {
    public static void main(String[] args) {
        String genSQL = TableGenerator.genSQL(Student.class);
        PrintlnUtils.println("genSQL = " + genSQL);


        //Java8 拼接字符串 StringJoiner
        //https://www.cnblogs.com/lick468/p/11340877.html

//        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("Heloo");
        stringJoiner.add("world");
        PrintlnUtils.println("stringJoiner："+stringJoiner.toString());
        //stringJoiner：[Heloo,world]
        //stringJoiner：Heloo,world
    }
}
