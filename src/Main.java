import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import processing.core.*;
public class Main extends PApplet{
	private Display display;
	private Grid grid;
	public Main(){
		
		display = new Display(this,0,0,640,640);
		grid = new Grid(5,5);
	}
	public void loadData(String file){
		
	}
	
	
	public void setup() {
		size(640,640);
		
		
	}
	public void draw(){
		background(0,5,0);
		display.drawGrid(grid);
	}
	
	
	

}
