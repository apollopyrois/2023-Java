package firstProject;

import java.util.Scanner;

public class StreamingAddon
{
    public static void main(String[] args) {
        double adSupportedPrice = 9.99;
        double basicPrice = 16.99;
        double standardPrice = 24.99;
        double addonPrice = 7.99;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter the number of the package you would like to purchase: 1. Ad-supported 2. Basic 3. Standard ");
        String str_selection = in.nextLine();
        
        int int_selection = Integer.parseInt(str_selection);
        
        if (int_selection == 1) {
            System.out.println("You have selected the Ad-Supported package for $" + adSupportedPrice);
            System.out.println("Would you like an add-on to allow you to access from outside your household for $7.99? 1. Yes  2. No");
            String str_addonSelection = in.nextLine();
            int int_addonSelection = Integer.parseInt(str_addonSelection);
            if (int_addonSelection == 1) {
                System.out.println("You have purchased the Add-on, your total is now $" + Math.round((adSupportedPrice + addonPrice) * 100) / 100.0);
            }
            if (int_addonSelection == 2) {
                System.out.println("Your total is now $" + adSupportedPrice);
            }
        }
        
        if (int_selection == 2) {
            System.out.println("You have selected the Basic package for $" + basicPrice);
            System.out.println("Would you like an add-on to allow you to access from outside your household for $7.99? 1. Yes  2. No");
            String str_addonSelection = in.nextLine();
            int int_addonSelection = Integer.parseInt(str_addonSelection);
            if (int_addonSelection == 1) {
                System.out.println("You have purchased the Add-on, your total is now $" + Math.round((basicPrice + addonPrice) * 100) / 100.0);
            }
            if (int_addonSelection == 2) {
                System.out.println("Your total is now $" + basicPrice);
            }
        }
        
        if (int_selection == 3) {
            System.out.println("You have selected the Standard package for $" + standardPrice);
            System.out.println("Would you like an add-on to allow you to access from outside your household for $7.99? 1. Yes  2. No");
            String str_addonSelection = in.nextLine();
            int int_addonSelection = Integer.parseInt(str_addonSelection);
            if (int_addonSelection == 1) {
                System.out.println("You have purchased the Add-on, your total is now $" + Math.round((standardPrice + addonPrice) * 100) / 100.0);
            }
            if (int_addonSelection == 2) {
                System.out.println("Your total is now $" + standardPrice);
            }
        }
        if (int_selection != 1 && int_selection != 2 && int_selection != 3) {
            System.out.println("Error, please select a valid package number.");
        }
        
    }
}
