package cn.dingyunxiang.FastJson;

import java.util.List;

/**
 * Created by dingyunxiang on 16/7/15.
 */
public class Boss {

    private int number;
    private String name;



    private List<User> users;


    public Boss(int number, String name, List<User> users) {
        this.number = number;
        this.name = name;
        this.users = users;
    }


    public Boss(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Boss() {
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


    @Override
    public String toString() {
        return "Boss{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
