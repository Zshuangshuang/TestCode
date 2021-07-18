package com.zss.排序.选择排序;


import java.util.Arrays;

public class TestDemo {
    public static void selectSort(int[] array){
        for (int bound = 0; bound < array.length; bound++) {
            for (int cur = bound+1; cur < array.length; cur++) {
                if (array[cur] < array[bound]){
                    int tmp = array[cur];
                    array[cur] = array[bound];
                    array[bound] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
