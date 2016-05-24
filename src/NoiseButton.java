import java.io.FileInputStream;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class NoiseButton {
	private boolean isClicked;
	private String sound;

	public NoiseButton(String file) {
		isClicked = false;
		sound = file;

	}	
	public void play() {
		try {
			InputStream in = new FileInputStream(sound);

			// create an audiostream from the inputstream
			AudioStream audioStream = new AudioStream(in);
			
			// play the audio clip with the audioplayer class
			AudioPlayer.player.start(audioStream);
		} catch (Exception e) {}
	}
	

	public void switchButton() { // switch the button to either clicked or not
					// clicked
		isClicked = !isClicked;
	}

	public boolean getClicked() {
		return isClicked;
	}

}
