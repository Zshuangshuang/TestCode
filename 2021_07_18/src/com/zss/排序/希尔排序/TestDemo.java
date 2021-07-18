package com.zss.排序.希尔排序;


import java.util.Arrays;

public class TestDemo {
    public static void shellSort(int[] array){
        int gap = array.length/2;
        while (gap > 1){
            sortGap(array,gap);
            gap = gap/2;
        }
        sortGap(array,1);
    }

    private static void sortGap(int[] array, int gap) {
        for (int bound = gap; bound < array.length; bound++) {
            int ret = array[bound];
            int pos = bound-gap;
            for (; pos >= 0; pos -= gap) {
                if (array[pos] > ret){
                    array[pos+gap] = array[pos];
                }else {
                    break;
                }
            }
            array[pos+gap] = ret;
        }
    }

    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
