import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
import java.util.*;  
public class Demo extends JPanel implements MouseListener {
	private int [] xs = new int[20];
	private int [] ys = new int[20];
	private int fillCount = 0;
	private String status;
	
    public Demo() { 
        setBackground(Color.black);  
        // adding mouse listener  
        addMouseListener(this);  
    }  
    public static void main(String args[]) {  
        JFrame f = new JFrame(); // creating an object to the Jframe class  
        f.getContentPane().add(new Demo());  
        f.setTitle(" JavaTpoint "); // giving title to the frame  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setting the closing operation  
        f.setLocationRelativeTo(null); // fixing the local relative as null  
        f.setSize(400, 400); // fixing the size of the frame   
        f.setVisible(true); // fixing the visibility of the frame  
    }  
    public void paint(Graphics g) { // paint() method  
        super.paint(g); // calling the paint method present in the super class or parent class  
        g.setColor(Color.white); // fixing the outline colour of the oval as white  
        
        int r = (int) (Math.random() * 60);
        
        if (status == "press") {
            for (int i = 0; i < xs.length; i++) {
            	g.setColor(new Color(0, 255, 255));
            	g.drawOval(xs[i], ys[i], r, r);
            }
        }
        else if (status == "enter") {
        	g.setColor(new Color(255, 0, 255));
            for (int i = 0; i < xs.length; i++) {
            	g.drawOval(xs[i], ys[i], r, r);
            }
        }
        else if (status == "exit") {
        	g.setColor(new Color(255, 255, 0));
            for (int i = 0; i < xs.length; i++) {
            	g.drawOval(xs[i], ys[i], r, r);
            }
        }
        else if (status == "release") {
        	g.setColor(new Color(255, 128, 128));
            for (int i = 0; i < xs.length; i++) {
            	g.drawOval(xs[i], ys[i], r, r);
            }
        }

    }  
    public void mousePressed(MouseEvent e) {
    	status = "press";
    	xs[fillCount] = e.getX();
    	ys[fillCount] = e.getY();
    	fillCount++;
    	
    	for (int i = 0; i < xs.length; i++) {
    		System.out.println(i + " " + xs[i] + ", " + ys[i]);
    	}
    	System.out.println();
        repaint(); // calling the repaint() method  
    }  
    // MouseListener method implementation  
    public void mouseClicked(MouseEvent e) {}  
    public void mouseEntered(MouseEvent e) {
    	status = "enter";
    	repaint();
    }  
    public void mouseExited(MouseEvent e) {
    	status = "exit";
    	repaint();
    }  
    public void mouseReleased(MouseEvent e) {
    	status = "release";
    	repaint();
    }  
}  