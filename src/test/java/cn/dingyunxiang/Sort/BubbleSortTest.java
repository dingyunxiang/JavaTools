package cn.dingyunxiang.Sort;

import org.junit.Test;

/**
 * Created by dingyunxiang on 16/8/23.
 */
public class BubbleSortTest {
    @Test
    public void bubbleSort() throws Exception {

        int[] array = {3,3,3,3,4,5};
        System.out.println(GetNumberOfK(array,3));
    }

    public int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length == 0){
            return 0;
        }
        int key = midSearch(array,k);
        if(key == -1){
            return 0;
        }
        int low = key-1;
        int high = key+1;
        int index = 1;
        while(low >=0){
            if(array[low] == k  ){
                index ++ ;
            }else{
                break;
            }
            low --;
        }
        while(high<=array.length-1){

            if(array[high] == k ){
                index ++ ;
            }else{
                break;
            }
            high ++;
        }
        return index;



    }

    public int midSearch(int[] array,int k){
        return midSearch(array,0,array.length-1,k);
    }

    public int midSearch(int[] array ,int low ,int high,int  k){
        if(low < high){
            int mid = (low + high) / 2;
            if(array[mid] == k){
                return mid;
            }else if(array[mid] < k){
                return midSearch(array,mid+1,high,k);
            }else{
                return midSearch(array,low,mid,k);
            }
        }else if(low == high){
            if(array[low] == k){
                return low;
            }else{
                return -1;
            }
        }else{
            return -1;
        }
    }



}