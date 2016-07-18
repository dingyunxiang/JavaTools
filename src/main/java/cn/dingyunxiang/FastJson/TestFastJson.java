package cn.dingyunxiang.FastJson;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dingyunxiang on 16/7/15.
 */
public class TestFastJson {


    public static void main(String[] args) {


        User u1 = new User(1,"u1","veblen","hah");
        User u2 = new User(2,"u2","veblen","hah");
        User u3 = new User(3,"u3","veblen","hah");
        User u4 = new User(4,"u4","veblen","hah");


        List<User> list = new ArrayList<User>();

        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);

        Boss boss = new Boss(0,"boss",list);



        //转换成json
        String str = JSON.toJSONString(boss);


        //转化成对象
        Boss boss1 = JSON.parseObject(str,Boss.class);

        System.out.println(boss1);


//        System.out.println(str);

    }



}
