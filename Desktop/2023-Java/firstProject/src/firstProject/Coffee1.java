package firstProject;

import java.util.Scanner;

public class Coffee1 {

	public static void main(String[] args) {
			
			double pricePerPound = 5.99;
			double tax = 0.15;
			Integer weightPerBag;
			Integer numberOfBags;
			double totalPrice;
		
		    Scanner in = new Scanner(System.in);
		    
		    System.out.println("Please enter the number of bags sold: ");
	        String str_numberOfBags = in.nextLine();
	        
	        numberOfBags = Integer.parseInt(str_numberOfBags);
	        
	        System.out.println("Please enter the weight of the bags sold in pounds: ");
	        String str_weightPerBag = in.nextLine();
	        
	        weightPerBag = Integer.parseInt(str_weightPerBag);
	        
	        totalPrice = numberOfBags * weightPerBag * pricePerPound + ((numberOfBags*weightPerBag*pricePerPound) * tax);
	        
	        System.out.println("Number of bags sold: "+ numberOfBags);
	        System.out.println("Weight per bag: "+ weightPerBag +" lb");
	        System.out.println("Price Per Pound: $"+ pricePerPound);
	        System.out.println("Sales Tax: "+ tax*100 + "%");
	        System.out.println("   -----------------------------------");
	        System.out.println("Total Price: $" + totalPrice);
	        //couldn't get decimal formatting to work

	}

}
