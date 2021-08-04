package designpatternssimple.templateMethod;

/**
 * 模板方法模式
 * http://c.biancheng.net/view/1376.html
 */
public class TestTemplateMethod {
    public static void main(String[] args) {
        StudyAbroad tm = new StudyInAmerica();
        tm.TemplateMethod();
    }
}
