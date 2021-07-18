package com.zss.排序.插入排序;


import java.util.Arrays;

public class TestDemo {
    public static void insertSort(int[] array){
        if (array.length == 0){
            return;
        }
        for (int bound = 1; bound < array.length; bound++) {
            int ret = array[bound];
            int pos = bound-1;
            for (; pos >= 0; pos--) {
                if (array[pos] > ret){
                    array[pos+1] = array[pos];
                }else {
                    break;
                }
            }
            array[pos+1] = ret;
        }
    }
    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
