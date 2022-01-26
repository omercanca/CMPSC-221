import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

// CMPSC 221
// Assignment 12
// Omer Canca 

// creation of class and implements run()
public class Sorter implements Runnable {
	
	// creating a file and 3 arrays
	File file = null;
	Array array1;
	Array array2;
	Array array3;
	
	// constructor
	public Sorter(File file, Array array1, Array array2, Array array3) {
	
		this.file = file;
		this.array1 = array1;
		this.array2 = array2;
		this.array3 = array3;
	}
	public void run() {
		
		// scanner
		Scanner input = new Scanner(System.in);
		
		try {
			// scanner
			input = new Scanner(file, StandardCharsets.UTF_8.name());
			
			// for the inputs
			while(input.hasNextLine()) {
				// array of digits split by a space character
				String[] digits = input.nextLine().split(" ");
				for (String n: digits) {
					int digit = Integer.parseInt(n);
					// if digit is between 1-100, add to array 1
					if(digit >= 1 && digit <=100) {
						array1.add(digit);}
					// if digit is between 100-200 add to array2
					if(digit > 100 && digit <=200) {
						array2.add(digit);}
					// if digit is  between 200-300 to array 3
					if(digit > 200 && digit <= 300) {
						array3.add(digit);}}}}
		// catching file not found exception if the input file isn't found
		 catch (FileNotFoundException ex) {
			System.out.printf("This file could not be found!\n");}}}