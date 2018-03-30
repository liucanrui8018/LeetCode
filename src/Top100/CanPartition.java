package Top100;

import java.util.Arrays;

/**
 * 416. Partition Equal Subset Sum
 * Given a non-empty array containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.
 * <p>
 * Note:
 * Each of the array element will not exceed 100.
 * The array size will not exceed 200.
 * Example 1:
 * <p>
 * Input: [1, 5, 11, 5]
 * <p>
 * Output: true
 * <p>
 * Explanation: The array can be partitioned as [1, 5, 5] and [11].
 * Example 2:
 * <p>
 * Input: [1, 2, 3, 5]
 * <p>
 * Output: false
 * <p>
 * Explanation: The array cannot be partitioned into equal sum subsets.
 */

public class CanPartition {
    public boolean canPartition(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if ((sum & 1) == 1) {
            return false;
        }
        sum /= 2;

        int n = nums.length;
        boolean[] dp = new boolean[sum + 1];
        Arrays.fill(dp, false);
        dp[0] = true;

        for (int num : nums) {
            for (int i = sum; i > 0; i--) {
                if (i >= num) {
                    dp[i] = dp[i] || dp[i - num];
                }
            }
        }

        return dp[sum];
    }

    public boolean canPartition2(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if ((sum & 1) == 1) {
            return false;
        }
        sum /= 2;

        int n = nums.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];
        for (boolean[] aDp : dp) {
            Arrays.fill(aDp, false);
        }

        dp[0][0] = true;

        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = true;
        }
        for (int j = 1; j < sum + 1; j++) {
            dp[0][j] = false;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= nums[i - 1]) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - nums[i - 1]];
                }
            }
        }

        return dp[n][sum];
    }
}
