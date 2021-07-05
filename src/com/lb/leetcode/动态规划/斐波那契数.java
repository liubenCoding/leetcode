package com.lb.leetcode.动态规划;

/**
 * @author: liuben
 * @date: 2021/7/5
 */
public class 斐波那契数 {

    /**
     * dp数组 O(n)
     */
    //public static int fib(int n) {
    //    if (n == 1 || n == 2) {
    //        return 1;
    //    }
    //    int[] fib = new int[n];
    //    fib[0] = 1;
    //    fib[1] = 1;
    //    for (int i = 2; i < n; i++) {
    //        fib[i] = fib[i - 1] + fib[i - 2];
    //    }
    //    return fib[n - 1];
    //}
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int first = 1;
        int second = 1;
        int temp = first;
        for (int i = 2; i < n; i++) {
            first = second;
            second += temp;
            temp = first;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(斐波那契数.fib(4));
    }
}
