package cn.dingyunxiang.FastJson;

/**
 * Created by dingyunxiang on 16/7/18.
 */
public class testAddClass {


    public static void main(String[] args) {
        try {

             Thread.currentThread().getContextClassLoader().loadClass("cn.dingyunxiang.FastJson.User");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
