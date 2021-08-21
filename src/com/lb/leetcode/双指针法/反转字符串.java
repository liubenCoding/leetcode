package com.lb.leetcode.双指针法;

/**
 * @author liuben
 * @date 2021/8/21 2:12 下午
 **/
public class 反转字符串 {

    public static void reverseString(char[] s) {
        char temp = 0;
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
    }

}
