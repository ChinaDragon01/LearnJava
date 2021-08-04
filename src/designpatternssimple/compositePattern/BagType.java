package designpatternssimple.compositePattern;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * java 注解 @Retention @interface 元数据
 * https://www.cnblogs.com/coolgun/p/3802535.html
 */
@Target(ElementType.PARAMETER)//说明该注解只能被声明在一个方法参数前。
@Retention(RetentionPolicy.CLASS)
public @interface BagType {
    int BAG_BIG = 1;
    int BAG_MIDDLE = 2;
    int BAG_SMALL = 3;
}
