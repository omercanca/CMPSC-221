import java.util.Scanner;

// CMPSC 221
// Exercise 6
// Omer Canca

// Class creation
public class Driver {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
	System.out.printf("Enter 1 to translate from English to Morse.\nEnter 2 to translate from Morse to English.\n");
	
	int option = input.nextInt();
	
	
	if (option == 1){
		Scanner input2 = new Scanner(System.in);
		System.out.printf("Enter English text to convert into Morse code: \n");
		String english = input2.nextLine();
		MorseCode text = new MorseCode(english);
		System.out.printf("\nThe translation is: " +  text.ex() + "\n"); }
	
	
	if (option == 2) {
		Scanner input3 = new Scanner(System.in);
		System.out.printf("Enter Morse code to convert into English text: \n");
		String morse = input3.nextLine();
		MorseCode text = new MorseCode(morse);
		System.out.printf("\nThe translation is: " +  text.exx() + "\n"); 
		}
	
	}	
}
