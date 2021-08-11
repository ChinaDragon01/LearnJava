package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    /**
     * 将时间戳转为格式化后的时间字符串
     *
     * @param timestamp 时间戳
     * @param pattern   格式化模板描述
     * @return
     */
    public static String timestamp2FormatedStr(long timestamp, String pattern) {
        if (timestamp <= 0) {
            return "";
        }

        if (pattern == null) {
            pattern = "yyyy-MM-dd｜HH:mm:ss";
        }
        Date date = new Date(timestamp);
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.format(date);
    }

    /**
     * 将时间戳转为格式化后的时间字符串
     *
     * @param timestamp 时间戳
     * @return
     */
    public static String timestamp2FormatedStr(long timestamp) {
        return timestamp2FormatedStr(timestamp, null);
    }
}
