package com.lb.leetcode.数组;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: liuben
 * @date: 2021/7/28
 */
public class 有序数组的平方 {

    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0, j = nums.length - 1, k = nums.length - 1;
        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[k] = nums[i] * nums[i];
                i++;
            } else if (Math.abs(nums[i]) < Math.abs(nums[j])) {
                res[k] = nums[j] * nums[j];
                j--;
            } else {
                res[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(有序数组的平方.sortedSquares(a)));
    }
}
