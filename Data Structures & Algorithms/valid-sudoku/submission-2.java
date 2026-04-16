class Solution {
    public boolean isValidSudoku(char[][] board) {
       int n = 9;

        Set<String> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char num = board[i][j];
                if (num == '.') continue; 

                if (!seen.add(num + " in row " + i) ||
                    !seen.add(num + " in col " + j) ||
                    !seen.add(num + " in box " + (i / 3) + "-" + (j / 3))) {
                    return false;
                }
            }
        }

        return true;
    }
}
