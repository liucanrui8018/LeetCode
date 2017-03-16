import java.util.Stack;

/**
 * Created by 刘灿锐 on 2017/3/13 0013.
 * Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
 *
 * For example, given the following matrix:
 *
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 * Return 6.
 */
public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int cLen = matrix[0].length;    // column length
        // height array
        int[] h = new int[cLen + 1];
        h[cLen] = 0;
        int max = 0;


        for (char[] aMatrix : matrix) {
            Stack<Integer> s = new Stack<>();
            for (int i = 0; i < cLen + 1; i++) {
                if (i < cLen)
                    if (aMatrix[i] == '1')
                        h[i] += 1;
                    else h[i] = 0;

                if (s.isEmpty() || h[s.peek()] <= h[i])
                    s.push(i);
                else {
                    while (!s.isEmpty() && h[i] < h[s.peek()]) {
                        int top = s.pop();
                        int area = h[top] * (s.isEmpty() ? i : (i - s.peek() - 1));
                        if (area > max)
                            max = area;
                    }
                    s.push(i);
                }
            }
        }
        return max;
    }
}
