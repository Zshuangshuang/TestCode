package com.zss.review;

import java.util.Arrays;

public class demo9 {
    public static void swap(int[] array,int x,int y){
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }
    public static void show(int[] array){
        int left = 0;
        int right = array.length-1;
       while (left < right){
           while (left < right && array[left] %2 == 0){
               left++;
           }
           while (left < right && array[right] %2 != 0){
               right--;
           }
           swap(array,left,right);
       }
    }

    public static void main(String[] args) {
        int[] array = {1,3,2,4,6,7};
        show(array);
        System.out.println(Arrays.toString(array));
    }
}
