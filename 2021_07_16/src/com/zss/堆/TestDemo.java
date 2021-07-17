package com.zss.堆;

import java.util.Arrays;

public class TestDemo {
    public static void shiftDown(int[] array,int size,int index){
        //1.index表示parent节点的下标
        int parent = index;
        //2.找到左孩子的下标
        int leftChild = parent*2 +1;
        while (leftChild < size){
            if (leftChild+1 < size && array[leftChild+1] < array[leftChild]){
                leftChild = leftChild+1;
            }
            if (array[leftChild] < array[parent]){
                int tmp = array[leftChild];
                array[leftChild] = array[parent];
                array[parent] = tmp;
            }else {
                break;
            }
            parent = leftChild;
            leftChild = 2*parent+1;
        }
    }
    public static void createHeap(int[] arr,int size){
        for (int i = (size-1-1)/2; i >= 0 ; i--) {
            shiftDown(arr,arr.length,i);
        }
    }
    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        createHeap(array,array.length);
        System.out.println(Arrays.toString(array));
    }
}
