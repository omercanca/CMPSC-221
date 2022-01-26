import java.io.File;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// CMPSC 221
// Assignment 12
// Omer Canca 

public class Driver extends Array{
	// creating the scanner
	static Scanner input = new Scanner(System.in);
	// main method
	public static void main(String[] args)  {
		
		// creating the 3 arrays that will be printed
		Array Low  = new Array();
		Array Mid = new Array();
		Array High = new Array();
		
		// asking for names of the file
		System.out.printf("Enter the name of the first file: \n");
		
		// setting string = to the next line
		String FileName = input.nextLine();
		
		// setting the file equal to the string
		File file1 = new File(FileName);
		
		
		// repeat
		System.out.printf("Enter the name of the second file: \n");
		String FileName2 = input.nextLine();
		File file2 = new File(FileName2);
		
		// repeat
		System.out.printf("Enter the name of the third file: \n");
		String FileName3 = input.nextLine();
		File file3 = new File(FileName3);
		
		// sorters
		Sorter sort1 = new Sorter(file1, Low, Mid, High);
		Sorter sort2 = new Sorter(file2, Low, Mid, High);
		Sorter sort3 = new Sorter(file3, Low, Mid, High);
		
		// executor
		ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newCachedThreadPool();
		executor.submit(sort1);
		executor.submit(sort2);
		executor.submit(sort3);
		
		// letting user know that the array writers have begun for the files that they input
		System.out.printf("Array writers have begun for " + FileName + ", " + FileName2 + ", and " + FileName3);
		
		// try statement
		try{
			// shut down the executor
			executor.shutdown();
			
			// when the executor is terminated...
			boolean done = executor.awaitTermination(1, TimeUnit.MINUTES);
				// when done, print the arrays
				if (done) {
					Answers("\nLow\n", Low);
					Answers("\nMid\n", Mid);
					Answers("\nHigh\n", High);} }
			// catch exceptions
			catch(Exception ex) {
				System.out.printf("Exception caught");}}
	

}