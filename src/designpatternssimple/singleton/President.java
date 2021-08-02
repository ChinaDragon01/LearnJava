package designpatternssimple.singleton;

import utils.PrintlnUtils;

public class President {
    private String name;

    President() {
        name = "奥巴马";
        PrintlnUtils.println("产生一个总统！" + name + " 当前线程是：" + Thread.currentThread().getName());
    }

    /**
     * 产生一个总统！奥巴马 当前线程是：Thread-0
     *
     * 总统已存在，不能再产生新的了
     *
     * 总统已存在，不能再产生新的了
     *
     * 我是总统：奥巴马
     *
     * 我是总统：奥巴马
     *
     * 我是总统：奥巴马
     */

    private static volatile President instance = null;

        public static synchronized President getInstance() {//线程同步
        if (instance == null) {
            instance = new President();
        } else {
            PrintlnUtils.println("总统已存在，不能再产生新的了");
        }

        return instance;
    }


    //不能再多线程使用
    /**
     * 产生一个总统！奥巴马 当前线程是：Thread-1
     *
     * 产生一个总统！奥巴马 当前线程是：Thread-0
     *
     * 产生一个总统！奥巴马 当前线程是：Thread-2
     *
     * 我是总统：奥巴马
     *
     * 我是总统：奥巴马
     *
     * 我是总统：奥巴马
     */
//    private static President instance = null;
//
//    public static President getInstance() {
//        if (instance == null) {
//            instance = new President();
//        } else {
//            PrintlnUtils.println("总统已存在，不能再产生新的了");
//        }
//
//        return instance;
//    }

    public String getName() {
        PrintlnUtils.println("我是总统：" + name);
        return name;
    }
}
