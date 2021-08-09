package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * https://www.cnblogs.com/peida/archive/2013/04/24/3036689.html
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    String name() default "fieldName";

    String setFuncName() default "setField";

    String getFuncName() default "getField";

    boolean defaultDBValue() default false;
}
