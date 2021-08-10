package annotation;

import java.lang.annotation.*;

/**
 * https://www.cnblogs.com/peida/archive/2013/04/24/3036689.html
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    enum Color {BULE, RED, GREEN}

    Color fritColr() default Color.GREEN;


}
