package com.lb.leetcode.数组;

/**
 * @author: liuben
 * @date: 2021/6/7
 */
public class 最大子序和 {

    // [-2,1,-3,4,-1,2,1,-5,4];
    // 贪心算法
    //public int maxSubArray(int[] nums) {
    //    if (nums.length == 0) {
    //        return nums[0];
    //    }
    //    int maxSubArrSum = nums[0];
    //    int sum = nums[0];
    //    for (int i = 1; i < nums.length; i++) {
    //        sum = Math.max(sum, 0);
    //        sum += nums[i];
    //        maxSubArrSum = Math.max(sum, maxSubArrSum);
    //    }
    //    return maxSubArrSum;
    //}

    // 动态规划 f(n) = max(f(n-1) + nums[n],nums[n]);
    public static int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int num : nums) {
            //pre = Math.max(pre + num, num);
            pre = (pre >= 0) ? (pre + num) : num;
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(最大子序和.maxSubArray(nums));
    }

}
