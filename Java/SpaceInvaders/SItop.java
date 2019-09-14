package src;

import java.awt.image.ImageObserver;

public class SItop extends SIinvader{
	ImageObserver observer;
	public SItop(int x, int y){
		this.x = x;
		this.y = y;
		points = 30;
		image  = getImage("SItop0.gif");
		width = image.getWidth(observer);
	}

}
