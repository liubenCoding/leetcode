package com.lb.leetcode.数组.solution;

/**
 * @author: liuben
 * @date: 2021/6/7
 */
public class 盛最多水的容器 {

    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, maxArea = 0;
        int leftMax = height[i];
        int rightMax = height[j];
        while (i != j) {
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
}
