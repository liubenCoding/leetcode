package com.lb.leetcode.动态规划.背包问题.完全背包;

import java.util.Arrays;
import java.util.List;

/**
 * @author: liuben
 * @date: 2021/7/13
 */
public class 拆分单词 {

    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (String word : wordDict) {
                int len = word.length();
                if (i >= len && s.substring(i - len, i).equals(word)) {
                    dp[i] = dp[i] || dp[i - len];
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "dogs";
        String[] wordDictStr = {"dog", "s", "gs"};
        System.out.println(拆分单词.wordBreak(s, Arrays.asList(wordDictStr)));
    }
}
