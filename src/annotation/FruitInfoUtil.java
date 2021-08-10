package annotation;

import utils.PrintlnUtils;

import java.lang.reflect.Field;

/**
 * https://www.cnblogs.com/peida/archive/2013/04/26/3038503.htmlx
 */
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz) {
        String strFruitName = "水果名称：";
        String strFruitColor = "水果颜色：";
        String strFruitProvicer = "供应商信息：";

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                strFruitName = strFruitName + fruitName.value();
                PrintlnUtils.println(strFruitName);
            } else if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                strFruitColor = strFruitColor + fruitColor.fritColr().toString();
                PrintlnUtils.println(strFruitColor);
            } else if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvicer = strFruitProvicer + "供应商编号：" + fruitProvider.id() + "  供应商名称：" + fruitProvider.name() + "  供应商地址：" + fruitProvider.address();
                PrintlnUtils.println(strFruitProvicer);
            }
        }
    }
}
