
/**
 * Created by 刘灿锐 on 2017/2/27 0027.
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
public class Merge {
    public void merge(int A[], int m, int B[], int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i > -1 && j > -1)
            A[k--] = (A[i] > B[j]) ? A[i--] : B[j--];
        while (j > -1)
            A[k--] = B[j--];
    }
}
