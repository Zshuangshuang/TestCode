package com.zss.排序.选择排序;


import java.util.Arrays;
/**
 * 1.时间复杂度：O(n^2)
 * 2.空间复杂度：O(1)
 * 3.稳定性：不稳定
 * */
public class TestDemo {
    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectSort(int[] array) {
        for (int bound = 0; bound < array.length; bound++) {
            for (int i = bound+1; i < array.length; i++) {
                if (array[i] < array[bound]){
                    int tmp = array[i];
                    array[i] = array[bound];
                    array[bound] = tmp;
                }
            }
        }
    }
}
