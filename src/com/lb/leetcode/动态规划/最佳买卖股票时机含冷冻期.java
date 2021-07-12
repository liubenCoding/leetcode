package com.lb.leetcode.动态规划;

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
     * 我们目前持有一支股票，对应的「累计最大收益」记为 f[i][0]；
     * <p>
     * 我们目前不持有任何股票，并且处于冷冻期中，对应的「累计最大收益」记为 f[i][1]；
     * <p>
     * 我们目前不持有任何股票，并且不处于冷冻期中，对应的「累计最大收益」记为 f[i][2]。
     */

    public static int maxProfit(int[] prices) {
        int[][] profits = new int[prices.length][3];
        profits[0][0] = 0;
        profits[0][1] = -prices[0];
        profits[0][2] = 0;

        int maxProfit;

        for (int i = 1; i < prices.length; i++) {
            // 当前选择不持有,
            // 前一天也不持有,前一天持有,前一天是冷冻期
            profits[i][0] = Math.max(Math.max(profits[i - 1][0], profits[i - 1][1] + prices[i]), profits[i - 1][2]);
            // 当前选择持有,
            // 前一天也不持有,前一天持有,前一天是冷冻期
            profits[i][1] = Math.max(Math.max(profits[i - 1][1], profits[i - 1][0] - prices[i]), profits[i - 1][2]);
            // 当天是冷冻期
            profits[i][2] = Math.max(profits[i - 1][0], profits[i - 1][1] + prices[i]);
        }
        return Math.max(profits[prices.length - 1][0], profits[prices.length - 1][2]);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 0, 2};
        System.out.println(最佳买卖股票时机含冷冻期.maxProfit(nums));
    }
}
