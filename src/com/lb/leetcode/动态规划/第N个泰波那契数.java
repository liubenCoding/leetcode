package com.lb.leetcode.动态规划;

/**
 * @author: liuben
 * @date: 2021/7/5
 */
public class 第N个泰波那契数 {

    //public static int tribonacci(int n) {
    //    if (n == 0) {
    //        return 0;
    //    }
    //    if (n == 1 || n == 2) {
    //        return 1;
    //    }
    //    int[] tribonacci = new int[n + 1];
    //    tribonacci[0] = 0;
    //    tribonacci[1] = 1;
    //    //int sum = tribonacci[0] + tribonacci[1];
    //    tribonacci[2] = 1;
    //    for (int i = 3; i <= n; i++) {
    //        tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
    //    }
    //    return tribonacci[n];
    //}

    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int first = 0;
        int second = 1;
        int third = 1;
        int temp = first;
        for (int i = 3; i <= n; i++) {
            first = second;
            second = third;
            third = temp + first + second;
            temp = first;
        }
        return third;
    }

    public static void main(String[] args) {
        System.out.println(第N个泰波那契数.tribonacci(25));
    }
}
