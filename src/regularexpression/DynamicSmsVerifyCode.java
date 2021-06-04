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
 * <p>
 * <p>
 * 获取验证码的正则表达式
 * https://blog.csdn.net/a465456465/article/details/46619241?utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EOPENSEARCH%7Edefault-3.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EOPENSEARCH%7Edefault-3.control
 */
public class DynamicSmsVerifyCode {
    private static final int SMS_VERIFY_CODE_LENGTH = 6;

    public static void main(String[] args) {

        getDynamicSmsVerifyCode1();
        getDynamicSmsVerifyCode2();
        getDynamicSmsVerifyCode3();
    }

    /**
     * 从字符串中截取连续6位数字组合 ([0-9])截取六位数字 进行前后断言不能出现数字 用于从短信中获取动态密码
     *
     * @return 截取得到的6位动态密码
     */

    public static void getDynamicSmsVerifyCode1() {

        String content = "你好，验证是745234，请在5分钟内提交验证码，不要告诉陌生人";

        // 此正则表达式验证六位数字的短信验证码

        Pattern pattern = Pattern.compile("(?<![0-9])([0-9]{" + SMS_VERIFY_CODE_LENGTH + "})(?![0-9])");

        Matcher matcher = pattern.matcher(content);

        String smsVerifyCode = "";

        while (matcher.find()) {

            smsVerifyCode = matcher.group();

        }

        PrintlnUtils.println(" getDynamicSmsVerifyCode 1 打印 smsVerifyCode = " + smsVerifyCode);
    }

    public static void getDynamicSmsVerifyCode2() {

        String smsContent = "用户：18145632456，的验证码是：【123456】";
        Pattern p = Pattern.compile("【(\\d+)】");
        Matcher m = p.matcher(smsContent);
        while (m.find()) {
            PrintlnUtils.println(" getDynamicSmsVerifyCode 2 打印 匹配结果：" + m.group());
            PrintlnUtils.println(" getDynamicSmsVerifyCode 2 打印 提取组1 验证码：" + m.group(1));
        }

        //手机号中间四位隐藏
        String mobile = "18145632456";
        mobile = mobile.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        PrintlnUtils.println(" getDynamicSmsVerifyCode 2 打印 mobile = " + mobile);
    }

    public static void getDynamicSmsVerifyCode3() {
        // 首先([a-zA-Z0-9]{SMS_VERIFY_CODE_LENGTH})是得到一个连续的六位数字字母组合
        // (?<![a-zA-Z0-9])负向断言([0-9]{SMS_VERIFY_CODE_LENGTH})前面不能有数字
        // (?![a-zA-Z0-9])断言([0-9]{SMS_VERIFY_CODE_LENGTH})后面不能有数字出现

        String smsContent = "用户：18145632456，的验证码是：【123456】";

        //	获得数字字母组合
        //  Pattern p = Pattern.compile("(?<![a-zA-Z0-9])([a-zA-Z0-9]{" + YZMLENGTH + "})(?![a-zA-Z0-9])");

        //	获得纯数字
        Pattern p = Pattern.compile("(?<![0-9])([0-9]{" + SMS_VERIFY_CODE_LENGTH + "})(?![0-9])");

        Matcher m = p.matcher(smsContent);
        if (m.find()) {
            PrintlnUtils.println(" getDynamicSmsVerifyCode 3 打印 "+m.group());
            PrintlnUtils.println(" getDynamicSmsVerifyCode 3 打印 "+m.group(0));
        }
    }
}
