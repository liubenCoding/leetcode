package com.lb.leetcode.动态规划;

//有一堆石头，用整数数组 stones 表示。其中 stones[i] 表示第 i 块石头的重量。
//
// 每一回合，从中选出任意两块石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
//
//
// 如果 x == y，那么两块石头都会被完全粉碎；
// 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
//
//
// 最后，最多只会剩下一块 石头。返回此石头 最小的可能重量 。如果没有石头剩下，就返回 0。
//
//
//
// 示例 1：
//
//
//输入：stones = [2,7,4,1,8,1]
//输出：1
//解释：
//组合 2 和 4，得到 2，所以数组转化为 [2,7,1,8,1]，
//组合 7 和 8，得到 1，所以数组转化为 [2,1,1,1]，
//组合 2 和 1，得到 1，所以数组转化为 [1,1,1]，
//组合 1 和 1，得到 0，所以数组转化为 [1]，这就是最优值。
//
//
// 示例 2：
//
//
//输入：stones = [31,26,33,21,40]
//输出：5
//
//
// 示例 3：
//
//
//输入：stones = [1,2]
//输出：1
//
//
//
//
// 提示：
//
//
// 1 <= stones.length <= 30
// 1 <= stones[i] <= 100
//
// Related Topics 动态规划

import java.util.PriorityQueue;

public class 最后一块石头的重量 {

    //public static int lastStoneWeightII(int[] stones) {
    //    if (stones.length == 0) {
    //        return 0;
    //    }
    //    if (stones.length == 1) {
    //        return stones[0];
    //    }
    //    int left = 0;
    //    int right = stones.length - 1;
    //
    //    int maxLeftIndex = left;
    //    int maxRightIndex = right;
    //
    //    int maxLeft = stones[left];
    //    int maxRight = stones[right];
    //
    //    while (left != right) {
    //        if (maxRight < stones[right]) {
    //            maxRight = stones[right];
    //            maxRightIndex = right;
    //        }
    //        if (maxLeft < stones[left]) {
    //            maxLeft = stones[left];
    //            maxLeftIndex = left;
    //        }
    //        if (stones[left] < stones[right]) {
    //            left++;
    //        } else {
    //            right--;
    //        }
    //    }
    //
    //    if (maxLeft < maxRight) {
    //        stones[maxRightIndex] = maxRight - maxLeft;
    //        stones = remove(stones, maxLeftIndex);
    //    } else if (maxLeft > maxRight) {
    //        stones[maxLeftIndex] = maxLeft - maxRight;
    //        stones = remove(stones, maxRightIndex);
    //    } else {
    //        stones = remove(stones, maxLeftIndex);
    //        stones = remove(stones, maxRightIndex - 1);
    //    }
    //    return lastStoneWeightII(stones);
    //}
    //
    //public static int[] remove(int[] stones, int index) {
    //    int[] newArr = new int[stones.length - 1];
    //    System.arraycopy(stones, 0, newArr, 0, index);
    //    System.arraycopy(stones, index + 1, newArr, index, stones.length - (index + 1));
    //    return newArr;
    //}

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if (a > b) {
                pq.offer(a - b);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }

    /**
     * [31,26,33,21,40]
     * 31 26 33 19
     * 2 7
     * 5
     * @param args
     */
    public static void main(String[] args) {
        //int[] nums = {2, 7, 4, 1, 8};
        //最后一块石头的重量2.remove(nums, 1);
        //int[] nums = {2, 7, 4, 1, 8, 1};
        int[] nums = {31,26,33,21,40};
        System.out.println(最后一块石头的重量.lastStoneWeight(nums));
    }
}
