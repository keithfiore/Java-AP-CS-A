import java.util.*;
import java.awt.*;
import javax.swing.*;


public class Runner extends JPanel {

    //wouldn't this be better in one ArrayList?
	private Rectangle rect = new Rectangle();
	private HappyRectangle hRect = new HappyRectangle();
	private WideRectangle wRect = new WideRectangle();
	
	public static void main(String[] args) {
		
		Runner runner = new Runner();
		
		JFrame frame = new JFrame();
		frame.setTitle("Inheritance Basics");
		frame.setLayout(new BorderLayout());
		frame.add(runner, BorderLayout.CENTER);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}
	
	public void paint(Graphics g) {
		
		//Draw the rectangle
		g.setColor(rect.getFillColor());
		g.fillRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
		g.setColor(rect.getBorderColor());
		g.drawRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
		
		//Draw the wide rectangle
		g.setColor(wRect.getFillColor());
		g.fillRect(wRect.getX(), wRect.getY(), wRect.getWidth(), wRect.getHeight());
		g.setColor(wRect.getBorderColor());
		g.drawRect(wRect.getX(), wRect.getY(), wRect.getWidth(), wRect.getHeight());
		
		//Draw the happy rectangle
		g.setColor(hRect.getFillColor());
		g.fillRect(hRect.getX(), hRect.getY(), hRect.getWidth(), hRect.getHeight());
		g.setColor(hRect.getBorderColor());
		g.drawRect(hRect.getX(), hRect.getY(), hRect.getWidth(), hRect.getHeight());
	}

}
