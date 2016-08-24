package cn.dingyunxiang.ClassProgress;

import java.util.Scanner;

/**
 * Created by dingyunxiang on 16/8/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int  i = 0;i<num;i++){
            int cardNum = scanner.nextInt();
            int index = scanner.nextInt();
            int[] array = new int[cardNum*2];
            for(int j=0;j<cardNum*2;j++){
                array[j] = scanner.nextInt();
            }
            int new_index = index % cardNum;
            while(new_index != 0){
                array = fanzhuan(array);
                new_index--;
            }
            for(int j=0;j<cardNum*2-1;j++){
                System.out.print(array[j]+" ");
            }
            System.out.println(array[cardNum*2-1]);


        }



    }

    public static int[] fanzhuan(int[] arr){
        int length = arr.length;
        int[] rs = new int[length];
        for(int i=0;i<length;i+=2){
            rs[i] = arr[i];
            rs[i+1] = arr[length/2];
        }
        return rs;
    }


}
