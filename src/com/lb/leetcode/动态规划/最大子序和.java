package com.lb.leetcode.动态规划;

/**
 * @author: liuben
 * @date: 2021/7/9
 */
public class 最大子序和 {
    public int maxSubArray(int[] nums) {
        int temp = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            temp= temp >0 ? temp+nums[i] :nums[i] ;
            maxSum = Math.max(maxSum, temp);
            //System.out.println(Arrays.toString(dp));
        }
        return maxSum;
    }
}
