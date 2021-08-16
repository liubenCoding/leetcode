package com.lb.leetcode.字符串;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *
 * @author: liuben
 * @date: 2021/8/16
 */
public class 替换空格 {

    public static String replaceSpace(String s) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                s += "  ";
            }
        }
        char[] chars = s.toCharArray();
        int oldP = len - 1;
        int newP = chars.length - 1;
        while (oldP < newP) {
            if (chars[oldP] == ' ') {
                chars[newP] = '0';
                chars[--newP] = '2';
                chars[--newP] = '%';
            } else {
                chars[newP] = chars[oldP];
            }
            newP--;
            oldP--;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(替换空格.replaceSpace(s));
    }


}
