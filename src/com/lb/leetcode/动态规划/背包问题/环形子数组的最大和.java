package com.lb.leetcode.动态规划.背包问题;

import java.util.Arrays;

/**
 * @author: liuben
 * @date: 2021/7/9
 */
public class 环形子数组的最大和 {

    public static int maxSubarraySumCircular(int[] nums) {
        int[] newNums = new int[nums.length * 2 - 1];
        for (int i = 0; i < newNums.length; i++) {
            newNums[i] = nums[i % (nums.length)];
        }
        int temp = newNums[0];
        int maxSum = newNums[0];
        for (int i = 1; i < newNums.length; i++) {
            temp = temp > 0 ? temp + newNums[i] : newNums[i];
            maxSum = Math.max(maxSum, temp);
            //System.out.println(Arrays.toString(dp));
        }
        System.out.println(Arrays.toString(newNums));
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {5, -3, 5};
        System.out.println(环形子数组的最大和.maxSubarraySumCircular(nums));
    }

}
