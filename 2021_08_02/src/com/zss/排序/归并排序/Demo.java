package com.zss.排序.归并排序;


import com.zss.排序.TestData;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        TestData testData = new TestData();
        int[] array = testData.getArray();
        mergeSort(array);
        System.out.println(Arrays.toString(array));

    }

    private static void mergeSort(int[] array) {
        mergeSortHelper(array);
    }

    private static void mergeSortHelper(int[] array) {

    }


}
