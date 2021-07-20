package com.zss.集合.杨辉三角形;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows <= 0){
            return result;
        }
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if (numRows == 1){
            return result;
        }
        List<Integer> secondLine = new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if (numRows == 2){
            return result;
        }
        for (int row = 3; row <= numRows; row++) {
            List<Integer> prevLine = result.get((row-1)-1);
            List<Integer> curLine = new ArrayList<>();
            curLine.add(1);
            for (int col = 2; col < row; col++) {
                int curNum = prevLine.get(col-1-1)+prevLine.get(col-1);
                curLine.add(curNum);
            }
            curLine.add(1);
            result.add(curLine);
        }
        return result;
    }
}