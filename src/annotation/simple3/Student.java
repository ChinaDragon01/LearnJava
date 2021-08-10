package annotation.simple3;

/**
 * 带注解的实体类,建立了对象和表的映射关系,可以再运行时被解析
 */
@MyTable(value = "t_student")
public class Student {
    @MyColumn(value = "id", constraint = @Constraints(primaryKey = true))
    private String id;

    @MyColumn(value = "name")
    private String name;

    @MyColumn(value = "age", type = "INT", constraint = @Constraints(nullable = true))
    private int age;

    //对应表字段phone_number,类型为VARCHAR,且有唯一约束
    @MyColumn(value = "phone_number", constraint = @Constraints(unique = true))
    private String phoneNumber;

    private transient String ext;
}
