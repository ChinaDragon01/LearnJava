package regularexpression;

import utils.PrintlnUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式 - 语法
 * https://www.runoob.com/regexp/regexp-syntax.html
 *
 * Java 正则表达式：语法讲解和常用表达式汇总
 * https://blog.csdn.net/weixin_44259720/article/details/88179885
 *
 * java正则表达式大全（常用）
 * https://blog.csdn.net/zpz2411232428/article/details/83549502?utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-2.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-2.control
 */
public class TestRegEx {
    public static void main(String[] args) {
        String mParam2 = "psotion=1007799999";
        String regEx = "[^0-9]";

        //方式一
        boolean matches = mParam2.matches(regEx);

        //方式二
        boolean matches1 = Pattern.matches(regEx, mParam2);


        //方式三
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(mParam2);
        boolean matches2 = m.matches();

//        String regexpostCode = "[1-9]\\d{5}(?!\\d)";//(中国邮政编码为6位数字)
        String regexpostCode = "[0-9]\\d{5}(?!\\d)";//(中国邮政编码为6位数字，注意邮编有0开头的)
        String postCode = "012346";
        boolean matches3 = postCode.matches(regexpostCode);

        PrintlnUtils.println("matches = " + matches + " matches1 = " + matches1 + " matches2 = " + matches2+" matches3 = "+matches3);

        int pos = Integer.parseInt(m.replaceAll("").trim());
        PrintlnUtils.println("pos = " + pos);

        matchAndLookingExample();


    }

    /**
        matches() 和 lookingAt() 方法都用来尝试匹配一个输入序列模式。不同的是 matches() 要求整个序列都匹配，而 lookingAt() 不要求；
        lookingAt() 方法虽然不需要整句都匹配，但是需要从第一个字符开始匹配；
        这两个方法经常在输入字符串的开始使用。

     */
    public static void matchAndLookingExample() {
        String REGEX = "foo";
        String INPUT = "foooooooooo";
        String INPUT2 = "ooooofoooooo";

        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        Matcher matcher2 = pattern.matcher(INPUT2);

        System.out.println("lookingAt(): "+matcher.lookingAt());
        System.out.println("matches(): "+matcher.matches());
        System.out.println("lookingAt(): "+matcher2.lookingAt());
    }
}
