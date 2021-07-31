package com.lb.leetcode.动态规划;

/**
 * @author liuben
 * @date 2021/7/10 12:58 下午
 **/
public class 乘积为正数的最长子数组长度 {

    /**
     * 当前数为正数时,负数长度 = 负数数组有长度，长度+1，否则为0，整数数组 ++;
     * 当前数为负数时,负数长度等于整数数组长度+1,整数长度等于之前为负数乘积时,负数长度+1，否则正数长度清0
     **/
    public static int getMaxLen(int[] nums) {
        int maxLen = nums[0] > 0 ? 1 : 0;
        int minLen = nums[0] < 0 ? 1 : 0;
        int maxVal = maxLen;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                maxLen++;
                minLen = minLen > 0 ? minLen + 1 : 0;
            } else if (nums[i] < 0) {
                int newMaxLen = minLen > 0 ? minLen + 1 : 0;
                // 负数数组长度+1
                int newMinLen = maxLen + 1;
                maxLen = newMaxLen;
                minLen = newMinLen;
            } else {
                maxLen = 0;
                minLen = 0;
            }
            maxVal = Math.max(maxVal, maxLen);
        }
        return maxVal;
    }

    public static void main(String[] args) {
//        int[] nums = {0,1, -2, -3, 4};
//        int[] nums = {-1, -2, -3, 0, 1};
//        int[] nums = {1,2,3,5,-6,4,0,10};
//        int[] nums = {1, -2, -3, 4};
//        int[] nums = {-1, 2};
//        int[] nums = {-16, 0, -5, 2, 2, -13, 11, 8};
        int[] nums = {9, 10, 1, 0, 19, 20, -28, 30, -12, 20, 11, -8, 7, 21, -26};
        System.out.println(乘积为正数的最长子数组长度.getMaxLen(nums));
    }
}
