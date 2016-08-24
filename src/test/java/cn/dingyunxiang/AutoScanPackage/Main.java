package cn.dingyunxiang.AutoScanPackage;

import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> set = new HashSet<String>();
        while (in.hasNextLine()) {
            String str = in.nextLine();
            if(str.equals("")){
                break;
            }
            String[] strs = str.split(" ");
            for(String s:strs){
                set.add(s);
            }

        }
        System.out.println(set.size());

    }
}