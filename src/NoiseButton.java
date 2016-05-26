import java.io.FileInputStream;
import java.io.InputStream;

import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

public class NoiseButton {
	private boolean isClicked;// if it is turn on or not
	private String sound;// sound file
	private int x, y;// top right corner
	private InputStream in;
	private ContinuousAudioDataStream loop;
	private AudioStream audioStream;
	private AudioData audiodata;

	public NoiseButton(String file) {
		isClicked = false;
		sound = file;
		x = 0;
		y = 0;
		try {
			in = new FileInputStream(sound);
			loop = null;
			// create an audiostream from the inputstream
			audioStream = new AudioStream(in);
			audiodata = audioStream.getData();
			loop = new ContinuousAudioDataStream(audiodata);
		} catch (Exception e) {
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void play() {
		try {// play the audio clip with the audioplayer class
			AudioPlayer.player.start(loop);
		} catch (Exception e) {
		}
	}

	public void stop() {
		AudioPlayer.player.stop(loop);
	}

	public void switchButton() { // switch the button to either clicked or not
		// clicked
		isClicked = !isClicked;
	}

	public boolean getClicked() {
		return isClicked;
	}
}
