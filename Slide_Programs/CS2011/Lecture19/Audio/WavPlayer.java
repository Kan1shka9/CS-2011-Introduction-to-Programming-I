package CS2011.Lecture19.Audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.LineEvent.Type;

public class WavPlayer {
	
	private void playClip(File clipFile) throws IOException, UnsupportedAudioFileException, LineUnavailableException, InterruptedException {

		AudioListener listener = new AudioListener();
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(clipFile);
		
		try {
			
			Clip clip = AudioSystem.getClip();
			clip.addLineListener(listener);
			clip.open(audioInputStream);
			
			try {
				
				clip.start();
				listener.waitUntilDone();
				
			} 
			
			finally {
				
				clip.close();
				
			}
			
		} 
		
		finally {
			
			audioInputStream.close();
			
		}
		
	}

	public static void main(String[] args) {
		
		WavPlayer a = new WavPlayer();
		
		try {
			
			a.playClip(new File("trans.wav"));
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

	private class AudioListener implements LineListener {
		
		private boolean done = false;

		@Override
		public synchronized void update(LineEvent event) {
			
			Type eventType = event.getType();
			
			if (eventType == Type.STOP || eventType == Type.CLOSE) {
				
				done = true;
				
			}
			
		}

		public synchronized void waitUntilDone() throws InterruptedException {
			while (!done) {
				
				wait();
				
			}
			
		}
		
	}
	
}