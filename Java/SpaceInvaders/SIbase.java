package src;

import java.applet.AudioClip;

public class SIbase extends SIship{

	private AudioClip shoot;
	
	public SIbase(int x, int y){
		this.x = x;
		this.y = y;
		image = getImage("SIbase.gif");
	}
	
	public void playSound(){
		shoot = getSound("SIbaseShoot.wav");
		shoot.play();
	}
}
