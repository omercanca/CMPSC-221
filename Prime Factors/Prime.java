import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// CMPSC 221
// Omer Canca
// Exercise 7

public class Prime {
	public static void Factors (String[] args) {
		
		// scanner and input naming
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter the number\n");
		int number = input.nextInt();
		int omer = number;
		
		//flist
		List<Integer> flist = new ArrayList<Integer>();
		flist.add(1);
		flist.add(number);
		
		
		// loop to add numbers and rename variable
		int i;
		for(i=2; i < number; i++) {
			while (number % i == 0) {
				flist.add(i);
				number = number / i;}}
		
		// loop
		if (number >= 3) {
			flist.add(i);}
		
		// naming prime factors
		Collections.sort(flist);
		System.out.printf("Prime factors for " + number + " are\n");
		for (int answers: flist) {
			System.out.printf(answers + "\n");}
		
		// new list for factors and its loop
		List<Integer> prime = new ArrayList <Integer>();
		for(i = 1; i <= omer; i++) {
			if (omer % i == 0) {
				prime.add(i);}}
		
		// listing the factors and for loop
		System.out.printf("The factors of " + number + " are\n");
			for(int x: prime) {
				System.out.printf(x + "\n");}
		
		// end
		System.out.printf("Thank you for a great semester Professor Martin!\nAlthough I transitioned from python to oop this semester,\nyour course greatly increased my knowledge and ability in java. Happy holidays! \n");
	}
}
