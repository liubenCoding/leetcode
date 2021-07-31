package com.lb.leetcode.动态规划;

/**
 * @author liuben
 * @date 2021/7/14 11:17 下午
 **/
public class 丑数2 {

    public static int nthUglyNumber(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        int ans = 0;
//        // 2 1*2,1*3,1*5
//        // 3 2*2,2*3,1*5
//        int[] base = {2, 3, 5};
//        int[] arr = {2, 3, 5};
//        int index = 2;
//        int start = 2;
//        while (index <= n) {
//            int temp = index;
//            for (int i = 0; i < arr.length; i++) {
//                if (start == arr[i] ) {
//                    ans = arr[i];
//                    arr[i] += base[i];
//                    index=temp+1;
//                }
//            }
//            start++;
//        }
//        return ans;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        int p2 = 1, p3 = 1, p5 = 1;
        for (int i = 2; i <= n; i++) {
            int num2 = dp[p2] * 2, num3 = dp[p3] * 3, num5 = dp[p5] * 5;
            dp[i] = Math.min(Math.min(num2, num3), num5);
            if (dp[i] == num2) {
                p2++;
            }
            if (dp[i] == num3) {
                p3++;
            }
            if (dp[i] == num5) {
                p5++;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(丑数2.nthUglyNumber(11));
    }
}
