package designpatternssimple.prototypepattern;

import utils.PrintlnUtils;

/**
 * 原型模式 http://c.biancheng.net/view/1343.html
 *
 * 用原型模式生成“三好学生”奖状。
 * 分析：同一学校的“三好学生”奖状除了获奖人姓名不同，其他都相同，属于相似对象的复制，同样可以用原型模式创建，然后再做简单修改就可以了
 *
 */
public class TestProtoTypeCitation {
    public static void main(String[] args) {
        Citation citation = new Citation("同学一", "同学：在2016学年第一学期中表现优秀，被评为三好学生", "计算机软件技术学院");
        citation.display();
        try {
            Citation clone = citation.clone();
            clone.setName("同学二");
            clone.display();
        } catch (CloneNotSupportedException e) {
            PrintlnUtils.println(" "+e.toString());

        }
    }
}
