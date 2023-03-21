package firstProject;

import java.util.Scanner;

public class Streaming
{
    public static void main(final String[] args) {
        double adSupportedPrice = 9.99;
        double basicPrice = 16.99;
        double standardPrice = 24.99;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter the number of the package you would like to purchase: 1. Ad-supported 2. Basic 3. Standard ");
        String str_selection = in.nextLine();
        
        int int_selection = Integer.parseInt(str_selection);
        
        if (int_selection == 1) {
            System.out.println("You have select the Ad-Supported package for $" + adSupportedPrice);
        }
        
        if (int_selection == 2) {
            System.out.println("You have select the Basic package for $" + basicPrice);
        }
        
        if (int_selection == 3) {
            System.out.println("You have select the Standard package for $" + standardPrice);
        }
        
        if (int_selection != 1 && int_selection != 2 && int_selection != 3) {
            System.out.println("Error, please select a valid package number.");
        }
        
    }
}