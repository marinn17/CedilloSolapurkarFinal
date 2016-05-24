import java.util.ArrayList;

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

	// if the arraylist is empty then there are no buttons
	// to click;
	public ArrayList<NoiseButton> getButtonsClickedInRow(int col) {
		ArrayList<NoiseButton> buttonsClicked = new ArrayList<NoiseButton>();
		for (int r = 0; r < rows; r++) {
			if (grid[r][col].getClicked())
				buttonsClicked.add(grid[r][col]);
		}
		return buttonsClicked;
	}

	public NoiseButton getNoiseButton(int r, int c) {
		return grid[r][c];
	}


	
	

}
