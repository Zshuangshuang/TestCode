package com.zss.review;


public class Demo2 {
    public static String myToString(int[] array){
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if (i != array.length-1){
                result += ",";
            }else {
                result += "]";
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] array = {1,3,5,7};
        System.out.println(myToString(array));
    }
}
