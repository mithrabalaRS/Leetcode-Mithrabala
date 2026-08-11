// Last updated: 8/11/2026, 2:20:47 PM
class Solution {

    public boolean validTicTacToe(String[] board) {

        int x = 0, o = 0;

        // Count X and O
        for (String row : board) {
            for (char c : row.toCharArray()) {
                if (c == 'X')
                    x++;
                else if (c == 'O')
                    o++;
            }
        }

        // Validate turns
        if (o > x || x - o > 1)
            return false;

        boolean xWin = win(board, 'X');
        boolean oWin = win(board, 'O');

        // Both cannot win
        if (xWin && oWin)
            return false;

        // X wins → X should have one extra move
        if (xWin && x != o + 1)
            return false;

        // O wins → counts should match
        if (oWin && x != o)
            return false;

        return true;
    }

    private boolean win(String[] board, char ch) {

        // Rows
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == ch &&
                board[i].charAt(1) == ch &&
                board[i].charAt(2) == ch)
                return true;
        }

        // Columns
        for (int j = 0; j < 3; j++) {
            if (board[0].charAt(j) == ch &&
                board[1].charAt(j) == ch &&
                board[2].charAt(j) == ch)
                return true;
        }

        // Diagonals
        if (board[0].charAt(0) == ch &&
            board[1].charAt(1) == ch &&
            board[2].charAt(2) == ch)
            return true;

        if (board[0].charAt(2) == ch &&
            board[1].charAt(1) == ch &&
            board[2].charAt(0) == ch)
            return true;

        return false;
    }
}