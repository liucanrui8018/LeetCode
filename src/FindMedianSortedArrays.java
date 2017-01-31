
public class FindMedianSortedArrays {
	
	
	
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
}
