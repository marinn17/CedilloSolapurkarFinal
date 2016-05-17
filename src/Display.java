import java.awt.Color;

import processing.core.PApplet;

public class Display {
	private PApplet p;
	private int x, y, w, h;
	private Grid grid;
	private static int CLICKED,NOT_CLICKED;
	private static int RECT_HEIGHT,RECT_WIDTH;
	
	public Display(PApplet p, int x, int y, int w, int h, Grid g) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.p = p;
		grid = g;
		NOT_CLICKED = p.color(0,250,154);
		CLICKED = p.color(15,255,160);
		RECT_HEIGHT = (h-(5*g.getRows()))/g.getRows();
		RECT_WIDTH =  (w-(5*g.getCols()))/g.getCols();
	}

	public void drawGrid(Grid g) {
		int rX = x;
		int rY = y;
		for (int i = 0; i < g.getRows(); i++) {
			for (int j = 0; j < g.getCols(); j++) {
				p.fill(NOT_CLICKED);
				p.rect(rX+10, rY+10, RECT_HEIGHT, RECT_WIDTH,10);
				rY+=RECT_WIDTH;
				
			}
			rY=0;
			rX += RECT_HEIGHT;
		}
	}

	public void mouseCoordinates(int mouseX, int mouseY) {
		// TODO Auto-generated method stub
		
	}

}