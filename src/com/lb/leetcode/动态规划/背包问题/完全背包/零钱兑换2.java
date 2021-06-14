package com.lb.leetcode.动态规划.背包问题.完全背包;

import java.util.Arrays;

/**
 * @author liuben
 * @date 2021/6/11 9:21 下午
 **/
public class 零钱兑换2 {
    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 1; i <= coins.length; i++) {
            System.out.println(Arrays.toString(dp));
            int val = coins[i - 1];
            for (int j = val; j <= amount; j++) {
                dp[j] += dp[j - val];
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,3};
        System.out.println(零钱兑换2.change(5,coins));
    }
}
