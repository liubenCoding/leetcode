package com.lb.leetcode.动态规划;

/**
 * @author liuben
 * @date 2021/7/11 1:22 下午
 **/
public class 最佳观光组合 {

    public static int maxScoreSightseeingPair(int[] values) {
        int maxI = 0;
        int ans = 0;
        for (int i = 0; i < values.length; i++) {
            ans = Math.max(ans, maxI + values[i] - i);
            maxI = Math.max(maxI, values[i] + i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] values = {8, 1, 5, 2, 6};
//        int[] values = {2, 2, 2};
        System.out.println(最佳观光组合.maxScoreSightseeingPair(values));
    }
}
