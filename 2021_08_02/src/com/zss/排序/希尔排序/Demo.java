package com.zss.排序.希尔排序;


import com.zss.排序.TestData;

import java.util.Arrays;

public class Demo {

    public static void shellSort(int[] array){
        int gap = array.length/2;
        while (gap > 1){
            shellSortGap(array,gap);
            gap >>= 1;
        }
        shellSortGap(array,1);
    }
    public static void shellSortGap(int[] array,int gap){
        for (int bound = gap; bound < array.length; bound++) {
            int ret = array[bound];
            int pos = bound-gap;
            for (; pos >= 0 ; pos -= gap) {
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
        TestData testData = new TestData();
        int[] array = testData.getArray();
        shellSort(array);
        System.out.println(Arrays.toString(array));

    }


}
