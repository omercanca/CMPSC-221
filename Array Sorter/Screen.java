import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Screen {

	public static void chooseLang() {
		JFrame frame = new JFrame("The Translation Station");
		JLabel label1 = new JLabel("Welcome to The Translation Station. Please select the lanaguge you'd like to practice.");
        label1.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label1);
        label1.setFont(new Font("Serif", Font.BOLD, 22));
        JButton button = new JButton("Spanish");
        JButton button2 = new JButton("French");
        frame.add(button);
        frame.add(button2);
        frame.getContentPane().setBackground(Color.cyan);
		frame.pack();
		frame.setVisible(true);
        frame.setLayout(new GridLayout(12,20));
        frame.setSize(1000, 800);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(new chooseMode1());
        button2.addActionListener(new chooseMode2());}}


         class chooseMode1 extends Screen implements ActionListener{
         public void actionPerformed(ActionEvent ae){ 	
        	JFrame frame = new JFrame("Spanish");
 			JLabel label1 = new JLabel("Choose your difficulty");
 			label1.setHorizontalAlignment(JLabel.CENTER);
 	        label1.setFont(new Font("Serif", Font.BOLD, 22));
 	        JButton button = new JButton("Practice: Multiple Choice");
 	        button.addActionListener(new choosePractice());
 	        JButton button2 = new JButton("Quiz: Fill in the Blank");
 	        button2.addActionListener(new chooseQuiz());
 	        frame.add(label1);
 	        frame.add(button);
 	        frame.add(button2);
 	        frame.getContentPane().setBackground(Color.cyan);
 			frame.pack();
 			frame.setVisible(true);
 	        frame.setLayout(new GridLayout(12,20));
 	        frame.setSize(1000, 800);  
 	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         }}
         class chooseMode2 extends Screen implements ActionListener{
         public void actionPerformed(ActionEvent ae){ 	
        	JFrame frame = new JFrame("French");
 			JLabel label1 = new JLabel("Choose your difficulty");
 	        label1.setFont(new Font("Serif", Font.BOLD, 22));
 			label1.setHorizontalAlignment(JLabel.CENTER);
 	        JButton button = new JButton("Practice: Multiple Choice");
 	        button.addActionListener(new choosePractice2());
 	        JButton button2 = new JButton("Quiz: Fill in the Blank");
 	        button2.addActionListener(new chooseQuiz2());
 	        frame.add(label1);
 	        frame.add(button);
 	        frame.add(button2);
 	        frame.getContentPane().setBackground(Color.magenta);
 			frame.pack();
 			frame.setVisible(true);
 	        frame.setLayout(new GridLayout(12,20));
 	        frame.setSize(1000, 800);  
 	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         }
        }
         
         
         
         
         
         
	         class choosePractice extends Screen implements ActionListener{
	        	 public void actionPerformed(ActionEvent ae) {
	             	JFrame frame = new JFrame("Spanish Practice");
	     			JLabel label1 = new JLabel("Choose the correct translation to the following sentence");
	     			JButton a = new JButton("A");
	     			JButton b = new JButton("B");
	     			JButton c = new JButton("C");
	     			JButton d = new JButton("D");

	     	        a.setVerticalAlignment(JLabel.BOTTOM);
	     	        frame.add(label1);
	     			frame.add(a);
	     			frame.add(b);
	     			frame.add(c);
	     			frame.add(d);
	     	        label1.setFont(new Font("Serif", Font.BOLD, 22));
	     	        label1.setHorizontalAlignment(JLabel.CENTER);
	     	        frame.getContentPane().setBackground(Color.cyan);
	     			frame.pack();
	     			frame.setVisible(true);
	     	        frame.setLayout(new GridLayout(12,20));
	     	        frame.setSize(1000, 800);  
	     	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        	 }
	         }
	         
	         class choosePractice2 extends Screen implements ActionListener{
	        	 public void actionPerformed(ActionEvent ae) {
	             	JFrame frame = new JFrame("French Practice");
	            	JLabel label1 = new JLabel("Choose the correct translation to the following sentence");
	     			JButton a = new JButton("A");
	     			JButton b = new JButton("B");
	     			JButton c = new JButton("C");
	     			JButton d = new JButton("D");
	     	        frame.add(label1);
	     	        label1.setHorizontalAlignment(JLabel.CENTER);
	     			frame.add(a);
	     			frame.add(b);
	     			frame.add(c);
	     			frame.add(d);
	     	        label1.setFont(new Font("Serif", Font.BOLD, 22));
	     	        frame.getContentPane().setBackground(Color.magenta);
	     			frame.pack();
	     			frame.setVisible(true);
	     	        frame.setLayout(new GridLayout(12,20));
	     	        frame.setSize(1000, 800);  
	     	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        	 }
	         }
	         
	         
	         
	         
	         
	         
	         
	         class chooseQuiz extends Screen implements ActionListener{
	        	 public void actionPerformed(ActionEvent ae) {
	             	JFrame frame = new JFrame("Spanish Quiz");
	            			JLabel label1 = new JLabel("Fill in the Blank");
	            			JTextField answer = new JTextField();
	            	        frame.add(label1);
	            	        label1.setHorizontalAlignment(JLabel.CENTER);
	            	        label1.setFont(new Font("Serif", Font.BOLD, 22));
	            	        frame.add(answer);
	            	        frame.getContentPane().setBackground(Color.cyan);
	            			frame.pack();
	            			frame.setVisible(true);
	            	        frame.setLayout(new GridLayout(12,20));
	            	        frame.setSize(1000, 800);  
	            	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        	 }
	         }
	         
	         class chooseQuiz2 extends Screen implements ActionListener{
	        	 public void actionPerformed(ActionEvent ae) {
	             	JFrame frame = new JFrame("French Quiz");
	            			JLabel label1 = new JLabel("Fill in the Blank");
	            			JTextField answer = new JTextField();
	            	        frame.add(label1);
	            	        label1.setFont(new Font("Serif", Font.BOLD, 22));
	            	        label1.setHorizontalAlignment(JLabel.CENTER);
	            	        frame.add(answer);
	            	        frame.getContentPane().setBackground(Color.magenta);
	            			frame.pack();
	            			frame.setVisible(true);
	            	        frame.setLayout(new GridLayout(12,20));
	            	        frame.setSize(1000, 800);  
	            	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        	 }
	         }
	         
	         
	        
         
