package com.lb.leetcode.动态规划;

/**
 * @author: liuben
 * @date: 2021/6/7
 */
public class 爬楼梯 {

    /**
     * f(n) = f(n-1)+ f(n-2);
     */
    public static int climbStairs(int n) {
        int x = 0;
        int temp;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            temp = x;
            x = res;
            res = temp + res;
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(爬楼梯.climbStairs(3));
    }
}
