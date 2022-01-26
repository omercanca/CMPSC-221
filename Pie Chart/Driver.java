// CMPSC 221
// Assignment 8
// Omer Canca

import java.awt.Dimension;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Driver extends pieChart{

   public static void main(String[] args) {
	Scanner rain = new Scanner(System.in);
   	// int 1
	System.out.printf("What is the first integer?\n");
	int a = rain.nextInt(); 
	
	// int 2
	System.out.printf("What is the second integer?\n");
	int b = rain.nextInt();
	
	
	// int 3
	System.out.printf("What is the third integer?\n");
	int c = rain.nextInt(); 
	
	// int 4
	System.out.printf("What is the fourth integer?\n");
	int d =  rain.nextInt(); 
	
	sum = (a + b + c + d);
	int1 = (360 * a / sum); 
	int2 = (360 * b / sum);
	int3 = (360 * c / sum);
	int4 = (360 * d / sum);
	
    JFrame frame = new JFrame("Omer's Pie Chart");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.getContentPane().add(new pieChart());
    frame.pack();
    // setting size
    frame.setSize(new Dimension(420, 450));
    //visibility
    frame.setVisible(true);
    
    
}
}