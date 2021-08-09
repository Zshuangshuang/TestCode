package 机器人路径;


public class DP {
    public static int walkWays(int m,int n){
        //判断参数的合法性
        if (m == 0 || n == 0){
            return 0;
        }
        //初始化dp数组
        int[][] dp = new int[m][n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                //临界条件
                if (row == 0 || col == 0){
                    dp[row][col] = 1;
                }else {
                    dp[row][col] = dp[row-1][col] + dp[row][col-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        System.out.println(walkWays(3, 3));
    }
}
