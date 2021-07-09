package com.lb.leetcode.动态规划;

/**
 * @author liuben
 * @date 2021/7/9 10:30 下午
 **/
public class 环形子数组的最大和 {

    public static int maxSubarraySumCircular(int[] nums) {
        int max = nums[0];
        int dp = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp = nums[i] + Math.max(dp, 0);
            max = Math.max(dp, max);
            sum += nums[i];
        }
        dp = nums[0];
        int min = 0;
        for (int i = 1; i < nums.length-1; i++) {
            dp = nums[i] + Math.min(dp, 0);
            min = Math.min(dp, min);
        }

        return Math.max(max,sum - min);
    }
}
