package com.lb.leetcode.动态规划;
/**
 * 给你一个整数数组 nums ，你可以对它进行一些操作。
 * <p>
 * 每次操作中，选择任意一个 nums[i] ，删除它并获得 nums[i] 的点数。之后，你必须删除 所有 等于 nums[i] - 1 和 nums[i] + 1 的元素。
 * <p>
 * 开始你拥有 0 个点数。返回你能通过这些操作获得的最大点数。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [3,4,2]
 * 输出：6
 * 解释：
 * 删除 4 获得 4 个点数，因此 3 也被删除。
 * 之后，删除 2 获得 2 个点数。总共获得 6 个点数。
 * 示例 2：
 * <p>
 * 输入：nums = [2,2,3,3,3,4]
 * 输出：9
 * 解释：
 * 删除 3 获得 3 个点数，接着要删除两个 2 和 4 。
 * 之后，再次删除 3 获得 3 个点数，再次删除 3 获得 3 个点数。
 * 总共获得 9 个点数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/delete-and-earn
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author liuben
 * @date 2021/7/7 8:45 下午
 **/
public class 删除并获得点数 {

    /**
     * 1.dp数组定义 dp[i]：当删除值为i的数时所获取的最大值
     * 2. 当选择删除值为i的数时,那么 i-1个数则不能被选择删除,因为选了i的话,i-1就已经被删除了
     * 如果选择不删除值为i的值,那么则dp[i] = dp[i-1] ,两种选择取最大值
     */
    public static int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        int[] values = new int[max + 1];
        for (int num : nums) {
            values[num]++;
        }
        int[] dp = new int[values.length];
        dp[1] = values[1];
        for (int i = 2; i < values.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + i * values[i]);
        }
        return dp[values.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {3,4,2};
        System.out.println(删除并获得点数.deleteAndEarn(nums));
    }
}
