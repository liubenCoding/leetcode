package com.lb.leetcode.数组.solution;

/**
 * @author liuben
 * @date 2021/6/6 1:26 下午
 **/
public class 盛最多水的容器 {

    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1, maxArea = 0;
        int leftMax = 0;
        int rightMax = 0;
        while (i != j) {
            leftMax = height[i];
            rightMax = height[j];
            maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
            if (height[i] <= height[j]) {
                while (height[i] <= leftMax && i < j) {
                    i++;
                }
                leftMax = height[i];
            } else {
                while (height[j] <= rightMax && i < j) {
                    j--;
                }
                rightMax = height[j];
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(盛最多水的容器.maxArea(arr));
    }
}
