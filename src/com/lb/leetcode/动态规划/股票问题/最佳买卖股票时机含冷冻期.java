package com.lb.leetcode.动态规划.股票问题;

/**
 * 给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。​
 * <p>
 * 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
 * <p>
 * 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
 * 示例:
 * <p>
 * 输入: [1,2,3,0,2]
 * 输出: 3
 * 解释: 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出]
 * <p>
 *
 * @author: liuben
 * @date: 2021/7/12
 */
public class 最佳买卖股票时机含冷冻期 {

    /**
     * // dp[i][0] : 持有股票
     * // dp[i][1] : 不持有股票，本日卖出，下一天为冷冻期
     * // dp[i][2] : 不持有股票，本日无卖出，下一天非冷冻期
     */
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int res = 0;
        int len = prices.length;
        // dp[i][0] : 持有股票
        // dp[i][1] : 不持有股票，本日卖出，下一天为冷冻期
        // dp[i][2] : 不持有股票，本日无卖出，下一天非冷冻期
        int[][] dp = new int[len][3];

        //初始状态:
        // 1: 第一天持有，只有可能是买入
        dp[0][0] = -prices[0];

        // 其实dp[0][1]、dp[0][2] 都不写，默认为0也对
        // 2. 第0天，相当于当天买入卖出，没有收益，并造成下一天冷冻期，减少选择。综合认为是负收益
        dp[0][1] = Integer.MIN_VALUE;

        // 3. 相当于没买入，收益自然为0
        dp[0][2] = 0;

        for (int i = 1; i < len; i++) {
            // 持有股票： 1.昨天持有股票 2.本日买入（条件：昨天不持有，且不是卖出）
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] - prices[i]);

            //本日卖出 : (条件:昨天持有)
            dp[i][1] = dp[i - 1][0] + prices[i];

            // 不持有，但也不是卖出 : 1.昨天卖出，不持有  2.昨天没卖出，但也不持有
            dp[i][2] = Math.max(dp[i - 1][1], dp[i - 1][2]);
        }

        // 最后一天还持有股票是没有意义的,肯定是不持有的收益高，不用对比 dp[len-1][0]
        return Math.max(dp[len - 1][1], dp[len - 1][2]);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 0, 2};
        System.out.println(最佳买卖股票时机含冷冻期.maxProfit(nums));
    }
}
