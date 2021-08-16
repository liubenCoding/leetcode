package com.lb.leetcode.字符串;

/**
 * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每 2k 个字符反转前 k 个字符。
 * <p>
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "abcdefg", k = 2
 * 输出："bacdfeg"
 * 示例 2：
 * <p>
 * 输入：s = "abcd", k = 2
 * 输出："bacd"
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 104
 * s 仅由小写英文组成
 * 1 <= k <= 104
 *
 * @author: liuben
 * @date: 2021/8/16
 */
public class 五四一$反转字符串2 {

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i += 2 * k) {
            int right = Math.min(chars.length - 1, i + k - 1);
            reserve(chars, i, right);
        }
        return String.valueOf(chars);
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
        System.out.println(五四一$反转字符串2.reverseStr("abcd", 2));
    }
}
