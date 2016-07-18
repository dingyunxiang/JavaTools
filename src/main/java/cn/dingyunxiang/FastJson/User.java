package cn.dingyunxiang.FastJson;

/**
 * Created by dingyunxiang on 16/7/15.
 */
public class User {

    private int age;
    private String number;
    private String name;
    private String desc;


    public User(int age, String number, String name, String desc) {
        this.age = age;
        this.number = number;
        this.name = name;
        this.desc = desc;
    }

    public User() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
