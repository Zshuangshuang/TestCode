package com.zss.排序.插入排序;

import com.zss.排序.TestData;

import java.util.Arrays;

public class Demo {
    public static void insertSort(int[] array){
        long start = System.currentTimeMillis();
        for (int bound = 1; bound < array.length; bound++) {
            int pos = bound-1;
            int ret = array[bound];
            for (; pos >= 0; pos--) {
                if (array[pos] > ret){
                    array[pos+1] = array[pos];
                }else {
                    break;
                }
            }
            array[pos+1] = ret;
        }
        long end = System.currentTimeMillis();
        System.out.println("排序时间："+(end-start)+"ms");
    }
    public static void main(String[] args) {
        TestData testData = new TestData();
        int[] array = testData.getArray();
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
