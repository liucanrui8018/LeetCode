/**
 * Created by 刘灿锐 on 2017/4/26 0026.
 * 136. Single Number
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;

        int len = nums.length;
        for (int i = 0; i != len; i++)
            ans ^= nums[i];

        return ans;
    }
}
