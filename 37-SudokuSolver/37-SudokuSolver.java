// Last updated: 8/2/2025, 3:25:03 PM
class Solution {
    public void solveSudoku(char[][] board) {
        Print(board,0,0);


    }
    public static boolean Print(char[][] grid, int row, int col) {
		if (col == 9) {
			row++;
			col = 0;
		}
		if (row == 9) {
			return true;
		}
		if (grid[row][col] != '.') {
			return Print(grid, row, col + 1);
		} else {
			for (int val = '1'; val <= '9'; val++) {
				if (isitsafe(grid, row, col, val)) {
					grid[row][col] = (char)val;
					boolean ans = Print(grid, row, col + 1);
					if (ans) {
						return true;
					}
					grid[row][col] = '.';
				}
			}
		}
		return false;

	}

	public static boolean isitsafe(char[][] grid, int row, int col, int val) {
		// row
		for (int i = 0; i < 9; i++) {
			if (grid[row][i] == val) {
				return false;
			}
		}
		// col
		for (int i = 0; i < 9; i++) {
			if (grid[i][col] == val) {
				return false;
			}
		}
		// 3*3 Matrix
		int r = row - row % 3;
		int c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (grid[i][j] == val) {
					return false;
				}
			}
		}
		return true;

	}

    
}