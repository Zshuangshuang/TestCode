package com.zss.排序.快速排序;

import com.zss.排序.TestData;

import java.util.Arrays;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-08-02 9:40
 */
public class Demo {
    public static void main(String[] args) {
        TestData testData = new TestData();
        int[] array = testData.getArray();
        qSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void qSort(int[] array) {
        qSortHelper(array,0,array.length-1);
    }

    private static void qSortHelper(int[] array,int left,int right) {
        if (left >= right){
            return;
        }
        int pos = partition(array,left,right);
        qSortHelper(array,left,pos-1);
        qSortHelper(array,pos+1,right);
    }

    private static int partition(int[] array, int left, int right) {
        int cur1 = left;
        int cur2 = right;
        int ret = array[right];
        while (cur1 < cur2){
            while (cur1 < cur2 && array[cur1] <= ret){
                cur1++;
            }
            while (cur1 < cur2 && array[cur2] >= ret){
                cur2--;
            }
            swap(array,cur1,cur2);
        }
        swap(array,cur1,right);
        return cur1;
    }

    private static void swap(int[] array, int cur1, int cur2) {
        int tmp = array[cur1];
        array[cur1] = array[cur2];
        array[cur2] = tmp;
    }
}
