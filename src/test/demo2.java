package test;

import bean.User;
import utils.PrintlnUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class demo2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<User> list1 = new ArrayList<>();
        List<User> list2 = new ArrayList<>();
        List<User> list3 = null;
        List<User> list4 = new ArrayList<>();

        User user1 = new User("list1");
        User user2 = new User("list2");
        User user3 = new User("list3");

        User user4 = new User("list2");
        User user5 = new User("list5");


        list1.add(user1);
        list1.add(user2);
        list1.add(user3);

        list2.add(user4);
        list2.add(user5);

        list3 = list1;

//        list4.addAll(list1);
//        list4.addAll(list2);
//        list4.addAll(list3);

        // 利用 set 去重复
//        Set<User> hashSet = new HashSet<>(list4);

        Set<User> hashSet = new HashSet<>();

        hashSet.addAll(list1);
        hashSet.addAll(list2);
        hashSet.addAll(list3);

        List<User> list5 = new ArrayList<>(hashSet);
        for (User user : list5) {
//            PrintlnUtils.println(user.getName());
        }

        List list = new ArrayList();
        list.add("1IcjjqiztBEVED9V1BWFyw==");
        list.add("oJlabbU4xURSizhIbt3KnA==");
        list.add("L1ht3hm8mpAF3IrDYsOvJQ==");


        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
            if (i == list.size() - 1) {
                break;
            }
//        List<User> list5 = new ArrayList<>(hashSet);
//		for (User user : list5) {
//			PrintlnUtils.println(user.getName());
//		}

        //todo 待整理
        PrintlnUtils.println("1 + 1 = " + (1 + 1) + "   等于 " + " 1 << 1 = " + (1 << 1));
        PrintlnUtils.println("2 + 2 = " + (2 + 2) + "   等于 " + " 1 << 2 = " + (1 << 2));
        PrintlnUtils.println("1 << 3 = " + (1 << 3));
        PrintlnUtils.println("1 << 4 = " + (1 << 4));
        PrintlnUtils.println("1 << 5 = " + (1 << 5));
        PrintlnUtils.println("1 << 6 = " + (1 << 6));
        PrintlnUtils.println("1 << 7 = " + (1 << 7));
        PrintlnUtils.println("1 << 8 = " + (1 << 8));
        PrintlnUtils.println("1 << 9 = " + (1 << 9));
        PrintlnUtils.println("1 << 10 = " + (1 << 10));
        PrintlnUtils.println("1 << 11 = " + (1 << 11));
        PrintlnUtils.println("2 << 6 = " + (2 << 11));


        //1 << 1 = 2
        //
        //1 << 2 = 4
        //
        //1 << 3 = 8
        //
        //1 << 4 = 16
        //
        //1 << 5 = 32
        //
        //1 << 6 = 64
        //
        //1 << 7 = 128
        //
        //1 << 8 = 256
        //
        //1 << 9 = 512
        //
        //1 << 10 = 1024
        //
        //1 << 11 = 2048
        //
        //2 << 0 = 1

            stringBuilder.append(",");

        }
        String join = String.join(",", list);

        PrintlnUtils.println("拼接后的加密手机号码 join ：" + join);
        PrintlnUtils.println("拼接后的加密手机号码 stringBuilder ：" + stringBuilder.toString());

    }


}
