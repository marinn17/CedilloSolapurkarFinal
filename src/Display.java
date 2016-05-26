import processing.core.PApplet;

public class Display {
	private PApplet p;
	private int x, y, w, h;
	private Grid grid;
	private static int CLICKED, NOT_CLICKED;
	private static int RECT_HEIGHT, RECT_WIDTH;

	public Display(PApplet p, int x, int y, int w, int h, Grid g) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.p = p;
		grid = g;
		NOT_CLICKED = p.color(0, 250, 154);
		CLICKED = p.color(0, 180, 60);
		// subtract double x and y from height and width in order to have a
		// border
		RECT_HEIGHT = (h - (2 * y)) / g.getRows();
		RECT_WIDTH = (w - (2 * x)) / g.getCols();
	}

	public void drawGrid() {
		int rX = x;
		int rY = y;
		for (int i = 0; i < grid.getRows(); i++) {
			for (int j = 0; j < grid.getCols(); j++) {
				p.fill(NOT_CLICKED);
				p.rect(rX + RECT_HEIGHT * i, rY + RECT_WIDTH * j, RECT_HEIGHT, RECT_WIDTH, 10);
				
				NoiseButton n = grid.getNoiseButton(i, j);
				n.setX(rX + RECT_HEIGHT * i);
				n.setY(rY + RECT_WIDTH * j);
			}
		}
	}

	public void updateDisplay() {
		for (int i = 0; i < grid.getRows(); i++) {
			for (int j = 0; j < grid.getCols(); j++) {
				NoiseButton b = grid.getNoiseButton(i, j);
				if (b.getClicked()) {
					p.fill(CLICKED);
				} else {
					p.fill(NOT_CLICKED);
				}
				p.rect(b.getX(), b.getY(), RECT_WIDTH, RECT_HEIGHT, 10);
			}
		}
	}

	public void updateGrid(int mouseX, int mouseY) {
		if (isInGrid(mouseX, mouseY)) {
			int r = (mouseX - x) / RECT_WIDTH;
			int c = (mouseY - y) / RECT_HEIGHT;
			NoiseButton b = grid.getNoiseButton(r, c);
			b.switchButton();
			if (b.getClicked())
				b.play();
			else {
				b.stop();
			}
		}
	}

	public int getBlue(int pixel) {
		return pixel & 255;
	}

	public int getGreen(int pixel) {
		int pix = pixel >> 8;
		return pix & 255;
	}

	public int getRed(int pixel) {
		int pix = pixel >> 16;
		return pix & 255;
	}

	public boolean isInGrid(int mouseX, int mouseY) {
		int pix = p.get(mouseX, mouseY);
		int red = getRed(pix);
		int green = getGreen(pix);
		int blue = getBlue(pix);
		// background is black so if the mouse coordinates
		// have a black pixel they are not on the grid
		if (red == 0 && green == 0 && blue == 0) {
			return false;
		}
		return true;
	}
}