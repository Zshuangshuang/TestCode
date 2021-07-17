package com.zss.排序.选择排序;


import java.util.Arrays;

/**
 *思路：
 * 1.将整个数组分为[0,bound)作为已排序区间，[bound,size)作为待排序区间
 * 2.用cur遍历待排序区间的元素去和bound位置的元素作比较，每次找数组中的最小值放进已排序区间
 * 3.重复上述步骤，直至数组有序
 * */
public class TestDemo {
    public static void selectSort(int[] array){
        for (int bound = 0; bound < array.length; bound++) {
            for (int cur = bound+1; cur < array.length; cur++) {
                if (array[cur] < array[bound]){
                    int tmp = array[cur];
                    array[cur] = array[bound];
                    array[bound] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
