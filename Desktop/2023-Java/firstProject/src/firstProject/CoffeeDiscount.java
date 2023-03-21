package firstProject;

import java.util.Scanner;

public class CoffeeDiscount {

	public static void main(String[] args) {
			
			double pricePerPound = 5.99;
			double tax = 0.15;
			Integer weightPerBag;
			Integer numberOfBags;
			double totalPrice;
			double discount = 0.00;
			double discountRemainder;
			double priceAfterDiscount;
		
		    Scanner in = new Scanner(System.in);
		    
		    System.out.println("Please enter the number of bags sold: ");
	        String str_numberOfBags = in.nextLine();
	        
	        numberOfBags = Integer.parseInt(str_numberOfBags);
	        
	        System.out.println("Please enter the weight of the bags sold in pounds: ");
	        String str_weightPerBag = in.nextLine();
	        
	        weightPerBag = Integer.parseInt(str_weightPerBag);
	        
	        if (numberOfBags >= 25) {
	        	discount = 0.05;
	        }
	        
	        if (numberOfBags > 49) {
	        	discount = 0.1;
	        }
	        
	        if (numberOfBags > 99) {
	        	discount = 0.15;
	        }
	        
	        if (numberOfBags > 149) {
	        	discount = 0.2;
	        }
	        
	        if (numberOfBags > 199) {
	        	discount = 0.25;
	        }
	        
	        if (numberOfBags > 299) {
	        	discount = 0.3;
	        }
	        
	        totalPrice = numberOfBags * weightPerBag * pricePerPound + ((numberOfBags*weightPerBag*pricePerPound) * tax);
	        
	        discountRemainder = totalPrice * discount;
	        
	        priceAfterDiscount = totalPrice - discountRemainder;
	        
	        System.out.println("Number of bags sold: "+ numberOfBags);
	        System.out.println("Weight per bag: "+ weightPerBag +" lb");
	        System.out.println("Price Per Pound: $"+ pricePerPound);
	        System.out.println("Sales Tax: "+ tax*100 + "%");
	        System.out.println("   -----------------------------------");
	        System.out.println("Total Price: $" + totalPrice);
	        System.out.println("Discount (" + discount*100 + "%): -$" + discountRemainder);
	        System.out.println("Amount to be charged: $"+priceAfterDiscount);
	        //couldn't get decimal formatting to work

	}

}
