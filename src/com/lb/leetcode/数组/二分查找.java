package com.lb.leetcode.数组;

/**
 * @author: liuben
 * @date: 2021/7/28
 */
public class 二分查找 {

    public static int search(int[] nums, int target) {
        //int left = 0;
        //int right = nums.length - 1; // 定义target在左闭右闭的区间里，[left, right]
        //while (left <= right) { // 当left==right，区间[left, right]依然有效，所以用 <=
        //    int middle = left + ((right - left) / 2);// 防止溢出 等同于(left + right)/2
        //     if (nums[middle] < target) {
        //        left = middle + 1; // target 在右区间，所以[middle + 1, right]
        //    } else  if (nums[middle] > target) {
        //        right = middle - 1; // target 在左区间，所以[left, middle - 1]
        //    } else { // nums[middle] == target
        //        return middle; // 数组中找到目标值，直接返回下标
        //    }
        //}
        ////
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target > nums[middle]) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        // 未找到目标值
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2};
        System.out.println(search(nums, 2));
    }

}
