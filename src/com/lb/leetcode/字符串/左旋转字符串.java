package com.lb.leetcode.字符串;

/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"
 * 示例 2：
 * <p>
 * 输入: s = "lrloseumgh", k = 6
 * 输出: "umghlrlose"
 *
 * @author liuben
 * @date 2021/8/17 10:42 下午
 **/
public class 左旋转字符串 {

    public static String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        reserve(chars, 0, n - 1);
        reserve(chars, n, s.length() - 1);
        reserve(chars, 0, s.length() - 1);
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
        System.out.println(左旋转字符串.reverseLeftWords("lrloseumgh", 6));
    }
}
