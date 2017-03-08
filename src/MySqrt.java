/**
 * Created by 刘灿锐 on 2017/3/7 0007.
 * Implement int sqrt(int x).
 *
 * Compute and return the square root of x.
 */
public class MySqrt {
    public int sqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x / (mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }
}
