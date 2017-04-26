/**
 * Created by 刘灿锐 on 2017/4/26 0026.
 * 137. Single Number II
 * Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?。
 */
public class SingleNumber2 {
    public int singleNumber(int[] A) {
        int ones = 0, twos = 0;
        for (int aA : A) {
            ones = (ones ^ aA) & ~twos;
            twos = (twos ^ aA) & ~ones;
        }
        return ones;
    }
}
