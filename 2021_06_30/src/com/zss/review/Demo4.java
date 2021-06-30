package com.zss.review;


public class Demo4 {
    public static  int max(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array = {3,9,45,2,1,7};
        System.out.println(max(array));
    }
}
