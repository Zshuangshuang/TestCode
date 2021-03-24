package 二进制中1的个数;

public class Solution {
    public int NumberOf1(int n) {
        //定义一个count负责记录某个数字中1的个数
        int count = 0;
        while (n != 0){
            count++;
            //每次让n&(n-1)
            n = n&(n-1);
        }
        return count;


    }
}