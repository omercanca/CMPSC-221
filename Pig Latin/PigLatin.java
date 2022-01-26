
import javax.swing.JOptionPane;


// CMPSC 221
// Exercise 5
// english pl

public class PigLatin {

	// method creation
	public static void Translation() {
		
		// setting two strings for each version of the word
	    String english;
	    String pig;
	    
	    // joption pane message
		String word = JOptionPane.showInputDialog("\nEnter the word that you would like translated into pig latin:");

		// string array called words
		String[] words = word.split("\\s");
	

	    // two integers
	    int i;
	    int x;  
	    
	    // this will the string that displays the translations
	    String answer = " ";
	
	    
	    // for all int starting at 0 and less than the length of the word, 
	    for(i=0; i < words.length; i++) {
	    
	    // English string = the characters in the array
	    english = words[i];
	
	    pig = "";
	
	    // for all x starting at 0 and less than the English word length
	    for(x=0; x < english.length(); x++) {
	    	 // vowels
		     if(english.charAt(x) == 'a' || english.charAt(x) == 'e' || english.charAt(x) == 'i' || english.charAt(x) == 'o' || english.charAt(x) == 'u')
		
		     break;
		
		     pig += english.charAt(x); }
	     
	     pig = english.substring(x, english.length()) + pig +"ay";
	     
	     answer += pig + " "; }
	    
	JOptionPane.showMessageDialog(null, answer); }
		}
	
