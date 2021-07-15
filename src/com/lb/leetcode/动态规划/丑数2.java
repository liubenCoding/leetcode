package com.lb.leetcode.动态规划;

/**
 * @author: liuben
 * @date: 2021/7/15
 */
public class 丑数2 {

    /**
     * 最主要的一点是要明白,丑数是如何诞生的
     * <p>
     * 一个丑数的由来 只能是 丑数和丑数 相乘得来
     * <p>
     * 用dp数组来装从小到大的丑数
     * <p>
     * 一边用不同的质因子 去分别从小到大乘以dp中得到的丑数，得到较之前更大的丑数
     */
    public int nthUglyNumber(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        // 一开始,质因子乘以 对应下标为1的丑数数组
        int i2 = 1;
        int i3 = 1;
        int i5 = 1;
        for (int i = 2; i <= n; i++) {
            int num2 = dp[i2] * 2, num3 = dp[i3] * 3, num5 = dp[i5] * 5;
            // 取最小
            dp[i] = Math.min(Math.min(num2, num3), num5);
            // 如果该丑数被选择,那么num2 就要更新为最大的，取出比 dp[i2]更大的丑数dp[i2++]去乘以质因子,得到一个新的丑数作为pick的候选
            if (dp[i] == num2) {
                i2++;
            }
            // 这个不用else if 是因为有可能num2和num3有重复的,比如 2*3,3*2,当丑数为6时,候选的就有两个6，所以两个6都要更新成最大的,以后不会再命中6了
            if (dp[i] == num3) {
                i3++;
            }
            if (dp[i] == num5) {
                i5++;
            }
        }
        return dp[n];
    }
}
