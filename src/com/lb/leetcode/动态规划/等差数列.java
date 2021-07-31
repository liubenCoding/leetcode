package com.lb.leetcode.动态规划;

/**
 * @author: liuben
 * @date: 2021/7/14
 */
public class 等差数列 {

    //public static int numberOfArithmeticSlices(int[] nums) {
    //    int sum = 0;
    //    int n = nums.length;
    //    int ans = 0;
    //    for (int i = 2; i < n; i++) {
    //        if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
    //            sum = sum + 1;
    //            ans += sum;
    //        } else {
    //            sum = 0;
    //        }
    //    }
    //    return ans;
    //}


    public static int numberOfArithmeticSlices(int[] nums) {
        int[] dp = new int[nums.length];
        int n = nums.length;
        int ans = 0;
        for (int i = 2; i < n; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {

                // 先标记当前位置可以构成一个等差数列
                dp[i] = 1;
                // 如果前面也是个等差数列,
                if (dp[i - 1] != 0) {
                    // 那么,nums[i-1]构成等差数列的任意一种情况的末尾加上nums[i] 都可以构成一个新的等差数列，因为是连贯的，
                    // 所以要加上 dp[i - 1]
                    dp[i] += dp[i - 1];
                }
                // 由于每次的构成等差数列的数组都是不同的,所以结果 对其进行累加
                ans += dp[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        //int[] nums = {1, 2, 3, 8, 9, 10};
        System.out.println(等差数列.numberOfArithmeticSlices(nums));
    }
}
