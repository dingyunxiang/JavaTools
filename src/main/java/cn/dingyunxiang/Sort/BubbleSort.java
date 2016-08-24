package cn.dingyunxiang.Sort;

import org.junit.Test;

/**
 * Created by dingyunxiang on 16/8/23.
 */
public class BubbleSort {


    @Test
    public void testBubbleSort(){
        int arr[] = {1,4,2,4,2,545,3,43,23,2,3,2,9,66,0};
        selectSort(arr);
        toString(arr);


    }

    public void selectSort(int[] arr){
        if(arr == null || arr.length <=1){
            return ;
        }
        int min;
        int index ;
        for(int i=0;i<arr.length;i++){
            min = arr[i];
            index = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            if(index!=i){
                swap(arr,i,index);
            }
        }


    }

    public void bubbleSort(int[] arr){
        if(arr == null || arr.length <=1){
            return ;
        }
        int len = arr.length;
        for(int i=len-1;i>=0;i--){
            boolean all = true;
            for(int j = 0;j<i;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    all = false;
                }
            }
            if(all){
                break;
            }
        }
    }

    public void insertSort(int[] arr){
        if(arr == null || arr.length <= 1){
            return ;
        }else{
            for(int i=1;i<=arr.length-1;i++){
                for(int j=i;j>0;j--){
                    if(arr[j]<arr[j-1]){
                        swap(arr,j,j-1);
                    }
                }
            }
        }
    }

    public void swap(int[] array,int a,int b){
        int key = array[a];
        array[a] = array[b];
        array[b] = key;
    }

    public void toString(int[] arr){
        for(int x:arr){
            System.out.print(x+",");
        }
    }

}
