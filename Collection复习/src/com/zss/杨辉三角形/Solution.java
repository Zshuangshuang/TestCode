package com.zss.杨辉三角形;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        //(1)判断参数的合法性
        if (numRows <= 0){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        //(2)处理第一行,第一行只有一个元素是1
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if (numRows == 1){
            return result;
        }
        //(3)处理第二行,有2个1
        List<Integer> secondLine = new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if (numRows == 2){
            return result;
        }
        //(3)处理第row行,从第三行开始
        for (int row = 3; row <= numRows; row++) {
            //得到row-1行的值,再次减1是为了获取下标值
            List<Integer> prevLine = result.get((row-1)-1);
            List<Integer> curLine = new ArrayList<>();
            //第row行第col列的元素=row-1行col列的元素的值+row-1行col-1列的元素的值
            curLine.add(1);
            for (int col = 2; col < row; col++) {
                int curNum = prevLine.get((col-1)-1)+prevLine.get(col-1);
                curLine.add(curNum);
            }
            curLine.add(1);
            result.add(curLine);
        }
        return result;
    }
}
