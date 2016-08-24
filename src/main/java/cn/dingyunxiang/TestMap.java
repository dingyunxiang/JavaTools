package cn.dingyunxiang;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dingyunxiang on 16/8/11.
 */
public class TestMap {


    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(121, "value");
        String str = "111";
        Integer a =map.keySet().toArray(new Integer[0])[0];
        Integer b = (Integer)map.keySet().toArray()[0];
        System.out.println(a+">>"+b);
    }

}
