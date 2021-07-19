package com.zss.排序.快速排序;


import java.util.Arrays;
/**
 * 1.时间复杂度：最好O(NlogN) 最坏O(n^2)
 * 2.空间复杂度：最好O(logN) 最坏O(N)
 * 3.稳定性：不稳定
 * */
public class TestDemo {
    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        qSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void qSort(int[] array) {
        qSortHelper(array,0,array.length-1);
    }

    private static void qSortHelper(int[] array, int left, int right) {
        if (left >= right){
            return;
        }
        int pos = partition(array,left,right);
        qSortHelper(array,left,pos-1);
        qSortHelper(array,pos+1,right);
    }

    private static int partition(int[] array, int left, int right) {
        int beg = left;
        int end = right;
        int bound = array[right];
        while (beg < end){
            while (beg < end && array[beg] <= bound){
                beg++;
            }
            while (beg < end && array[end] >= bound){
                end--;
            }
            swap(array,beg,end);
        }
        swap(array,beg,right);
        return beg;
    }

    private static void swap(int[] array, int beg, int end) {
        int tmp = array[beg];
        array[beg] = array[end];
        array[end] = tmp;
    }


}
