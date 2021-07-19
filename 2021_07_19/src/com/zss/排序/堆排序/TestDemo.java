package com.zss.排序.堆排序;


import java.util.Arrays;
/**
 * 1.时间复杂度：O(NlogN)
 * 2.空间复杂度：O(1)
 * 3.稳定性：不稳定
 * */
public class TestDemo {
    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
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

    private static void createHeap(int[] array) {
        for (int i = (array.length-1-1)/2; i >= 0; i--) {
            shiftDown(array,array.length,i);
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
                swap(array,child,parent);
            }else {
                break;
            }
            parent = child;
            child = 2*parent + 1;
        }
    }

    private static void swap(int[] array, int child, int parent) {
        int tmp = array[parent];
        array[parent] = array[child];
        array[child] = tmp;
    }
}
