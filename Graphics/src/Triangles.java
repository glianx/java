import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;

public class Triangles extends JFrame {
	private static int windowW = 1500;
	private static int windowH = 1000;
	
	public static void main(String [] args) {
		new Triangles();
	}
	
	public Triangles() {
		setSize(windowW, windowH);
		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent we) {
	        	System.exit(0);
//	        	dispose(); // doesn't work
	        }
	    });
	}
	
	public void paint (Graphics g) {
		super.paint(g);
		drawTriangles(g);
	}
	
	public void drawTriangles(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
//		for (double i = 0; i < 2 * Math.PI ; i+= Math.PI / 60) {
		for (double i = 0; i < 200 ; i++) {
			
			int r = (int) (2 * i);
			
			int [] xs = {(int) (r * Math.cos(i)), (int) (r * Math.cos(i + 2 * Math.PI / 3)), (int) (r * Math.cos(i + 4 * Math.PI / 3))};
			int [] ys = {(int) (r * Math.sin(i)), (int) (r * Math.sin(i + 2 * Math.PI / 3)), (int) (r * Math.sin(i + 4 * Math.PI / 3))};
			
			for (int j = 0; j < xs.length; j++) 
				xs[j] = xs[j] + windowW / 2;
			for (int j = 0; j < ys.length; j++) {
				ys[j] = ys[j] + windowH / 2;
			}
			
			int red = (int) (255 * Math.cos(i / 70) / 2 + 255 / 2);
			int blue = (int) (255 * Math.sin(i / 70)  / 2 + 255 / 2);
			int green = (int) 255 / 2;
			g2.setColor(new Color(red, green, blue));
			g2.drawPolygon(xs, ys, 3);
		}
	}
}
