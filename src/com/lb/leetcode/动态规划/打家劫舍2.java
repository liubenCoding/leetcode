package com.lb.leetcode.动态规划;

/**
 * @author liuben
 * @date 2021/6/14 5:59 下午
 **/
public class 打家劫舍2 {

    /**
     * 首尾都不取，肯定小于只取首或者只取尾的队列
     */
    public static int rob(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        } else if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(robRange(nums, 0, length - 2), robRange(nums, 1, length - 1));
    }

    public static int robRange(int[] nums, int start, int end) {
        int first = nums[start], second = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 8, 2, 8, 4};
        打家劫舍2.rob(nums);
    }
}
