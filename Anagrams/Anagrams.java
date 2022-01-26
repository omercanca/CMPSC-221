import java.util.Arrays;
import java.util.Scanner;

// CMPSC 221
// Assignment 9
// Omer Canca

// class
public class Anagrams {
	
	
	// method
	public static void omer() {
		
		// scanner
		Scanner input = new Scanner(System.in);
		
		// welcome message
		System.out.printf("Welcome to Omer's anagram program. This program will let you know if two word that you input are anagrams.\n");
		
		// first word
		System.out.printf("What is the first word?\n");
			String firstword = input.next();
			
		// second word
		System.out.printf("What is the second word?\n");
			String secondword = input.next();
			
			// converting toCharArray
			char[] one = firstword.toCharArray();
			char[] two = secondword.toCharArray();
		
			Arrays.sort(one);
			Arrays.sort(two);
			
		// if and else statements for determining anagram validity
		if (Arrays.equals(one, two)) {
			System.out.printf("The two words are anagrams.\n");}
		else {
			System.out.printf("The two words are not anagrams. \n");
		}
	}
}