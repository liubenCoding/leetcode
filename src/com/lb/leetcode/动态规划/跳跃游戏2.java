package com.lb.leetcode.动态规划;

import java.util.Arrays;

/**
 * @author liuben
 * @date 2021/7/3 7:02 下午
 **/
public class 跳跃游戏2 {


    /**
     * 1.dp容器定义 ： dp[i] 走到当前位置的最小跳跃数
     * 2.dp转化方程 ：
     */
    public static int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, nums[i] + i);
            // 已经走到了当前跳跃步数的边界，不得不再跳一次
            if (i == end) {
                //当前步骤能达到的最远位置
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }


    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 2, 3};
        System.out.println(跳跃游戏2.jump(nums));
    }
}
