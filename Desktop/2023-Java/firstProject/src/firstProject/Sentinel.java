package mainstuff;

import java.util.Scanner;

public class Sentinel {
	
	public static void main(String[] args) {
		boolean loop = true;
		
		Scanner in = new Scanner(System.in);
	        
	    System.out.println("Please enter a number between 1 and 4.");
	    String str_selection = in.nextLine();
	    
	    int int_selection = Integer.parseInt(str_selection);
	    
	    //the assignment doesn't say to add a way to end the program so it'll keep going until it's terminated.
	    while (loop = true) {
	    	if (int_selection == 1 || int_selection == 2 || int_selection == 3) {
		    	
		    	System.out.println("Thank you, please select another number.");
		    	
		    	str_selection = in.nextLine();
			    int_selection = Integer.parseInt(str_selection);
		    }
	    	
	    	if (int_selection ==4 ) {
	    		System.out.println("Error, please enter another number.");
	    		
	    		str_selection = in.nextLine();
	    	    int_selection = Integer.parseInt(str_selection);
	    	}
	    }
    }
	
}
