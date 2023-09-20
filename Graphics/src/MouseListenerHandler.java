import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MouseListenerHandler extends JFrame implements MouseListener {

	public int xCoordinate;
	public int yCoordinate;

   JFrame frame = new JFrame();
   Container pane = frame.getContentPane();


   MouseListenerHandler(){
       pane.addMouseListener(this);


       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(375,450);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
   }


   public void mouseClicked(MouseEvent e) {


       int count = e.getClickCount();
       System.out.println("You CLICKED the mouse " + count + " times.");
   }


   public void mouseEntered(MouseEvent e) {
//       pane.setBackground(Color.YELLOW);
   }


   public void mouseExited(MouseEvent e) {
//       pane.setBackground(Color.MAGENTA);
   }


   public void mousePressed(MouseEvent e) {
       System.out.println("You have PRESSED the mouse");
       
       xCoordinate = e.getX();
       yCoordinate = e.getY();
       
       System.out.println("clicked at " + xCoordinate + " " + yCoordinate);
       
       repaint();
   }


   public void mouseReleased(MouseEvent e) {


//       int a = e.getX();
//       int b = e.getY();
//       System.out.println("You have RELEASED the mouse at (" + a + "," + b + ") - (X,Y)");
   }
   
	public void paint (Graphics g) {
		super.paint(g);
		draw(g);
	}
	
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawOval(xCoordinate, yCoordinate, 100, 100);
	}
     
   public static void main(String args[]){
      
       new MouseListenerHandler();
  
   }
}