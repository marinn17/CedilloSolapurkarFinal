import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import processing.core.*;

public class Main extends PApplet {
	private Display display;
	private Grid grid;

	public Main() {
		grid = new Grid(5, 5);
		display = new Display(this, 0, 0, 640, 640,grid);
		for (int i=0;i<grid.getRows();i++){
			for (int j=0;j<grid.getCols();j++){
				grid.addNoiseButton(i, j, new NoiseButton("solemnw.wav"));
			}
		}
	}

	public void setup() {
		size(640, 640);

	}

	public void draw(){
		background(0,5,0);
		display.drawGrid(grid);
		
	}
	public void mouseClicked(){
		display.mouseCoordinates(mouseX,mouseY);
	}

}
