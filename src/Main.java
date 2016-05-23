
import processing.core.*;

public class Main extends PApplet {
	private Display display;
	private Grid grid;

	public Main() {
		grid = new Grid(5, 5);
		display = new Display(this, 0, 0, 640, 640,grid);
		for (int i=0;i<grid.getRows();i++){
			for (int j=0;j<grid.getCols();j++){
				grid.addNoiseButton(i, j, new NoiseButton("/CedilloSolapurkarFinal/solemnw.wav"));
			}
		}
	}

	public void setup() {
		size(640, 640);
	}

	public void draw(){
		background(0,0,0);
		//display.drawGrid();
		display.update();
		display.runLine();
	}
	public void mouseClicked(){
		display.setMouseCoordinates(mouseX,mouseY);
		
	}

}
