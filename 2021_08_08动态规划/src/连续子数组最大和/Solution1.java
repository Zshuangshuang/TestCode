package 连续子数组最大和;

public class Solution1 {
    public int FindGreatestSumOfSubArray(int[] array) {
        //判断参数的合法性
        if (array.length == 0 || array == null){
            return 0;
        }
        int[] dp = new int[array.length];
        //初始化条件
        dp[0] = 0;
        int curNum = array[0];
        int maxNum = array[0];
        for (int i = 1; i < array.length; i++) {
            curNum = Math.max(array[i]+curNum,array[i]);
            if (curNum > maxNum){
                maxNum = curNum;
            }
            dp[i] = maxNum;
        }
        return dp[array.length-1];
    }
}