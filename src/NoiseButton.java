
public class NoiseButton {
	private boolean isClicked;
	// whatever the data type is for sound
	public NoiseButton (String file){
		//save file to whatever the variable is
		isClicked = false;
	}
	
	public void play(){
		
	}
	
	public void switchButton(){ // switch the button to either clicked or not clicked
		isClicked=!isClicked;
	}
	public boolean getClicked(){
		return isClicked;
	}
	
	
}
