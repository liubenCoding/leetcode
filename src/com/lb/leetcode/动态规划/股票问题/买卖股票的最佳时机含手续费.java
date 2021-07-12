package com.lb.leetcode.动态规划.股票问题;

/**
 * @author: liuben
 * @date: 2021/7/12
 */
public class 买卖股票的最佳时机含手续费 {

    public static int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i] - fee);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[prices.length - 1][0];
    }

    public static void main(String[] args) {
        //int[] nums = {1, 3, 2, 8, 4, 9};
        int[] nums = {1,3,7,5,10,3};
        System.out.println(买卖股票的最佳时机含手续费.maxProfit(nums,3));
    }
}
