package com.lb.leetcode.哈希表;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 *
 * @author: liuben
 * @date: 2021/8/10
 */
public class 三四九$两个数组的交集 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set set = new HashSet();
        for (int num : nums1) {
            set.add(num);
        }
        Set<Integer> interSet = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                interSet.add(num);
            }
        }
        int[] res = new int[interSet.size()];
        Object[] objects = interSet.toArray();
        for (int i = 0; i < objects.length; i++) {
            res[i] = (int) objects[i];
        }
        return res;
    }
}
