package annotation;

/**
 * @Inherited：
 * https://www.cnblogs.com/peida/archive/2013/04/24/3036689.html
 */
public @interface Greeting {
    public enum FontColor{BULE,RED, GREEN};

    String name();

    FontColor fontColor() default FontColor.GREEN;
}
/*
   自定义注解：
　　使用@interface自定义注解时，自动继承了java.lang.annotation.Annotation接口，由编译程序自动完成其他细节。在定义注解时，不能继承其他的注解或接口。@interface用来声明一个注解，
   其中的每一个方法实际上是声明了一个配置参数。方法的名称就是参数的名称，返回值类型就是参数的类型（返回值类型只能是基本类型、Class、String、enum）。可以通过default来声明参数的默认值。
 */
