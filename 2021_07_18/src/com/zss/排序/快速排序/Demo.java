package com.zss.排序.快速排序;


import java.util.Arrays;
import java.util.Stack;

public class Demo {
    public static void qSort(int[] array){
        if (array.length == 0){
            return;
        }
        //借助栈来保存左右边界的下标
        Stack<Integer> stack = new Stack<>();
        stack.push(array.length-1);
        stack.push(0);
        while (!stack.isEmpty()){
            int left = stack.pop();
            int right = stack.pop();
            if (left >= right){
                continue;
            }
            int pos = partition(array,left,right);
            stack.push(right);
            stack.push(pos+1);
            stack.push(pos-1);
            stack.push(left);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int beg = left;
        int end = right;
        int ret = array[right];
        while (beg < end){
            while (beg < end && array[beg] <= ret){
                beg++;
            }
            while (beg < end && array[end] >= ret){
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

    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        qSort(array);
        System.out.println(Arrays.toString(array));
    }
}