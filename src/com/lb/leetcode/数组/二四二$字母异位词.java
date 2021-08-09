package com.lb.leetcode.数组;

/**
 * @author: liuben
 * @date: 2021/8/3
 */
public class 二四二$字母异位词 {

    public static boolean isAnagram(String s, String t) {
        int[] record = new int[26];
        for (char c : s.toCharArray()) {
            record[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            record[c - 'a'] -= 1;
        }
        for (int i : record) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String  s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
