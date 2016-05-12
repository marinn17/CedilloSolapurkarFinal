import processing.core.*;
public class Main extends PApplet{
	private Display display;
	public Main(){
		
		display = new Display(this,1,1,640,640);
		
	}
	public void loadData(String file){
		
	}
	public void setup() {
		size(640,640);
		
		
	}
	public void draw(){
		background(255,255,255);
		display.drawGrid();
	}
	
	
	

}
