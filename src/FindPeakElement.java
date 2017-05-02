/**
 * Created by 刘灿锐 on 5/2/2017.
 * 162. Find Peak Element
 * A peak element is an element that is greater than its neighbors.
 * <p>
 * Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
 * <p>
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 * <p>
 * You may imagine that num[-1] = num[n] = -∞.
 * <p>
 * For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 */
public class FindPeakElement {
    public int findPeakElement(int[] num) {
        return helper(num, 0, num.length - 1);
    }

    private int helper(int[] num, int start, int end) {
        if (start == end) {
            return start;
        } else if (start + 1 == end) {
            if (num[start] > num[end]) return start;
            return end;
        } else {
            int m = (start + end) / 2;
            if (num[m] > num[m - 1] && num[m] > num[m + 1]) {
                return m;
            } else if (num[m - 1] > num[m] && num[m] > num[m + 1]) {
                return helper(num, start, m - 1);
            } else {
                return helper(num, m + 1, end);
            }
        }
    }
}
