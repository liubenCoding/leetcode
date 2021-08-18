package com.lb.leetcode.字符串;

/**
 * @author liuben
 * @date 2021/8/18 9:18 下午
 **/
public class 二八$实现subStr {

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        char[] chars = haystack.toCharArray();
        int[] next = getNext(needle);
        char[] needleChars = needle.toCharArray();
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            while (j > 0 && chars[i] != needleChars[j]) {
                j = next[j - 1];
            }
            if (chars[i] == needleChars[j]) {
                j++;
            }
            if (j == needleChars.length) {
                return i - needleChars.length + 1;
            }
        }
        return -1;
    }

    public static int[] getNext(String needle) {
        int[] next = new int[needle.length()];
        int j = 0;
        char[] chars = needle.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            while (j > 0 && chars[i] != chars[j]) {
                j = next[j - 1];
            }
            if (chars[i] == chars[j]) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public static void main(String[] args) {
        System.out.println(二八$实现subStr.strStr("hello", "ll"));
        System.out.println(二八$实现subStr.strStr("aaaaa", "bba"));

    }
}


