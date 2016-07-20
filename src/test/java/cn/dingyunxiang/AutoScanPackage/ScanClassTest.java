package cn.dingyunxiang.AutoScanPackage;

import cn.dingyunxiang.FastJson.Boss;
import cn.dingyunxiang.FastJson.User;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by dingyunxiang on 16/7/18.
 */
public class ScanClassTest {

    @Test
    public void testDoScan() throws Exception {
        ScanClass scan = new ScanClass();
        Set s = new LinkedHashSet();

        scan.doScan("cn.dingyunxiang.FastJson","/Users/dingyunxiang/Documents/java/Jersey-test/src/main/java",s);

        System.out.println(s.size());

    }



    @Test
    public void testSet(){

        User user = new User(0,"123","user","user init");
        Boss boss = new Boss(1,"boss");

        Set set = new HashSet();
        set.add(user);
        set.add(boss);


        for(Object obj : set){
            Field[] fields = obj.getClass().getDeclaredFields();

            for(Field f:fields){
                System.out.println(obj.getClass().getName()+">>>"+f.getName());
            }

        }



    }



    @Test
    public void printTest(){
        System.out.println((int)'a');


    }
}