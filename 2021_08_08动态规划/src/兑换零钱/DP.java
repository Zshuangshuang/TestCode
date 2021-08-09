package 兑换零钱;

import java.util.Arrays;

public class DP {
    public static int minCoinNums(int[] coins,int money){
      //判断参数的合法性
        if (coins.length == 0 || coins == null || money <= 0){
            return -1;
        }
        //初始化dp数组
        int[] dp = new int[money+1];
        //初始化金额为i的硬币数
        Arrays.fill(dp,money+1);
        //初始化初始条件
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                //金额数大于等于硬币的面值，就求当前金额所需要的最小硬币个数
                if (i >= coins[j]){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[money] > money ? -1 : dp[money];
    }
    public static void main(String[] args) {
        int[] coins = {2,5,7};
        System.out.println(minCoinNums(coins, 27));
    }
}
