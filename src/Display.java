
import java.util.ArrayList;

import processing.core.PApplet;

public class Display {
	private PApplet p;
	private int x, y, w, h;
	private Grid grid;
	private static int CLICKED, NOT_CLICKED, PLAY;
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
		PLAY = p.color(255, 255, 51);
		RECT_HEIGHT = (h - (5 * g.getRows())) / g.getRows();
		RECT_WIDTH = (w - (5 * g.getCols())) / g.getCols();

	}

	public void drawGrid() {
		int rX = x;
		int rY = y;
		for (int i = 0; i < grid.getRows(); i++) {
			for (int j = 0; j < grid.getCols(); j++) {
				p.fill(NOT_CLICKED);
				p.rect(rX + 10, rY + 10, RECT_HEIGHT, RECT_WIDTH, 10);
				rY += RECT_WIDTH;
				NoiseButton n = grid.getNoiseButton(i, j);
				n.setX(rX + 10);
				n.setY(rY + 10);

			}
			rY = 0;
			rX += RECT_HEIGHT;
		}
	}

	public void setMouseCoordinates(int mouseX, int mouseY) {
		if (isInGrid(mouseX, mouseY)) {
			int r = mouseX / RECT_WIDTH;
			int c = mouseY / RECT_HEIGHT;
			if (grid.getNoiseButton(r, c).getX() > mouseX && grid.getNoiseButton(r, c).getY() < mouseY) {
				r--;
				c--;
			} else if (grid.getNoiseButton(r, c).getY() > mouseY) {
				r--;
			} else if (mouseX < grid.getNoiseButton(r, c).getX()) {
				c--;
			}
			NoiseButton b = grid.getNoiseButton(r, c);

			b.switchButton();
			System.out.println(mouseX + " " + mouseY + " " + r + " " + c + " " + b.getX() + " " + b.getY());
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
		if (red == 0 && green == 0 && blue == 0) {
			return false;
		}
		return true;
	}

	public void update() {
		int rX = x;
		int rY = y;
		for (int i = 0; i < grid.getRows(); i++) {
			for (int j = 0; j < grid.getCols(); j++) {
				NoiseButton b = grid.getNoiseButton(i, j);
				if (b.getClicked()) {
					p.fill(CLICKED);
				} else {
					p.fill(NOT_CLICKED);
				}
				p.rect(rX + 10, rY + 10, RECT_HEIGHT, RECT_WIDTH, 10);
				rY += RECT_WIDTH;
			}
			rY = 0;
			rX += RECT_HEIGHT;
		}

	}

	public void runLine() {/*
							 * p.fill(251, 251, 51); p.strokeWeight(10);
							 * p.line(x, y, x, h); for (int i = y; i < w; i++) {
							 * p.line(i, y, i, h); }
							 * 
							 * NoiseButton b = grid.getNoiseButton(r, c); if
							 * (b.getClicked()) b.play();
							 */
	}

}