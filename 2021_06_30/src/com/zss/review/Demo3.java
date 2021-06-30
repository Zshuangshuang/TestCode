package com.zss.review;

import java.util.Arrays;

public class Demo3 {
    public static int[] arrayCopy2(int[] array){
        int[] ret = Arrays.copyOf(array,array.length);
        return ret;
    }
    public static int[] arrayCopy1(int[] array){
        int[] ret = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ret[i] = array[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        //System.out.println(Arrays.toString(arrayCopy1(array)));
        System.out.println(Arrays.toString(arrayCopy2(array)));
        int[] ret = new int[array.length];
        //native方法，速度快
        System.arraycopy(array,0,ret,0,array.length);
        int[] re = array.clone();
        System.out.println(Arrays.toString(re));
    }
}
