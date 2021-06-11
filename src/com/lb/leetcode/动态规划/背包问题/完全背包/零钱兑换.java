package com.lb.leetcode.动态规划.背包问题.完全背包;
//给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回
// -1。
//
// 你可以认为每种硬币的数量是无限的。
//
//
//
// 示例 1：
//
//
//输入：coins = [1, 2, 5], amount = 11
//输出：3
//解释：11 = 5 + 5 + 1
//
// 示例 2：
//
//
//输入：coins = [2], amount = 3
//输出：-1
//
// 示例 3：
//
//
//输入：coins = [1], amount = 0
//输出：0
//
//
// 示例 4：
//
//
//输入：coins = [1], amount = 1
//输出：1
//
//
// 示例 5：
//
//
//输入：coins = [1], amount = 2
//输出：2
//
//
//
//
// 提示：
//
//
// 1 <= coins.length <= 12
// 1 <= coins[i] <= 231 - 1
// 0 <= amount <= 104

import java.util.Arrays;

/**
 * @author: liuben
 * @date: 2021/6/11
 */
public class 零钱兑换 {

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        //int[] dp1 = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        //dp1[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if (coins[i] <= j) {
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                    //dp1[j] = Math.max(dp1[j], dp1[j - coins[i]] + coins[i]);
                }
                //dp1[j] = Math.max(dp1[j], dp1[j - coins[i]] + coins[i]);
            }
            System.out.println(Arrays.toString(dp));
        }
        /**
         * 这里为什么可以直接用dp[amount] == amount + 1 来判断是否存在可取方案 ？
         * 因为一开始全部都被初始化成了amount+1
         * 假设{2, 2, 5}  ,11
         *  [0, 12, 1, 12, 2, 12, 3, 12, 4, 12, 5, 12]
         *  [0, 12, 1, 12, 2, 12, 3, 12, 4, 12, 5, 12]
         *  [0, 12, 1, 12, 2, 1,  3, 2,  4, 3,  2, 4]
         *  直接从dp[2][11] = 4 开始逆推, 如果要使p[2][11] = 4，那么dp[2][j - coins[i] (11-4)]  一定不能为初始值12，
         *  那么说明 dp[1][4]也不等于初始值12，要么 nums[1] 可以被 j[4] 整除,要么就是 nums[0] 可以被j[4]整除，一直逆推，就会发现有一条都满足条线的方案线，
         *  反过来说,如果 dp[2][4] 之前等于12的话, 那么 dp[2,11]肯定是等于13, 取较小值,就还是12 ，不会是 <12的数
         */
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public void test() {

        //vector<long long> dp(amount + 1, INT_MAX); //给dp数组每个位置赋初值为INT_MAX是为了最后判断是否能填满amount,要用long long 类型
        //dp[0] = 0;  //dp[i]:换到面值i所用的最小数量
        //for (int coin : coins)
        //{
        //    for (int i = 0; i <= amount; i++)
        //    {
        //        if (coin <= i)
        //            dp[i] = min(dp[i], dp[i - coin] + 1);
        //    }
        //[0, 12, 1, 12, 2, 12, 3, 12, 4, 12, 5, 12]
        //[0, 12, 1, 12, 2, 12, 3, 12, 4, 12, 5, 12]
        //[0, 12, 1, 12, 2, 1,  3, 2,  4, 3,  2, 4]
        //}

        //return dp[amount] == INT_MAX ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {2, 2, 5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}
