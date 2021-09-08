package bean;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2020/12/25 上午9:14
 * Name:
 * Overview:
 * Usage:
 * *******************************************************
 */
public class User {
    private String name;
    private int age;
    private int id;// 保证id是唯一的，年龄和名字重复的概率大

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj){
            return true;
        }

        if (obj instanceof User){
//            return this.name.equals(((User) obj).name);
            
            if (this.name.equals(((User) obj).name) && this.age == ((User) obj).age && this.id == ((User) obj).getId()){
                return true;
            }

        }

        return false;
    }
}
