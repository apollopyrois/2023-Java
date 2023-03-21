package mainstuff;

import java.util.Scanner;

public class PayCalculatorRange {

	public static void main(String[] args) {
		double hourlyPay;
		int hoursWorked;
		double grossPay;
		double netPay;
		
		double taxPercentage = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your hourly pay:  ");
        String str_hourlyPay = in.nextLine();
        hourlyPay = Integer.parseInt(str_hourlyPay);
        
        System.out.println("Please enter the amount of hours worked: ");
        String str_hoursWorked = in.nextLine();
        hoursWorked = Integer.parseInt(str_hoursWorked);
        
        in.close();
        
        grossPay  = hourlyPay * hoursWorked;
        
        if (grossPay <= 450) {
        	taxPercentage = 0.90; //10%
        }
        
        if (grossPay >= 450.01) {
        	taxPercentage = 0.88; //12%
        }
        
        if (grossPay >= 600.01) {
        	taxPercentage = 0.85; //15%
        }
        
        if (grossPay >= 1000.01) {
        	taxPercentage = 0.80; //20%
        }
        
        netPay = grossPay * taxPercentage;
        
        System.out.println("You have worked "+hoursWorked+" hours, and your pay rate is $"+hourlyPay+" per hour: ");
        System.out.println("Your gross pay is $"+grossPay+" the tax amount witheld is $"+(grossPay - netPay)+", therefore your net pay is $"+netPay+".");
        

	}

}