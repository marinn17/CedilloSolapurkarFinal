
import processing.core.*;

public class Main extends PApplet {
	private Display display;
	private Grid grid;

	public Main() {
		grid = new Grid(5, 5);
		display = new Display(this, 0, 0, 640, 640, grid);
		for (int j = 0; j < grid.getRows(); j++) {
			for (int i = 0; i < grid.getCols(); i++) {
				if (j == 0)
					grid.addNoiseButton(j, i, new NoiseButton("/CedilloSolapurkarFinal/src/1.wav"));
				if (j == 1)
					grid.addNoiseButton(j, i, new NoiseButton("/CedilloSolapurkarFinal/src/2.wav"));
				if (j == 2)
					grid.addNoiseButton(j, i, new NoiseButton("/CedilloSolapurkarFinal/src/3.wav"));
				if (j == 3)
					grid.addNoiseButton(j, i, new NoiseButton("/CedilloSolapurkarFinal/src/4.wav"));
				if (j == 4)
					grid.addNoiseButton(j, i, new NoiseButton("/CedilloSolapurkarFinal/src/5.wav"));

			}
		}
	}

	public void setup() {
		size(640, 640);
	}

	public void draw() {
		background(0, 0, 0);
		// display.drawGrid();
		display.update();
	}

	public void mouseClicked() {
		display.setMouseCoordinates(mouseX, mouseY);
		

	}

}
