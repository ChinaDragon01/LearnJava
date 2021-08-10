package annotation;

/**
 * 自定义注解详细介绍
 * https://blog.csdn.net/xsp_happyboy/article/details/80987484?utm_term=%E8%87%AA%E5%AE%9A%E4%B9%89%E6%B3%A8%E8%A7%A3%E8%AF%A6%E8%A7%A3&utm_medium=distribute.pc_aggpage_search_result.none-task-blog-2~all~sobaiduweb~default-1-80987484&spm=3001.4430
 */
public class TestAnnotation {
    public static void main(String[] args) {

        Apple apple = new Apple();
//        apple.setAppleName("红苹果");
//        apple.setAppleColor(FruitColor.Color.RED.name());
//        apple.displayName();
//        FruitInfoUtil.getFruitInfo(Apple.class);
        FruitInfoUtil.getFruitInfo(apple.getClass());
        //水果名称：苹果
        //
        //水果颜色：RED
        //
        //供应商信息：供应商编号：1  供应商名称：陕西红富士集团  供应商地址：陕西省西安市延安路89号红富士大厦

    }
}
