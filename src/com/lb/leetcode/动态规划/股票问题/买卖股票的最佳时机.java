package com.lb.leetcode.动态规划.股票问题;

/**
 * @author: liuben
 * @date: 2021/6/7
 */
public class 买卖股票的最佳时机 {

    /**
     * f(n) = f(n) -  min(fn-1)
     */
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(买卖股票的最佳时机.maxProfit(prices));
    }
}
