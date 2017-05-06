/**
 * Created by 刘灿锐 on 5/6/2017.
 * 201. Bitwise AND of Numbers Range
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
 * <p>
 * For example, given the range [5, 7], you should return 4.
 */
public class RangeBitwiseAnd {
    public int rangeBitwiseAnd(int m, int n) {
        if(m == 0){
            return 0;
        }
        int moveFactor = 1;
        while(m != n){
            m >>= 1;
            n >>= 1;
            moveFactor <<= 1;
        }
        return m * moveFactor;
    }
}
