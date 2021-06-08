package com.lb.leetcode.动态规划;

/**
 * @author: liuben
 * @date: 2021/6/8
 */
public class 三步问题 {

    public static int waysToStep(int n) {
        int x = 0;
        int y = 0;
        int z = 1;
        int r;
        for (int i = 1; i <= n; i++) {
            r = ((x + y) % 1000000007 + z) % 1000000007;
            x = y;
            y = z;
            z = r;
        }
        return z % 1000000007;

    }

    public static void main(String[] args) {
        System.out.println(三步问题.waysToStep(5));
    }
}
