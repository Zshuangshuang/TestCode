package com.zss.排序.堆排序;


import java.util.Arrays;

public class TestDemo {
    public static void heapSort(int[] array){
        //1.对数组进行建大堆
        createHeap(array);
        //2.将堆顶元素和堆尾元素进行交换，然后对堆进行向下调整，并将堆尾元素从堆中删除
        for (int i = 0; i < array.length-1; i++) {
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

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static void createHeap(int[] array) {
        for (int i = (array.length-1-1)/2; i >= 0; i--) {
            shiftDown(array,array.length,i);
        }
    }

    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
