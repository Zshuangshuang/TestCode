package com.zss.排序.归并排序;


import java.util.Arrays;
/**
 * 1.时间复杂度：O(NlogN)
 * 2.空间复杂度：O(N)
 * 3.稳定性：稳定
 * */
public class TestDemo {
    public static void mergeSort(int[] array){
        mergeSortHelper(array,0,array.length);
    }

    private static void mergeSortHelper(int[] array, int low, int high) {
        if (high - low <= 1){
            return;
        }
        int mid = (low+high) / 2;
        mergeSortHelper(array,low,mid);
        mergeSortHelper(array,mid,high);

        merge(array,low,mid,high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int[] result = new int[high-low];
        int cur1 = low;
        int cur2 = mid;
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
            cur1++;
            index++;
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

    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
