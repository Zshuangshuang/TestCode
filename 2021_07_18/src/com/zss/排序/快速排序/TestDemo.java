package com.zss.排序.快速排序;


import java.util.Arrays;

public class TestDemo {
    public static void qSort(int[] array) {
        //递归实现快速排序的方法
        qSortHelper(array,0,array.length-1);
    }

    private static void qSortHelper(int[] array, int left, int right) {
        //如果数组中的元素个数只有0个或1个，排序完成
        if (left >= right){
            return;
        }
        //找到基准值最终的位置记作pos
        int pos = partition(array,left,right);
        //针对基准值左侧元素进行快速排序
        qSortHelper(array,left,pos-1);
        //针对基准值右侧的元素进行快速排序
        qSortHelper(array,pos+1,right);
    }

    private static int partition(int[] array, int left, int right) {
        int beg = left;
        int end = right;
        int ret = array[right];
        while (beg < end){
            //总左往右找，找到第一个大于基准值的元素
            while (beg < end && array[beg] <= ret){
                beg++;
            }
            //从右往左找，找到第一个小于基准值的元素
            while (beg < end && array[end] >= ret){
                end--;
            }
            //交换beg,end下标对应的元素
            swap(array,beg,end);
        }
        //将基准值放到合适的位置
        swap(array,beg,right);
        //返回基准值的下标
        return beg;
    }

    private static void swap(int[] array, int beg, int end) {
        int tmp = array[beg];
        array[beg] = array[end];
        array[end] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        qSort(array);
        System.out.println(Arrays.toString(array));
    }


}
