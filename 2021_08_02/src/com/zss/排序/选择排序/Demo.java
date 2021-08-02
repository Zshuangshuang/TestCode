package com.zss.排序.选择排序;

import com.zss.排序.TestData;

import java.util.Arrays;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-08-02 9:27
 */
public class Demo {
    public static void main(String[] args) {
        TestData testData = new TestData();
        int[] array = testData.getArray();
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]){
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }
}
