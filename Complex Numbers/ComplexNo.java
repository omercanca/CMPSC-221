// CMPSC 221
// Exercise 3
// Omer Canca

// imports
import java.util.Scanner;

// class
public class ComplexNo{
	// main method
	public static void yes() throws Exception {
		
		// scanner
		Scanner input = new Scanner(System.in);
		// print description
		System.out.printf("Complex numbers come in form a+bi.\nThis system will perform math operations on two complex numbers.");
		
		// receive and assign value
		System.out.printf("\nEnter the a value of the first complex number.\n");
			double a = input.nextDouble();
			
		// receive and assign value
		System.out.printf("Enter the b value of the first complex number.\n");
			double b = input.nextDouble();
			
		// receive and assign value
		System.out.printf("Enter the a value of the second complex number.\n");
			double c = input.nextDouble();

		// receive and assign value
		System.out.printf("Enter the b value of the second complex number.\n");
			double d = input.nextDouble(); 
			
			// call methods
			addition(a, b, c, d);
			subtraction(a, b, c, d);
			multiplication(a, b, c, d);
			division(a, b, c, d);
			equals(a, b, c, d);
			}
		
		// addition method
		public static void addition(double a,double b,double c, double d) {
			System.out.printf("\nThe sum of your complex numbers are " + (a+c) + " + " + (b+d) + ("i"));
		}
		
		// subtraction method
		public static void subtraction(double a,double b,double c, double d) {
			System.out.printf("\nThe difference of your complex numbers are " + (a-c) + " + " + (b-d) + ("i"));
		}
		
		// multiplication method
		public static void multiplication(double a,double b,double c, double d) {
			System.out.printf("\nThe product of your complex numbers are " + ((a*c) - (b*d)) + " + " + ((b*c +a*d)) + ("i\n"));
		}
		
		// division method
		public static void division(double a,double b,double c, double d) throws Exception {
			    
		    if(c !=0 && d!=0) {
		    	double e;
		    	double f;
		        e = (a*c-b*d)/(c*c+d*d);
		        f = (a*d+c*b)/(c*c+d*d);
		        System.out.printf("The quotient of your complex numbers are " + e + " + " + f + "i"); }
		        
		    if(c==0 || d ==0) {
		    	throw new Exception("Cannot divide by 0+0i");	}
		    	  }
		
		// boolean  method
		public static boolean equals(double a, double b, double c, double d) {
			if (a==c && b==d) {
				System.out.printf("\nTrue. The values are equal.\n\n"); 
				return true; }
			else
				System.out.printf("\nFalse. The values are unequal.\n\n");
				return false; 
		}
}