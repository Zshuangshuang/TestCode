package 练习.顺时针打印矩阵;

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
       ArrayList<Integer> result = new ArrayList<>();
       if (matrix.length == 0 || matrix[0].length == 0 || matrix == null){
           return result;
       }
       int up = 0;
       int down = matrix.length-1;
       int left = 0;
       int right = matrix[0].length-1;
       while (true){
           for (int col = left; col <= right; col++) {
               result.add(matrix[up][col]);
           }
           up++;
           if (up > down){
               break;
           }
           for (int row = up; row <= down; row++) {
               result.add(matrix[row][right]);
           }
           right--;
           if (right < left){
               break;
           }
           for (int col = right; col >= left; col--) {
               result.add(matrix[down][col]);
           }
           down--;
           if (down < up){
               break;
           }
           for (int row = down; row >= up; row--) {
               result.add(matrix[row][left]);
           }
           left++;
           if (left > right){
               break;
           }
       }
       return result;
    }
}