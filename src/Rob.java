/**
 * Created by 刘灿锐 on 5/5/2017.
 * 198. House Robber
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class Rob {
    public int rob(int[] num) {
        int[][] dp = new int[num.length + 1][2];
        for (int i = 1; i <= num.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = num[i - 1] + dp[i - 1][0];
        }
        return Math.max(dp[num.length][0], dp[num.length][1]);
    }

//    public int rob(int[] num) {
//        int prevNo = 0;
//        int prevYes = 0;
//        for (int n : num) {
//            int temp = prevNo;
//            prevNo = Math.max(prevNo, prevYes);
//            prevYes = n + temp;
//        }
//        return Math.max(prevNo, prevYes);
//    }
}
