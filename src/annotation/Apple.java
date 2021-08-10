package annotation;

import utils.PrintlnUtils;

/**
 * https://www.cnblogs.com/peida/archive/2013/04/24/3036689.html
 */
public class Apple {
    @FruitName("苹果")
    private String appleName;

    @FruitColor(fritColr = FruitColor.Color.RED)
    private String appleColor;

    @FruitProvider(id = 1, name = "陕西红富士集团", address = "陕西省西安市延安路89号红富士大厦")
    private String appleProvider;


    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }

    public void displayName() {
        PrintlnUtils.println("水果的名字是：" + appleName + "  颜色：" + appleColor);
    }
}
