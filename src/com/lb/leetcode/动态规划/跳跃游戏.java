package com.lb.leetcode.动态规划;

/**
 * @author liuben
 * @date 2021/7/3 7:02 下午
 **/
public class 跳跃游戏 {


    /**
     * 解题思路1:判断到当前位置时，还剩余可走几步
     *
     * 1. dp容器定义 ：  dp[i] 走到第i步时,剩余可走步数
     * 2. dp转化方程:
     * 当走到第i步时,判断是当前下标数组元素是否大于之前剩余的可走步数
     * 取更大的剩余步数往下走
     * 一步一步的走上一步的剩余可走步数当了当前这步,则要减一
     * 如果等于0,则表示不可往下走，返回false，
     * 则有状态转移方程  dp[i] = max(dp[i-1]-1,nums[i])
     * 3. 数组初始化 : dp[0] = nums[i]
     * 4. 遍历方式,正序遍历,从第0个位置走到第len-1个位置，判断每个位置的最大可剩余
     *
     *
     * 解题思路1:判断到当前位置时，加上当前的可跳跃步数,最多能走到哪个位置
     *
     */
    public static boolean canJump(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) return false;
            // 最多能走到第几个位置
            k = Math.max(k, i + nums[i]);
            System.out.println(k);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(跳跃游戏.canJump(nums));
    }
}
