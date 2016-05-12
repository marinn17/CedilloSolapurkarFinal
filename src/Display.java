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
		for (int i = 0; i < g.getRows(); i++) {
			for (int j = 0; j < g.getCols(); j++) {
				p.line(350, 360, 100, 100);
			}
		}
	}

}
