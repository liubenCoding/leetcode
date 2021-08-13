package com.lb.leetcode.双指针法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: liuben
 * @date: 2021/8/13
 */
public class 十五$三数之和 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return res;
            }
            // 数字相同，没必要再算了，一样的结果
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            // 找出nums[i]开始所有的组合情况
            while (right > left) {
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //// 去重逻辑应该放在找到一个三元组之后
                    while (right > left && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    while (right > left && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    //// 找到答案时，双指针同时收缩
                    right--;
                    left++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //int[] nums = {0, 0, 0, 0, 0, 0};
        //int[] nums = {1, -1};
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = 十五$三数之和.threeSum(nums);
        for (List<Integer> list : lists) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }

}
