package com.lb.leetcode.动态规划;

import java.util.Arrays;

/**
 * @author liuben
 * @date 2021/6/14 5:59 下午
 **/
public class 打家劫舍2 {

    /**
     * 1.dp数组定义 ： dp[i]： 当选择第i的数时，所偷窃到的最大金额
     * 2. 状态转移方程 ：
     * 选第i个数时,那么i-1个数肯定不能选, dp[i] + dp[i-2]
     * 不选第i个数,那么当前最大金额为 dp[i-1]
     * 所以方程为 dp[i] = max(dp[i] + dp[i-2],dp[i-1])
     * 3. dp数组初始化：dp[0] = 0,dp[1] = 1
     * 4. 遍历方式，正序遍历
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
            System.out.println(second);
            first = temp;
        }
        return second;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 8,2,8, 4};
        打家劫舍2.rob(nums);
    }
}
