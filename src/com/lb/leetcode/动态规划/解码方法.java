package com.lb.leetcode.动态规划;

/**
 * @author: liuben
 * @date: 2021/7/14
 */
public class 解码方法 {

    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for (int i = 1;i < s.length();i++) {
            if (s.charAt(i) != '0') {
                dp[i] = dp[i-1];
            }
            int tmp = (s.charAt(i-1) - '0') * 10 + s.charAt(i) - '0';
            if (tmp >= 10 && tmp <= 26) {
                if (i == 1) {
                    dp[i] += 1;
                }else {
                    dp[i] += dp[i-2];
                }
            }
        }
        return dp[s.length()-1];
    }

}
