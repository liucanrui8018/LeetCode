/**
 * Created by 刘灿锐 on 2017/2/19 0019.
 * Given an array and a value, remove all instances of that value in place and return the new length.
 *
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        int m = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != elem) {
                A[m] = A[i];
                m++;
            }
        }
        return m;
    }
}
