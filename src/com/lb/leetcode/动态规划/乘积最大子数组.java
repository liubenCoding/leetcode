package com.lb.leetcode.动态规划;

import java.util.Arrays;

/**
 * @author liuben
 * @date 2021/7/10 12:05 下午
 **/
public class 乘积最大子数组 {


//    public static int maxProduct(int[] nums) {
//        int[] max = new int[nums.length];
//        int[] min = new int[nums.length];
//
//        int maxVal = nums[0];
//        max[0] = nums[0];
//        min[0] = nums[0];
//        int temp;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] < 0) {
//                temp = max[i - 1];
//                max[i - 1] = min[i - 1];
//                min[i - 1] = temp;
//            }
//            max[i] = Math.max(max[i - 1] * nums[i], nums[i]);
//            min[i] = Math.min(min[i - 1] * nums[i], nums[i]);
//            maxVal = Math.max(maxVal, max[i]);
//        }
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(max));
//        System.out.println(Arrays.toString(min));
//        return maxVal;
//    }

    /**
     * 标签：动态规划
     * 遍历数组时计算当前最大值，不断更新
     * 令imax为当前最大值，则当前最大值为 imax = max(imax * nums[i], nums[i])
     * 由于存在负数，那么会导致最大的变最小的，最小的变最大的。因此还需要维护当前最小值imin，imin = min(imin * nums[i], nums[i])
     * 当负数出现时则imax与imin进行交换再进行下一步计算
     * 时间复杂度：O(n)O(n)
     *
     * 作者：guanpengchn
     * 链接：https://leetcode-cn.com/problems/maximum-product-subarray/solution/hua-jie-suan-fa-152-cheng-ji-zui-da-zi-xu-lie-by-g/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public static int maxProduct(int[] nums) {
        int maxVal = nums[0];
        int maxTemp = nums[0];
        int minTemp = nums[0];
        int temp;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                temp = maxTemp;
                maxTemp = minTemp;
                minTemp = temp;
            }
            maxTemp = Math.max(maxTemp * nums[i], nums[i]);
            minTemp = Math.min(minTemp * nums[i], nums[i]);
            maxVal = Math.max(maxVal, maxTemp);
        }
        return maxVal;
    }

    public static void main(String[] args) {
//        int[] nums = {-2, 0, -1};
//        int[] nums = {2,3,-2,4};
//        int[] nums = {3, -1, 4};
        int[] nums = {2, -5, -2, -4, 3};
//        int[] nums = {2,3,-2,4};
        System.out.println(乘积最大子数组.maxProduct(nums));
    }

}
