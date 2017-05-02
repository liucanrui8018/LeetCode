/**
 * Created by 刘灿锐 on 5/2/2017.
 * 154. Find Minimum in Rotated Sorted Array II
 * Follow up for "Find Minimum in Rotated Sorted Array":
 * What if duplicates are allowed?
 * <p>
 * Would this affect the run-time complexity? How and why?
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * <p>
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * <p>
 * Find the minimum element.
 * <p>
 * The array may contain duplicates.
 */
public class FindMin2 {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid;

        while (lo < hi) {
            mid = lo + (hi - lo) / 2;

            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            } else if (nums[mid] < nums[hi]) {
                hi = mid;
            } else { // when num[mid] and num[hi] are same
                hi--;
            }
        }
        return nums[lo];
    }
}
