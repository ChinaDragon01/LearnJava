package annotation.simple3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * https://www.cnblogs.com/takumicx/p/9356963.html
 * 约束注解:主键,是否为空,是否唯一等信息。
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraints {
    //字段是否为主键约束
    boolean primaryKey() default false;

    //字段是否允许为null
    boolean nullable() default false;

    //字段是否唯一
    boolean unique() default false;
}
