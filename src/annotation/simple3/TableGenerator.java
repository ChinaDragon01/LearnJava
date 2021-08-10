package annotation.simple3;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * https://www.cnblogs.com/takumicx/p/9356963.html
 * 运行时注解解析器
 */
public class TableGenerator {
    /**
     * 运行时解析注解生成对应的建表语句
     *
     * @param clazz 与表对应的实体的Class对象
     * @return
     */
    public static String genSQL(Class clazz) {
        String table;//表名字
        List<String> columnSegments = new ArrayList<>();
        MyTable myTable = (MyTable) clazz.getAnnotation(MyTable.class);
        if (myTable == null) {
            throw new IllegalArgumentException("表注解不能为空!");
        }

        table = myTable.value();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            MyColumn myColumn = field.getAnnotation(MyColumn.class);

            if (myColumn == null) {
                continue;
            }

            StringBuffer columnSegement = new StringBuffer();
            String columnType = myColumn.type().toUpperCase();//字段类型
            String columnName = myColumn.value().toUpperCase();//字段名
            columnSegement.append(columnName).append(" ").append(columnType).append(" ");
            Constraints constraint = myColumn.constraint();
            boolean primaryKey = constraint.primaryKey();
            boolean nullable = constraint.nullable();
            boolean unique = constraint.unique();
            if (primaryKey) {
                //主键唯一且不为空
                columnSegement.append("PRIMARY KEY ");
            } else if (!nullable) {
                //字段不为null
                columnSegement.append("NOT NULL ");
            }
            if (unique) {
                //有唯一键
                columnSegement.append("UNIQUE ");
            }
            columnSegments.add(columnSegement.toString());

            if (columnSegments.size() < 1) {
                //没有映射任何表字段,抛出异常
                throw new IllegalArgumentException("没有映射任何表字段!");
            }
        }

        StringJoiner stringJoiner = new StringJoiner(",", "(", ")");

        for (String columnSegment : columnSegments) {
            stringJoiner.add(columnSegment);
        }

        return String.format("CREATE TABLE %s", table) + stringJoiner.toString();
    }
}
