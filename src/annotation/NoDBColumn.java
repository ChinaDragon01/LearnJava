package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 深入理解Java：注解（Annotation）自定义注解入门
 * https://www.cnblogs.com/peida/archive/2013/04/24/3036689.html
 */
@Target(ElementType.FIELD)
public @interface NoDBColumn {
}
