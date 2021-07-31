package com.lb.leetcode.双指针法;

/**
 * @author liuben
 * @date 2021/7/13 9:05 下午
 **/
public class 接雨水 {

    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];
        int res = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    res += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    res += rightMax - height[right];
                }
                right--;
            }
        }
        return res;
    }
}
