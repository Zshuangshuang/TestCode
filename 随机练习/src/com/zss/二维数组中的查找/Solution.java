package com.zss.二维数组中的查找;


public class Solution {
    public boolean Find(int target, int [][] array) {
        //判断参数的合法性
        int rows = array.length;
        if (rows == 0){
            return false;
        }
        int cols = array[0].length;
        if (cols == 0){
            return false;
        }
        int row = rows-1;
        int col = 0;
        while (row >= 0 && col < cols){
            if (target > array[row][col]){
                col++;
            }else if (target == array[row][col]){
                return true;
            }else {
                row--;
            }
        }
        return false;
    }
}
