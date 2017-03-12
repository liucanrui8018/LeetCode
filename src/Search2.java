/**
 * Created by 刘灿锐 on 2017/3/12 0012.
 * Follow up for "Search in Rotated Sorted Array":
 * What if duplicates are allowed?
 *
 * Would this affect the run-time complexity? How and why?
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 *
 * Write a function to determine if a given target is in the array.
 *
 * The array may contain duplicates.
 */
public class Search2 {
    public boolean search(int[] A, int target) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int i = 0;
        int j = A.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (A[mid] == target)
                return true;
            else if (A[mid] < A[i]) {
                if (target > A[j])
                    j = mid - 1;
                else if (target < A[mid])
                    j = mid - 1;
                else
                    i = mid + 1;
            } else if (A[mid] > A[i]) {
                if (target < A[mid] && target >= A[i])
                    j = mid - 1;
                else
                    i = mid + 1;
            } else { // A[mid] == A[i]
                if (A[mid] != A[j])
                    i = mid + 1;
                else {
                    boolean flag = true;
                    for (int k = 1; mid - k >= i && mid + k <= j; k++) {
                        if (A[mid] != A[mid - k]) {
                            j = mid - k;
                            flag = false;
                            break;
                        } else if (A[mid] != A[mid + k]) {
                            i = mid + k;
                            flag = false;
                            break;
                        }
                    }
                    if (flag)
                        return false;
                }
            }
        }
        return false;
    }
}
