// Cmpsc 221
// Assignment 7
// Omer Canca

// all of my imports
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// kilo conversion class
public class KiloConverter extends JFrame {
	private static final long serialVersionUID = 1L;
	public JTextField Kilometers;
	public JTextField Miles;
	
	// kilo function
	public KiloConverter() {
		
		// creating jpanel
		JPanel omer = new JPanel();
		
		// layout
		omer.setLayout(new FlowLayout());
		
		// asking for input
		omer.add(new JLabel("Enter a distance in kilometers: "));
		
		// title and layout
		setTitle("KiloConverter");
		setLayout(new BorderLayout());
		
		// text fields
		Kilometers = new JTextField(20);
		omer.add(Kilometers);
		JButton button = new JButton("Click to calculate");
		button.addActionListener((ActionListener) new Calculation());
		omer.add(button);
		
		// another panel
		JPanel user = new JPanel();
		user.setLayout(new FlowLayout());
		
		// miles text field and characteristics
		Miles = new JTextField(20);
		Miles.setBackground(Color.lightGray);
		Miles.setEditable(false);
		
		// mile label
		JLabel lblDisplay = new JLabel("Distance in miles is: ");
		user.add(lblDisplay);
		user.add(Miles);
		
		// exit button
		JButton Done = new JButton("Exit");
		Exit.addActionListener(new Exit());
		user.add(Done); 
	
		add(omer,BorderLayout.PAGE_START);
		add(user, BorderLayout.CENTER);
	}

	// calculation class
	private class Calculation implements ActionListener {
		
		// method
		public void actionPerformed(ActionEvent ae) {
			
			// variables
			double kilo = Double.parseDouble(Kilometers.getText());
			double mi = (kilo * .6213);
			
			// print and format
			Miles.setText(String.format("%.2f", mi)); }
				

	
	}}