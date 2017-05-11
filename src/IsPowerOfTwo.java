/**
 * Created by 刘灿锐 on 5/11/2017.
 * 231. Power of Two
 * Given an integer, write a function to determine if it is a power of two.
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }
}
