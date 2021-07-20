package com.zss.排序.插入排序;


import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertSort(int[] array) {
        for (int bound = 1; bound < array.length; bound++) {
            int pos = bound-1;
            int ret = array[bound];
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
}
