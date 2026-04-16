class Solution {
    public boolean isValidSudoku(char[][] board) {
         int row = board.length;
        int col = board[0].length;

        // ✅ Check each row
        for (int i = 0; i < row; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < col; j++) {
                char c = board[i][j];
                if (c == '.') continue; // ignore empty cells
                if (set.contains(c)) return false; // duplicate in row
                set.add(c);
            }
        }

        // ✅ Check each column
        for (int j = 0; j < col; j++) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < row; i++) {
                char c = board[i][j];
                if (c == '.') continue;
                if (set.contains(c)) return false; // duplicate in column
                set.add(c);
            }
        }

        // ✅ Check each 3x3 sub-box
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                Set<Character> set = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[boxRow + i][boxCol + j];
                        if (c == '.') continue;
                        if (set.contains(c)) return false; // duplicate in sub-box
                        set.add(c);
                    }
                }
            }
        }

        // ✅ If no duplicates found
        return true;
    }
}
