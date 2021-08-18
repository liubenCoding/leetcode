package com.lb.leetcode.字符串;

import java.util.Arrays;

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * <p>
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * <p>
 * 示例 1：输入：["h","e","l","l","o"] 输出：["o","l","l","e","h"]
 * <p>
 * 示例 2：输入：["H","a","n","n","a","h"] 输出：["h","a","n","n","a","H"]
 *
 * @author liuben
 * @date 2021/8/15 5:09 下午
 **/
public class 反转字符串 {
    /**
     * 对半交换
     */
//    public static void reverseString(char[] s) {
//        char temp = 0;
//        for (int i = 0; i < s.length / 2; i++) {
//            // 0,1,2,3,4,5 /2
//            // 0,1,2,3,4,5,6 /2
//            char reverseChar = s[s.length - 1 - i];
//            s[s.length - 1 - i] = s[i];
//            s[i] = reverseChar;
//        }
//    }

    /**
     * 双指针
     */
    public static void reverseString(char[] s) {
        char temp;
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

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o', 'b'};
        反转字符串.reverseString(s);
        System.out.println(Arrays.toString(s));
        ;
    }
}
