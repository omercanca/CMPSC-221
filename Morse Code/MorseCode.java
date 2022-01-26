// CMPSC 221
// Exercise 6
// Omer Canca

// Class creation
public class MorseCode {
	String english;
	String morse;
	char[] englishA;
	char[] morseA;
	
	MorseCode(String omer){
		english = omer;}

	public String Translations(char x)
	{
	switch(x)
	{
	case 'a': return ".-" ;
	case 'b': return "-..." ;
	case 'c': return "-.-." ;
	case 'd': return "-.." ;
	case 'e': return "." ;
	case 'f': return "..-." ;
	case 'g': return "--." ;
	case 'h': return "...." ;
	case 'i': return ".." ;
	case 'j': return ".---" ;
	case 'k': return "-.-" ;
	case 'l': return ".-.." ;
	case 'm': return "--" ;
	case 'n': return "-." ;
	case 'o': return "---" ;
	case 'p': return ".--." ;
	case 'q': return "--.-" ;
	case 'r': return ".-." ;
	case 's': return "..." ;
	case 't': return "-" ;
	case 'u': return "..-" ;
	case 'v': return "...-" ;
	case 'w': return ".--" ;
	case 'x': return "-..-" ;
	case 'y': return "-.--" ;
	case 'z': return "--.." ;
	case ' ': return " ";
	case ',': return "--..--";
	case '.': return ".-.-.-";
	case '?': return "..--..";
	case '0': return "-----";
	case '1': return ".----";
	case '2': return "..---";
	case '3': return "...--";
	case '4': return "....-";
	case '5': return ".....";
	case '6': return "-....";
	case '7': return "--...";
	case '8': return "---..";
	case '9': return "----."; 
	}
	return " "; }
	

public char Translationss(String x) {
	switch(x){	
	case ".-" : return 'a' ;
	case "-...": return 'b' ;
	case "-.-.": return 'c' ;
	case "-..": return 'd' ;
	case ".": return 'e' ;
	case "..-.": return 'f' ;
	case "--.": return 'g' ;
	case "....": return 'h' ;
	case "..": return 'i';
	case ".---" : return 'j' ;
	case "-.-": return 'k' ;
	case ".-..": return 'l' ;
	case "--" : return 'm' ;
	case "-.": return 'n' ;
	case "---": return 'o' ;
	case ".--.": return 'p' ;
	case "--.-": return 'q' ;
	case ".-.": return 'r' ;
	case "..." : return 's' ;
	case "-": return 't' ;
	case "..-": return 'u' ;
	case "...-": return 'v' ;
	case ".--" : return 'w' ;
	case "-..-": return 'x' ;
	case "-.--": return 'y' ;
	case "--..": return 'z' ;
	case " ": return ' ';
	case "--..--": return ',';
	case ".-.-.-": return '.';
	case "..--..": return '?';
	case "-----": return '0';
	case ".----": return '1';
	case "..---": return '2';
	case "...--": return '3';
	case "....-": return '4';
	case ".....": return '5';
	case "-....": return '6';
	case "--...": return '7';
	case "---..": return '8';
	case "----.": return '9'; }
	return ' ';
	}
	
	public String ex() {
		morse = "";
		for(int i = 0; i < english.length(); i++)
			morse += Translations(Character.toLowerCase(english.charAt(i))) + " ";
			return morse; }
	public String englishTranslation() {
		return english;}
	
	public String exx() {
		english = "";
		for(int i = 0; i < morse.length(); i++)
			english += Translations(Character.toLowerCase(morse.charAt(i))) + " ";
			return english; }
	public String englishTranslationn() {
		return morse;}
	
	}
