package com.lb.leetcode.动态规划.股票问题;

/**
 * @author: liuben
 * @date: 2021/6/7
 */
public class 买卖股票的最佳时机2 {
    /**
     * 动态规划 ：
     * 1. dp容器定义：
     * dp[i][j] : i为第几天 , j表示是否持有该股票  ，所拥有的最大现金
     * <p>
     * 2. dp状态转化方程
     * 第i天不持有股票 : 如果前一天不持有股票,那么就等于前一天不持有股票的现金
     * 2.1如果前一天持有股票,那么今天不持有,就说明卖掉股票了,就可以多得到 prices[i] 现金
     * dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
     * 2.1第i天持有股票 : 如果前一天不持有股票,那么就等于前一天不持有股票的现金-今天持有股票的钱
     * 如果前一天持有股票,那么今天继续持有,就等于前一天持有骨片的现金
     * dp[i][0] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
     * <p>
     * 3.数组初始化 ：
     * 第一天不持有股票,啥都没有  dp[0][0] = 0;
     * 第一天选择持有股票, 需要减去买股票的钱 dp[0][1] = -prices[0]
     * 4. 遍历方式 ,正序
     * <p>
     * 最后一天就不要持有股票了,后面都没时间卖出去了,直接返回当前不持有股票的最大现金状态
     */
    // public int maxProfit(int[] prices) {
    //     int[][] dp = new int[prices.length][2];
    //     dp[0][0] = 0;
    //     dp[0][1] = -prices[0];
    //     for (int i = 1; i < prices.length; i++) {
    //         dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
    //         dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
    //     }
    //     return dp[prices.length-1][0];
    // }

//      public int maxProfit(int[] prices) {
// //        int[][] dp = new int[prices.length][2];
// //        dp[0][0] = 0;
// //        dp[0][1] = -prices[0];
// //        for (int i = 1; i < prices.length; i++) {
// //            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
// //            dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
// //        }
// //        return dp[prices.length-1][0];

//         //数组压缩
//         int noBuy = 0;
//         int buy = -prices[0];
//         for (int i = 1; i < prices.length; i++) {
//             int temp = noBuy;
//             noBuy = Math.max(noBuy, buy + prices[i]);
//             buy = Math.max(buy, temp - prices[i]);
//         }
//         return noBuy;
//     }
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len < 2) return 0;
        int cash = 0;
        int stack = -prices[0];
        for(int i = 1; i < len; i++){
            cash = Math.max(cash, stack + prices[i]);
            stack = Math.max(stack, cash - prices[i]);
        }
        return cash;
    }
}
