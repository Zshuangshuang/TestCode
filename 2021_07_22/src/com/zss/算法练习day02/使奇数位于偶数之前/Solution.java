package com.zss.算法练习day02.使奇数位于偶数之前;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param array int整型一维数组 
     * @return int整型一维数组
     */
    public int[] reOrderArray (int[] array) {
       if (array == null || array.length == 0){
           return array;
       }
       int oddPos = 0;//用来记录奇数的位置
       int tmp = 0;//用来保存每个i下标的值
        for (int i = 0; i < array.length; i++) {
            tmp = array[i];
            if (array[i] %2 == 0 ){
                continue;
            }else {
                int evePos = i;//记录偶数的下一位置的下标
                while (evePos > oddPos){
                    array[evePos] = array[evePos-1];
                    evePos--;
                }
                array[oddPos] = tmp;
                oddPos++;
            }
        }
        return array;

    }

}