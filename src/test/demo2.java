package test;

import bean.User;
import utils.PrintlnUtils;

import java.util.*;


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
			PrintlnUtils.println(user.getName());
		}


    }


}
