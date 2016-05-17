import java.awt.Color;

import processing.core.PApplet;

public class Display {
	private PApplet p;
	private int x, y, w, h;
	public Display(PApplet p, int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.p = p;
	}

	public void drawGrid(Grid g) {
		
		int rectHeight = (h-(5*g.getRows()))/g.getRows();
		int rectWidth = (w-(5*g.getCols()))/g.getCols();
		int rX = x;
		int rY = y;
		for (int i = 0; i < g.getRows(); i++) {
			for (int j = 0; j < g.getCols(); j++) {
				p.fill(0,250,154);
				p.rect(rX+15, rY+15, rectHeight, rectWidth,10);
				rY+=rectWidth;
				
			}
			rY=0;
			rX += rectHeight;
		}
	}

}
