package com.zss.review;


public class Demo6 {
    public static boolean isUp(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if (array[i+1] < array[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(isUp(array));
    }
}
