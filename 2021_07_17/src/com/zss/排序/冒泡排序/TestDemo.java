package com.zss.排序.冒泡排序;


import java.util.Arrays;
/**
 * 1.时间复杂度：O(n^2)
 * 2.空间复杂度：O(1)
 * 3.稳定性：稳定
* */
public class TestDemo {
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j+1] < array[j]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if (!flg){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,8};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
