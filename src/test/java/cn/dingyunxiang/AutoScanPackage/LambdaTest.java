package cn.dingyunxiang.AutoScanPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by dingyunxiang on 16/8/2.
 */
public class LambdaTest {





    public static void main(String[] args){

        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"aaa"));
        list.add(new Student(2,"bbb"));
        list.add(new Student(3,"ccc"));
        list.add(new Student(4,"ccc"));
        list.add(new Student(5,"ccc"));

        list.forEach((v)->{

        });


//        Map<String,Student> map = list.stream().collect(Collectors.groupingBy(k->{
//            return k.getName();
//                },
//                (n,b)->{
//                    return n;
//                }));
        Map<String, List<Student>> map1 = list.stream().collect(Collectors.groupingBy(k->k.getName()));


        map1.forEach((k,v)-> System.out.println(k + ">>>"+v));








    }




}


class Student{
    int age;
    String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
