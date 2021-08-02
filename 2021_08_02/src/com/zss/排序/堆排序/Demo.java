package com.zss.排序.堆排序;


import com.zss.排序.TestData;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        TestData testData = new TestData();
        int[] array = testData.getArray();
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void heapSort(int[] array) {
        createHeap(array);
        for (int i = 0; i < array.length; i++) {
            swap(array,0,array.length-1-i);
            shiftDown(array,array.length-1-i,0);
        }
    }

    private static void shiftDown(int[] array, int heapSize, int index) {
        int parent = index;
        int child = 2*parent + 1;
        while (child < heapSize){
            if (child+1 < heapSize && array[child+1] > array[child]){
                child = child+1;
            }
            if (array[parent] < array[child]){
                swap(array,parent,child);
            }else {
                break;
            }
            parent = child;
            child = 2*parent + 1;
        }
    }

    private static void swap(int[] array, int x, int y) {
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }

    private static void createHeap(int[] array) {
        for (int i = (array.length-1-1)/2; i >= 0; i--) {
            shiftDown(array,array.length,i);
        }
    }
}
