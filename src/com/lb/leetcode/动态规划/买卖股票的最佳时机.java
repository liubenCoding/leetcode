package com.lb.leetcode.动态规划;

/**
 * @author: liuben
 * @date: 2021/6/7
 */
public class 买卖股票的最佳时机 {

    /**
     * f(n) = f(n) -  min(fn-1)
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
