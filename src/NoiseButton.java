import java.io.FileInputStream;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class NoiseButton {
	private boolean isClicked;
	private String sound;
	private int x,y;

	public NoiseButton(String file) {
		isClicked = false;
		sound = file;
		x=0;
		y=0;

	}	

	public int getX() {
		return x;
	}
	public boolean setX(int x) {
		this.x = x;
		if (x!=0)return true;
		return false;
	}
	public int getY() {
		return y;
	}
	public boolean setY(int y) {
		this.y = y;
		if (y!=0)return true;
		return false;
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
