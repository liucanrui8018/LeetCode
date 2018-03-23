
public class FindMedianSortedArrays {
    // There are two sorted arrays nums1 and nums2 of size m and n respectively.
    //
    // Find the median of the two sorted arrays. The overall run time complexity
    // should be O(log (m+n)).
    //
    // Example 1:
    // nums1 = [1, 3]
    // nums2 = [2]
    //
    // The median is 2.0
    // Example 2:
    // nums1 = [1, 2]
    // nums2 = [3, 4]
    //
    // The median is (2 + 3)/2 = 2.5


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if (m > n) {
            int[] C = nums1.clone();
            nums1 = nums2;
            nums2 = C;
            m = nums1.length;
            n = nums2.length;
        }

        if (n == 0) {
            System.out.println("Number erro");
            return 0.0;
        }
        int imin = 0, imax = m, half_len = (m + n + 1) / 2;
        int i, j, max_of_left, min_of_right;
        while (imin <= imax) {
            i = (imin + imax) / 2;
            j = half_len - i;
            if (i < m && nums2[j - 1] > nums1[i]) {
                // i is too small, must increase it
                imin = i + 1;
            } else if (i > 0 && nums1[i - 1] > nums2[j]) {
                // i is too big, must decrease it
                imax = i - 1;
            } else {
                // i is perfect
                if (i == 0)
                    max_of_left = nums2[j - 1];
                else if (j == 0)
                    max_of_left = nums1[i - 1];
                else
                    max_of_left = Math.max(nums1[i - 1], nums2[j - 1]);

                if ((m + n) % 2 == 1) {
                    return max_of_left;
                }

                if (i == m)
                    min_of_right = nums2[j];
                else if (j == n)
                    min_of_right = nums1[i];
                else
                    min_of_right = Math.min(nums1[i], nums2[j]);
                return (max_of_left + min_of_right) / 2.0;
            }

        }
        return 0.0;
    }


    public double findMedianSortedArrays1(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if (m > n) { // to ensure m<=n
            int[] temp = A;
            A = B;
            B = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j - 1] > A[i]) {
                iMin = iMin + 1; // i is too small
            } else if (i > iMin && A[i - 1] > B[j]) {
                iMax = iMax - 1; // i is too big
            } else { // i is perfect
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = B[j - 1];
                } else if (j == 0) {
                    maxLeft = A[i - 1];
                } else {
                    maxLeft = Math.max(A[i - 1], B[j - 1]);
                }
                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }

                int minRight = 0;
                if (i == m) {
                    minRight = B[j];
                } else if (j == n) {
                    minRight = A[i];
                } else {
                    minRight = Math.min(B[j], A[i]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}
