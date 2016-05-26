public class Grid {
	private NoiseButton[][] grid;
	private int rows;
	private int cols;

	public Grid(int r, int c) {
		rows = r;
		cols = c;
		grid = new NoiseButton[rows][cols];
	}

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}

	public void addNoiseButton(int row, int col, NoiseButton n) {
		grid[row][col] = n;
	}

	public NoiseButton getNoiseButton(int r, int c) {
		return grid[r][c];
	}
}
