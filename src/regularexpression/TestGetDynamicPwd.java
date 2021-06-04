package regularexpression;

import utils.PrintlnUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://blog.csdn.net/w695050167/article/details/69588266
 * <p>
 * 《java-KK》-（用户：654321，的验证码是：【123456】）
 * <p>
 * <p>
 * https://blog.csdn.net/DavidWu88/article/details/65441246
 * 从短信中提取短信验证码正则表达式，缺少足够测试
 */
public class TestGetDynamicPwd {
    public static void main(String[] args) {


        getDynamicSmsVerifyCode();

        getDynamicSmsVerifyCode2();

    }

    /**
     * 从字符串中截取连续6位数字组合 ([0-9])截取六位数字 进行前后断言不能出现数字 用于从短信中获取动态密码
     *
     * @return 截取得到的6位动态密码
     */

    public static void getDynamicSmsVerifyCode() {

        String content = "你好，验证是745234，请在5分钟内提交验证码，不要告诉陌生人";

        // 此正则表达式验证六位数字的短信验证码
        int YZMLENGTH = 6;

        Pattern pattern = Pattern.compile("(?<![0-9])([0-9]{" + YZMLENGTH + "})(?![0-9])");

//        Pattern pattern = Pattern.compile("(?<![0-9])([0-9])(?![0-9])");

        Matcher matcher = pattern.matcher(content);

        String dynamicPwd = "";

        while (matcher.find()) {

            dynamicPwd = matcher.group();

        }

        PrintlnUtils.println("dynamicPwd = " + dynamicPwd);
    }

    public static void getDynamicSmsVerifyCode2() {

        String str = "用户：18145632456，的验证码是：【123456】";
        if (str != null) {
            Pattern p = Pattern.compile("【(\\d+)】");
            Matcher m = p.matcher(str);
            while (m.find()) {
                PrintlnUtils.println("匹配结果：" + m.group());
                PrintlnUtils.println("提取组1：" + m.group(1));
            }
        }

        //手机号中间四位隐藏
        String mobile = "18145632456";
        mobile = mobile.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        PrintlnUtils.println("mobile = " + mobile);
    }
}
