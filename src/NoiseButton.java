import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class NoiseButton {
	private boolean isClicked;
	private Clip sound ;
	

	public NoiseButton (String file){
		isClicked = false;
		sound = loadClip(file);
		
	}
	public Clip loadClip(String file){
		Clip clip = null;
		try {
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource(file));
			clip = AudioSystem.getClip();
			clip.open(audioIn);
		}catch(Exception e){
			e.printStackTrace();
		}
		return clip;
	}
	
	public void play(){
		stopClip();
		sound.start();
	}
	
	public void stopClip(){
		if (sound.isRunning()){
			sound.stop();
		}
	}

	public void switchButton(){ // switch the button to either clicked or not clicked
		isClicked=!isClicked;
	}
	public boolean getClicked(){
		return isClicked;
	}
	
	
}
