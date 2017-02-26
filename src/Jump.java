/**
 * Created by 刘灿锐 on 2017/2/26 0026.
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Your goal is to reach the last index in the minimum number of jumps.
 *
 * For example:
 * Given array A = [2,3,1,1,4]
 *
 * The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
 *
 * Note:
 * You can assume that you can always reach the last index.41
 */
public class Jump {
    public int jump(int[] A) {
        int sc = 0;
        int e = 0;
        int max = 0;
        for (int i = 0; i < A.length - 1; i++) {
            max = Math.max(max, i + A[i]);
            if (i == e) {
                sc++;
                e = max;
            }
        }
        return sc;
    }

}
