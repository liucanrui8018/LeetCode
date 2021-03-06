/**
 * Created by 刘灿锐 on 2017/4/24 0024.
 * 130. Surrounded Regions
 * Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.
 * <p>
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 * <p>
 * For example,
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * After running your function, the board should be:
 * <p>
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 */
public class Solve {
    public void solve(char[][] board) {
        int i, j;
        int row = board.length;
        if (row == 0)
            return;
        int col = board[0].length;

        for (i = 0; i < row; i++) {
            check(board, i, 0, row, col);
            if (col > 1)
                check(board, i, col - 1, row, col);
        }
        for (j = 1; j + 1 < col; j++) {
            check(board, 0, j, row, col);
            if (row > 1)
                check(board, row - 1, j, row, col);
        }
        for (i = 0; i < row; i++)
            for (j = 0; j < col; j++)
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
        for (i = 0; i < row; i++)
            for (j = 0; j < col; j++)
                if (board[i][j] == '1')
                    board[i][j] = 'O';
    }

    private void check(char[][] vec, int i, int j, int row, int col) {
        if (vec[i][j] == 'O') {
            vec[i][j] = '1';
            if (i > 1)
                check(vec, i - 1, j, row, col);
            if (j > 1)
                check(vec, i, j - 1, row, col);
            if (i + 1 < row)
                check(vec, i + 1, j, row, col);
            if (j + 1 < col)
                check(vec, i, j + 1, row, col);
        }
    }
}

