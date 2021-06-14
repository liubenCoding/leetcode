package com.lb.leetcode.动态规划;

//你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上
//被小偷闯入，系统会自动报警。
//
// 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
//
//
//
// 示例 1：
//
//
//输入：[1,2,3,1]
//输出：4
//解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
//     偷窃到的最高金额 = 1 + 3 = 4 。
//
// 示例 2：
//
//
//输入：[2,7,9,3,1]
//输出：12
//解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
//     偷窃到的最高金额 = 2 + 9 + 1 = 12 。
//
//
//
//
// 提示：
//
//
// 1 <= nums.length <= 100
// 0 <= nums[i] <= 400
//
// Related Topics 动态规划

import java.util.Arrays;

/**
 * @author liuben
 * @date 2021/6/14 5:59 下午
 **/
public class 打家劫舍 {

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
        int[] dp = new int[nums.length+1];
        if (nums.length == 1) {
            return nums[0];
        }
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(nums[i-1] + dp[i - 2], dp[i - 1]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {2,1,1,2};
        打家劫舍.rob(nums);
    }
}
