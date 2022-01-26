// CMPSC 221
// Assignment 8
// Omer Canca

// 3 imports
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.util.Scanner;

// creating class
public class pieChart extends JComponent{
	
	// integers that will be entered by the user for the pie chart
	public static int int1;
	public static int int2;
	public static int int3;
	public static int int4;
	public static int sum;
	
	// Arc2d method
       public void paint(Graphics g) {
        	super.paintComponent(g);
        	Graphics2D g2d = (Graphics2D) g;
        	g2d.setPaint(Color.red);
        	g2d.draw(new Arc2D.Double(240,30,75,100,0,int1, Arc2D.PIE));
        	g2d.setPaint(Color.cyan);
        	g2d.draw(new Arc2D.Double(240,30,75,100,int1,int2, Arc2D.PIE));
        	g2d.setPaint(Color.green);
        	g2d.draw(new Arc2D.Double(240,30,75,100,(int1+int2),int3, Arc2D.PIE));
        	g2d.setPaint(Color.orange);
        	g2d.draw(new Arc2D.Double(240,30,75,100,(int1+int2+int3),int4, Arc2D.PIE));

    }
}