package com.zss.算法习题.二维数组中的查找;

//时间复杂度：O(1)
public class Solution {
    public boolean Find(int target, int [][] array) {
        int rows = array.length;
        if (rows == 0){
            return false;
        }
        int cols = array[0].length;
        if (cols == 0){
            return false;
        }
        int row = array.length-1;
        int col = 0;
        while (row >= 0 && col < cols){
            if (array[row][col] < target){
                col++;
            }else if (array[row][col] == target){
                return true;
            }else {
                row--;
            }
        }
        return false;
    }
}