package reflectopration;

import utils.PrintlnUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射创建实例,方法调用,修改字段
 * https://www.cnblogs.com/takumicx/p/9379308.html
 */
public class ReflectOpration {
    private String name;

    public ReflectOpration(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ReflectOpration{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<ReflectOpration> clazz  = ReflectOpration.class;
        //获取带参构造器
        Constructor<ReflectOpration> constructor = clazz.getConstructor(String.class);
        //反射创建实例,传入构造器参数takumiCX
        ReflectOpration instance = constructor.newInstance("takumiCX");
        PrintlnUtils.println("反射创建实例 = "+instance.toString());

        //根据方法名获取指定方法
        Method getName = clazz.getMethod("getName");

        //通过反射进行方法调用,传入进行调用的对象作参数,后面可跟上方法参数
        String res = (String) getName.invoke(instance);
        PrintlnUtils.println("通过反射进行方法调用 res = "+res);

        //获取Field对象
        Field field = clazz.getDeclaredField("name");
        //修改访问权限
        field.setAccessible(true);

        //反射修改字段,将名字改为全大写
        field.set(instance,"TAKUMICX");

        PrintlnUtils.println("反射修改字段 = "+instance.toString());

        //反射创建实例 = ReflectOpration{name='takumiCX'}
        //
        //通过反射进行方法调用 res = takumiCX
        //
        //反射修改字段 = ReflectOpration{name='TAKUMICX'}
    }
}
