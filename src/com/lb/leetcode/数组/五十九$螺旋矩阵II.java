package com.lb.leetcode.数组;

import java.util.Arrays;

/**
 * @author liuben
 * @date 2021/7/31 8:37 下午
 **/
public class 五十九$螺旋矩阵II {

    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int start = 0; // 定义每循环一个圈的起始位置
        int loop = n / 2; // 每个圈循环几次，例如n为奇数3，那么loop = 1 只是循环一圈，矩阵中间的值需要单独处理
        int mid = n / 2; // 矩阵中间的位置，例如：n为3， 中间的位置就是(1，1)，n为5，中间位置为(2, 2)
        int count = 1; // 用来给矩阵中每一个空格赋值
        int i, j;
        while (loop-- > 0) {
            i = start;
            j = start;

            // 下面开始的四个for就是模拟转了一圈
            // 模拟填充上行从左到右(左闭右开)
            for (j = start; j < n - 1 - start; j++) {
                res[start][j] = count++;
            }
            // 模拟填充右列从上到下(左闭右开)
            for (i = start; i < n - 1 - start; i++) {
                res[i][j] = count++;
            }
            // 模拟填充下行从右到左(左闭右开)
            for (; j > start; j--) {
                res[i][j] = count++;
            }
            // 模拟填充左列从下到上(左闭右开)

            for (; i > start; i--) {
                res[i][j] = count++;
            }
            // 第二圈开始的时候，起始位置要各自加1， 例如：第一圈起始位置是(0, 0)，第二圈起始位置是(1, 1)
            start++;
        }

        // 如果n为奇数的话，需要单独给矩阵最中间的位置赋值
        if (n % 2 == 1) {
            res[mid][mid] = count;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] ints = 五十九$螺旋矩阵II.generateMatrix(6);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(Arrays.toString(ints[i]));

        }
    }
}
