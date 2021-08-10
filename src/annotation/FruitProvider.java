package annotation;

import java.lang.annotation.*;

/**
 * https://www.cnblogs.com/peida/archive/2013/04/24/3036689.html
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    /**
     * 供应商编号
     *
     * @return
     */
    int id() default -1;

    /**
     * 供应商名称
     *
     * @return
     */
    String name() default "";

    /**
     * 供应商地址
     *
     * @return
     */
    String address() default "";
}
