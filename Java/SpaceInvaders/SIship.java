package src;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public abstract class SIship extends SIthing{
	private boolean hit;
	protected AudioClip sound = getSound("SIshipHit.wav");
	protected Image image;
	
	// returns sound clip associated with event
	protected AudioClip getSound(String name){
		URL file = getClass().getResource(name);
		return Applet.newAudioClip(file);
	}
	
	public boolean isShipHit(){
		return hit;
	}
	
	public void hitShip(){
		hit = true;
		sound.play();
	}
	
	// returns image of invader
	protected Image getImage(String name){
		URL file = getClass().getResource(name);
		ImageIcon icon = new ImageIcon(file);
		return icon.getImage();
	}
	
	// returns new image
	protected void changeImage(String name){
		image = getImage(name);
	}
}
