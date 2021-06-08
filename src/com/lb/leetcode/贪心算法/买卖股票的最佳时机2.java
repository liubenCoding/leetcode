package com.lb.leetcode.贪心算法;

/**
 * @author: liuben
 * @date: 2021/6/8
 */
public class 买卖股票的最佳时机2 {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit += Math.max(prices[i] - prices[i - 1], 0);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(买卖股票的最佳时机2.maxProfit(prices));
    }

}
