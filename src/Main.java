import processing.core.*;
public class Main extends PApplet {
	private Display display;
	private Grid grid;

	public Main() {
		grid = new Grid(5, 5);
		display = new Display(this, 10, 10, 640, 640, grid);
		//this is excessive because it is a tone matrix. which creates harmonious sounds 
		//when notes are in a specific order
		grid.addNoiseButton(0,2,new NoiseButton("/CedilloSolapurkarFinal/assets/a.wav"));
		grid.addNoiseButton(2,4,new NoiseButton("/CedilloSolapurkarFinal/assets/a.wav"));
		grid.addNoiseButton(1,3,new NoiseButton("/CedilloSolapurkarFinal/assets/a.wav"));
		grid.addNoiseButton(2,3,new NoiseButton("/CedilloSolapurkarFinal/assets/b.wav"));	
		grid.addNoiseButton(0,1,new NoiseButton("/CedilloSolapurkarFinal/assets/bb.wav"));
		grid.addNoiseButton(1,2,new NoiseButton("/CedilloSolapurkarFinal/assets/bb.wav"));
		grid.addNoiseButton(3,4,new NoiseButton("/CedilloSolapurkarFinal/assets/bb.wav"));
		grid.addNoiseButton(0,0,new NoiseButton("/CedilloSolapurkarFinal/assets/c.wav"));
		grid.addNoiseButton(1,1,new NoiseButton("/CedilloSolapurkarFinal/assets/c.wav"));
		grid.addNoiseButton(2,2,new NoiseButton("/CedilloSolapurkarFinal/assets/c.wav"));
		grid.addNoiseButton(3,3,new NoiseButton("/CedilloSolapurkarFinal/assets/c.wav"));
		grid.addNoiseButton(4,4,new NoiseButton("/CedilloSolapurkarFinal/assets/c.wav"));
		grid.addNoiseButton(1,0,new NoiseButton("/CedilloSolapurkarFinal/assets/d.wav"));
		grid.addNoiseButton(2,1,new NoiseButton("/CedilloSolapurkarFinal/assets/d.wav"));
		grid.addNoiseButton(4,3,new NoiseButton("/CedilloSolapurkarFinal/assets/d.wav"));
		grid.addNoiseButton(3,2,new NoiseButton("/CedilloSolapurkarFinal/assets/d.wav"));
		grid.addNoiseButton(2,0,new NoiseButton("/CedilloSolapurkarFinal/assets/e.wav"));
		grid.addNoiseButton(3,1,new NoiseButton("/CedilloSolapurkarFinal/assets/eb.wav"));
		grid.addNoiseButton(4,2,new NoiseButton("/CedilloSolapurkarFinal/assets/eb.wav"));
		grid.addNoiseButton(0,4,new NoiseButton("/CedilloSolapurkarFinal/assets/f.wav"));
		grid.addNoiseButton(3,0,new NoiseButton("/CedilloSolapurkarFinal/assets/f.wav"));
		grid.addNoiseButton(4,1,new NoiseButton("/CedilloSolapurkarFinal/assets/f.wav"));
		grid.addNoiseButton(0,3,new NoiseButton("/CedilloSolapurkarFinal/assets/g.wav"));
		grid.addNoiseButton(1,4,new NoiseButton("/CedilloSolapurkarFinal/assets/g.wav"));
		grid.addNoiseButton(4,0,new NoiseButton("/CedilloSolapurkarFinal/assets/g.wav"));
	}

	public void setup() {
		size(640, 640);
	}

	public void draw() {
		background(0, 0, 0);
		display.drawGrid();
		display.updateDisplay();
	}

	public void mouseClicked() {
		display.updateGrid(mouseX, mouseY);
	}
}
