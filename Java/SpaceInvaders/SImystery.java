package src;

import java.util.Random;

public class SImystery extends SIinvader{
	
	private int[] values = {50, 100, 150, 300};
	public SImystery(int x, int y){
		this.x = x;
		this.y = y;
		points = values[rand(values)];
		image = getImage("SImystery.gif");
		sound = getSound("SImystery.wav");
	}
	
	private int rand(int[] vals){
		Random rnd = new Random();
		return rnd.nextInt(vals.length);
	}

	public void playSound(){
		sound.play();
	}
	public void stopSound(){
		sound.stop();
	}

}
