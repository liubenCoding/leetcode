package com.lb.leetcode.数组;

/**
 * @author liuben
 * @date 2021/7/31 6:52 下午
 **/
public class 二零九$长度最小的子数组 {

    public static int minSubArrayLen(int target, int[] nums) {
        int res = nums.length + 1;
        int sum = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            //每次累加和
            sum += nums[i];
            // 当和大于target时
            while (sum >= target) {
                // 比较长度
                res = Math.min(res, (i - j + 1));
                // 并移动左边下标,并且之前j下标的nums数组对应元素
                sum -= nums[j++];
            }
        }
        return res == nums.length + 1 ? 0 : res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(二零九$长度最小的子数组.minSubArrayLen(7, nums));
    }
}
