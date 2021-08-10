package annotation.simple2;

import java.lang.annotation.*;

/**
 * 深入理解Java自定义注解(二)-使用自定义注解
 * https://my.oschina.net/itgaowei/blog/1602277
 */

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ReqMapping {
    enum ReqMethod{GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE}
    ReqMethod [] method() default {};

    String[] val() default "";
}
