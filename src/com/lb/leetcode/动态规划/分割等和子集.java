package com.lb.leetcode.动态规划;


//给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
//
//
//
// 示例 1：
//
//
//输入：nums = [1,5,11,5]
//输出：true
//解释：数组可以分割成 [1, 5, 5] 和 [11] 。
//
// 示例 2：
//
//
//输入：nums = [1,2,3,5]
//输出：false
//解释：数组不能分割成两个元素和相等的子集。
//
//
//
//
// 提示：
//
//
// 1 <= nums.length <= 200
// 1 <= nums[i] <= 100
//
// Related Topics 动态规划
// 👍 818 👎 0


import java.util.ArrayList;
import java.util.List;

public class 分割等和子集 {

    //public static boolean canPartition(int[] nums) {
    //    int sum = 0;
    //    for (int num : nums) {
    //        sum += num;
    //    }
    //    int target = sum / 2;
    //    if (sum % 2 == 1) {
    //        return false;
    //    }
    //    int[][] dp = new int[nums.length][target + 1];
    //    for (int j = 0; j <= target; j++) {
    //        dp[0][j] = (nums[0] > j ? 0 : nums[0]);
    //    }
    //    for (int i = 1; i < nums.length; i++) {
    //        for (int j = 0; j <= target; j++) {
    //            int n = dp[i - 1][j];
    //            int y = j >= nums[i] ? (dp[i - 1][j - nums[i]] + nums[i]) : 0;
    //            dp[i][j] = Math.max(n, y);
    //        }
    //    }
    //    return dp[nums.length - 1][target] == target;
    //}

    //public boolean canPartition(int[] nums) {
    //    int sum = 0;
    //    for (int num : nums) {
    //        sum += num;
    //    }
    //    int target = sum / 2;
    //    if (sum % 2 == 1) {
    //        return false;
    //    }
    //    // 将dp二维数组优化为滚动一位数组
    //    int[] dp = new int[target + 1];
    //    for (int j = 0; j <= target; j++) {
    //        dp[j] = (nums[0] > j ? 0 : nums[0]);
    //    }
    //    for (int i = 1; i < nums.length; i++) {
    //        // 循环伊始,保存的是dp[i-1][j]的情况
    //        // 为了防止上一层循环的dp[0,...,j-1]被覆盖，循环的时候 j 只能逆向枚举,
    //        for (int j = target; j >= 0; j--) {
    //            int n = dp[j];
    //            int y = j >= nums[i] ? (dp[j - nums[i]] + nums[i]) : 0;
    //            dp[j] = Math.max(n, y);
    //        }
    //    }
    //    return dp[target] == target;
    //}

    public static boolean canPartition(int[] nums) {
        int n = nums.length;

        //「等和子集」的和必然是总和的一半
        int sum = 0;
        for (int i : nums) sum += i;
        int target = sum / 2;

        // 对应了总和为奇数的情况，注定不能被分为两个「等和子集」
        if (target * 2 != sum) return false;

        // 将「物品维度」取消
        int[] f = new int[target + 1];
        for (int i = 0; i < n; i++) {
            int t = nums[i];
            // 将「容量维度」改成从大到小遍历
            for (int j = target; j >= 0; j--) {
                // 不选第 i 件物品
                int no = f[j];
                // 选第 i 件物品
                int yes = j >= t ? f[j-t] + t : 0;
                f[j] = Math.max(no, yes);
            }
        }
        // 如果最大价值等于 target，说明可以拆分成两个「等和子集」
        return f[target] == target;
    }


    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        System.out.println(分割等和子集.canPartition(nums));
    }
}
