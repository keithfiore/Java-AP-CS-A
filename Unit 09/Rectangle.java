import java.awt.Color;


public class Rectangle {

	private int x = (int)(Math.random()*300);
	private int y = (int)(Math.random()*300);
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getWidth() {
		return 50;
	}
	
	public int getHeight() {
		return 50;
	}
	
	public Color getFillColor() {
		return Color.GREEN;
	}
	
	public Color getBorderColor() {
		return Color.BLACK;
	}
}
