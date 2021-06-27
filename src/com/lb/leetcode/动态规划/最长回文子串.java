package com.lb.leetcode.动态规划;
//给你一个字符串 s，找到 s 中最长的回文子串。
//
//
//
// 示例 1：
//
//
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
//
//
// 示例 2：
//
//
//输入：s = "cbbd"
//输出："bb"
//
//
// 示例 3：
//
//
//输入：s = "a"
//输出："a"
//
//
// 示例 4：
//
//
//输入：s = "ac"
//输出："a"
//
//
//
//
// 提示：
//
//
// 1 <= s.length <= 1000
// s 仅由数字和英文字母（大写和/或小写）组成
//
// Related Topics 字符串 动态规划

import java.util.Arrays;

/**
 * @author liuben
 * @date 2021/6/27 5:07 下午
 **/
public class 最长回文子串 {


    public static String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        char[] chars = s.toCharArray();
        int start = 0, maxLen = 1;
        System.out.println(Arrays.toString(dp[0]));
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (chars[i] != chars[j]) {
                    dp[i][j] = false;
                } else {
                    if (i - j == 1 || i - j == 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i - 1][j + 1];
                    }
                    if (dp[i][j] && (i - j + 1) > maxLen) {
                        start = j;
                        maxLen = (i - j + 1);
                    }
                }
            }
            System.out.println(Arrays.toString(dp[i]));
        }
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        System.out.println(最长回文子串.longestPalindrome("aaaa"));
    }

}
