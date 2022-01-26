// CMPSC 221
// Assignment 11
// Omer Canca 


import java.util.ArrayList;
import java.util.Iterator;


// Creating class
public class Sets {
	
	public static void omer() {
		
		// this is the creation of all the array lists
        ArrayList<Integer> U=new ArrayList<Integer>();
        
        // for all int starting at 1 and less than 11, add it to array list u
        for (int i = 1; i < 11; i++) 
        	U.add(i); 
        
        ArrayList<Integer> E=new ArrayList<Integer>();
        // for all int starting at 2 and less than 1, i is i+2. add these to the array list E
        for (int i = 2; i < 11; i = i+2) 
        	E.add(i);
        
        //repeat the following for each array list and their elements
        
        ArrayList<Integer> O=new ArrayList<Integer>();
        for (int i = 1; i < 10; i = i + 2) 
            O.add(i);
        
        
        ArrayList<Integer> A=new ArrayList<Integer>();
        for (int i = 3; i < 6; i++) 
        	A.add(i);
        
        
        ArrayList<Integer> B=new ArrayList<Integer>();
        for (int i = 5; i < 8; i++) 
        	B.add(i);
   	
        
        ArrayList<Integer> C=new ArrayList<Integer>();




    	
        // opMinus operation
        ArrayList<Integer> opUnion = new ArrayList<Integer>();
        //A union B
        opUnion.addAll(A);
        opUnion.addAll(B);
         
	    // array list answer creation
	    ArrayList<Integer> unionAnswer = new ArrayList<Integer>(); 
	    // for the integer int1 opunion
	    for (Integer int1: opUnion) { 
	    	// if union answer doesnt contain the int1, add it
	        if (!unionAnswer.contains(int1)) { 
	            unionAnswer.add(int1); }} 

	    // print the answer
	    System.out.print("\nA union B = ");
	    // iterator creation
	    Iterator answer = unionAnswer.iterator();
	    while (answer.hasNext()) {
	    	// print the answer
		    System.out.printf((Integer)answer.next() + ",");}
		    opUnion.clear();
		// repeat for each operation

		    
		 
        // intersect operation
        for (Integer int1: A) { 
            if (B.contains(int1)) { 
                opUnion.add(int1); } } 
        
        // print the answer
        System.out.printf("\nA intersect B = ");
        Iterator it2 = opUnion.iterator();
        while (it2.hasNext()) {
        System.out.printf((Integer) it2.next() + ",");}
        
        
        
        
        // complement operation
        opUnion.clear();
        for (Integer int1: U) { 
            if (!A.contains (int1)) { 
                opUnion.add (int1); } } 
        
        // print the answer
        System.out.printf("\nA complement = ");
        Iterator it3 =opUnion.iterator();
        while(it3.hasNext()) {
        System.out.printf((Integer)it3.next() + ",");}
        
        
        
        
        // o-b opMinus operation
        ArrayList<Integer> opMinus=new ArrayList<Integer>();
        opUnion.addAll(O);
        opMinus.addAll(O);

        for (Integer int1: opUnion) { 
            // if b contains the int1, remove it
            if (B.contains(int1)) { 
                opMinus.remove(int1); }} 
        
        // print operation
        System.out.printf("\nO minus B = ");
        it3 = opMinus.iterator();
        while(it3.hasNext()) {
        System.out.printf((Integer)it3.next() + ",");}
        
        
        
        
        // operation e-a opMinus
        opUnion.clear();
        opUnion.addAll(E);
        opMinus.clear();
        opMinus.addAll(E);

        for (Integer int1 : opUnion) { 
            if (A.contains(int1)) { 
                opMinus.remove(int1); }} 
        
        // print statement
        System.out.printf("\nE - A = ");
        it3 = opMinus.iterator();
        if(it3.hasNext()) {
        System.out.printf((Integer)it3.next() + "");}
        
        
        
        
        //Symmetric difference operation of a and b
        opUnion.clear();
        opUnion.addAll(unionAnswer);
    
        for (Integer int1: A) { 
            if (B.contains(int1)) { 
                opUnion.remove(int1);} }
        
        it3 = opUnion.iterator();
        System.out.printf("\nA Symmetric Difference B = ");
        while(it3.hasNext()) {
        System.out.printf((Integer)it3.next() + ","); } 
       
        // print statements for the true or false values of the the subsets
        System.out.printf("\nTrue or false? C is a subset of U.\n"+ subset(C,U));
        System.out.printf("\nTrue or false? E is a subset of U.\n"+ subset(E,U));
        System.out.printf("\nTrue or false? A is a subset of B.\n"+ subset(A,B) + "\n"); }
	
	
	
	// this is the boolean subset to tell if one arraylist is a subset of another
    public static boolean subset(ArrayList<Integer> A,ArrayList<Integer> B) {

        for (Integer int1: A) { 
        	// if it is not present, add it
            if (B.contains(int1)) { 
               continue;} 
            else {
                return false; } } 
        	return true;}
}