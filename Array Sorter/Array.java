// CMPSC 221
// Assignment 12
// Omer Canca 

public class Array {
	int x = 0;
	Integer[] numbers = new Integer[50];
	public int getX() {
		return x;}
	
	
	// add method to add the numbers into the arrays in the sorter file
	public void add(int digit) {
		numbers[x] = digit;
		x++;}
	
	
	// get and return numbers
	public Integer[] getNumbers() {
		return numbers; }
	
	
	// constructor to add the numbers into the arrays
	static void Answers(String s, Array array){
		System.out.print(s);
		
	// for int starting at 0 and less than ___
	for(int i = 0; i < array.getX(); i++) {
		System.out.print(array.getNumbers()[i] + " ");}}}

