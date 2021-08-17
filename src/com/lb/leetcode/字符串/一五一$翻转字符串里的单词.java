package com.lb.leetcode.字符串;

/**
 * @author: liuben
 * @date: 2021/8/17
 */
public class 一五一$翻转字符串里的单词 {

    public static String reverseWords(String s) {
        String trimStr = removeSpace(s);
        char[] chars = trimStr.toCharArray();
        reserve(chars, 0, chars.length - 1);
        reserveEachWord(chars);
        return String.valueOf(chars);
    }

    public static String removeSpace(String s) {
        StringBuilder newS = new StringBuilder();
        int start = 0;
        int end = s.length() - 1;
        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;
        while (start <= end) {
            char c = s.charAt(start);
            if (c != ' ' || newS.charAt(newS.length() - 1) != ' ') {
                newS.append(c);
            }
            start++;
        }
        return newS.toString();
    }

    public static void reserveEachWord(char[] chars) {
        int left = 0;
        int right = 0;
        for (int i = 0; i <= chars.length; i++) {
            if (i == chars.length || chars[i] == ' ') {
                reserve(chars, left, right - 1);
                left = i + 1;
                right = i + 1;
            } else {
                right++;
            }
        }
    }

    public static void reserve(char[] chars, int left, int right) {
        char temp;
        while (left < right) {
            temp = chars[right];
            chars[right] = chars[left];
            chars[left] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        System.out.println(一五一$翻转字符串里的单词.reverseWords("the sky is blue"));
    }
}
