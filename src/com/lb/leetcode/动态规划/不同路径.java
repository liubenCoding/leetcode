package com.lb.leetcode.动态规划;
//一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
//
// 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
//
// 问总共有多少条不同的路径？
//
//
//
// 示例 1：
//
//
//输入：m = 3, n = 7
//输出：28
//
// 示例 2：
//
//
//输入：m = 3, n = 2
//输出：3
//解释：
//从左上角开始，总共有 3 条路径可以到达右下角。
//1. 向右 -> 向下 -> 向下
//2. 向下 -> 向下 -> 向右
//3. 向下 -> 向右 -> 向下
//
//
// 示例 3：
//
//
//输入：m = 7, n = 3
//输出：28
//
//
// 示例 4：
//
//
//输入：m = 3, n = 3
//输出：6
//
//
//
// 提示：
//
//
// 1 <= m, n <= 100
// 题目数据保证答案小于等于 2 * 109
//
// Related Topics 数组 动态规划
// 👍 1017 👎 0

import java.util.Arrays;

/**
 * @author liuben
 * @date 2021/6/14 10:06 下午
 **/
public class 不同路径 {

    /**
     * 1. dp数组含义：dp[i][j] 到达 i,j点的不同路径数
     * 2. 数组初始化 & 状态转移方程式：
     * 1. 当处在原点时,只有原地不动一种方案 dp[0][0]=1
     * 2. 当要到达第一行的任意一点时，只有向右一直走一种路径,所以有 dp[0][i] = 1
     * 3. 当要到达第一列的任意一点时,也只有向下一直走一种路径,所以有 dp[j][0] = 1
     * 4. 当要到达 i,j点时,只有到i-1,j向下走,或者i,j-1，向右走两种方式,
     * 所以,状态转移方程式为 ： dp[i][j] = dp[i-1][j]+ dp[i][j-1]
     * 3. 遍历方式 ： 从起点开始,i,j两层循环,到达终点
     */
//    public static int uniquePaths(int m, int n) {
//        int[][] dp = new int[m][n];
//        for (int i = 0; i < m; i++) dp[i][0] = 1;
//        for (int i = 0; i < n; i++) dp[0][i] = 1;
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
//            }
//            System.out.println(Arrays.toString(dp[i]));
//        }
//        return dp[m - 1][n - 1];
//    }

    /**
     * 空间优化写法,滚动数组,永远只保存上一层的方案,然后最新一层从左开始更新 ： dp[j] = dp[j - 1](左边这个格子) + dp[j]（上一层）
     */
    public static int uniquePaths(int m, int n) {
        int cycleTimes = Math.min(m,n);
        int[] dp = new int[cycleTimes];
        for (int i = 0; i < cycleTimes; i++) dp[i] = 1;
        for (int i = 1; i < Math.max(m,n); i++) {
            for (int j = 1; j < cycleTimes; j++) {
                dp[j] = dp[j - 1] + dp[j];
            }
        }
        return dp[cycleTimes - 1];
    }

    public static void main(String[] args) {
        System.out.println(不同路径.uniquePaths(3, 7));
    }
}
