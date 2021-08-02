package com.zss.排序.冒泡排序;

import com.zss.排序.TestData;

import java.util.Arrays;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-08-02 9:24
 */
public class Demo {
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j+1] < array[j]){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }
    public static void main(String[] args) {
        TestData testData = new TestData();
        int[] array = testData.getArray();
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }


}
