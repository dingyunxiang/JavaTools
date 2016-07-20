package cn.dingyunxiang.AutoScanPackage;

/**
 * Created by dingyunxiang on 16/7/18.
 */
public class NameTuofengTransfer {

    public static String changeName(String str){

        if(str == null || str.length()==0){
            return str;
        }

        char ch = str.charAt(0);

        if(ch>='A'&&ch<='Z'){
            str = str.toLowerCase();

        }


        return str;
    }


    public static void main(String[] args) {
        System.out.println(changeName("ABcd"));
    }

}
