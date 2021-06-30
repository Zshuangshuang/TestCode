package com.zss.review;


public class Demo5 {
    public static int binarySearch(int key,int[] array){
        int left = 0;
        int right = array.length-1;
        while (left < right){
            int middle = (left+right)/2;
            if (array[middle] == key){
                return middle;
            }else if (array[middle] < key){
                left = middle+1;
            }else {
                right = middle-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {2,3,5,6,12,34,49};
        System.out.println(binarySearch(6, array));
    }
}
