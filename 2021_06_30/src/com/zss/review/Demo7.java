package com.zss.review;


import java.util.Arrays;

public class Demo7 {
    public static void swap(int[] array,int i,int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]){
                    swap(array,j,j+1);
                    flg = true;
                }
            }
            if (!flg){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {2,9,12,34,1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
