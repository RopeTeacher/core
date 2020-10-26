package com.ztx;

/**
 * @Author rope
 * @Date 2020/10/20 13:43
 * @Version 1.0
 */
public class test {
    public int minPathSum(int[][] grid) {
        //f(m)(n) = grid[m][n] + min(f(m-1)(n) , f(m)(n-1))
        int len1 = grid.length;
        int len2 = grid[0].length;
        int [][] dp = new int[len1][len2];
        dp[0][0] = grid[0][0];
        for(int i = 1;i < len1;i++){
            dp[i][0] += grid[i-1][0];
        }
        for(int j = 1;j < len2;j++){
            dp[0][j] += grid[0][j-1];
        }
        for(int i = 1;i < len1;i++){
            for (int j = 1;j < len2;j++){
                dp[i][j] += Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[len1-1][len2-1];
    }

}
