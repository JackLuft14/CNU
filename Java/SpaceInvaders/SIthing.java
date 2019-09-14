package src;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;

public abstract class SIthing {
	protected int x;
	protected int y;
	protected double width;
	protected double height;
	
	/*public SIthing(int x, int y){
		this.x = x;
		this.y = y;
	}*/
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
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	// draws image at specific coordinates
	public void paintMe(Graphics2D g2, Image image, int x, int y){
		g2.drawImage(image, x, y, null);
	}
	
	// draws missile
	public void paintMe(Graphics2D g2){
		Rectangle2D.Double r = new Rectangle2D.Double(x, y, 2, 10);
		g2.setColor(Color.WHITE);
		g2.fill(r);
	}
	public void moveXBy(int delta){
		x += delta;
	}
	public void moveYBy(int delta){
		y += delta;
	}

}



