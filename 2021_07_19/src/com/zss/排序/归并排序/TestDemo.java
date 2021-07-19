package com.zss.排序.归并排序;


import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {
        mergeSortHelper(array,0,array.length);
    }

    private static void mergeSortHelper(int[] array, int low, int high) {
        if ( high-low <= 1){
            return;
        }
        int mid = (low+high)/2;
        mergeSortHelper(array,low,mid);
        mergeSortHelper(array,mid,high);
        merge(array,low,mid,high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int cur1 = low;
        int cur2 = mid;
        int[] result = new int[high-low];
        int index = 0;
        while (cur1 < mid && cur2 < high){
            if (array[cur1] <= array[cur2]){
                result[index] = array[cur1];
                index++;
                cur1++;
            }else {
                result[index] = array[cur2];
                index++;
                cur2++;
            }
        }
        while (cur1 < mid){
            result[index] = array[cur1];
            index++;
            cur1++;
        }
        while (cur2 < high){
            result[index] = array[cur2];
            index++;
            cur2++;
        }
        for (int i = 0; i < high-low; i++) {
            array[low+i] = result[i];
        }
    }


}
