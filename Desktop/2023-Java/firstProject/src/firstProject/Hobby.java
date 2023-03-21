package firstProject;

import java.util.Scanner;

public class Hobby {

	public static void main(String[] args) {
		String str_answer;
		int int_answer;
		int correctCounter = 0;
		int incorrectCounter = 0;
		
		
		Scanner in = new Scanner(System.in);
	    
		//Question 1
		System.out.println("Approximately what number is pi equal to? ");
		System.out.println("1. 3.14");
		System.out.println("2. 4.56");
		System.out.println("3. 3.28");
		System.out.println("4. 2.14");
		str_answer = in.nextLine();
		
		int_answer = Integer.parseInt(str_answer);
		
		if (int_answer == 1) {
			System.out.println("Correct!");
			correctCounter += 1;
		}
		else {
			System.out.println("Incorrect.");
			incorrectCounter += 1;
		}
		
		//Question 2
		System.out.println("What is the capital city of British Coloumbia, Canada? ");
		System.out.println("1. Victoria");
		System.out.println("2. Kelowna");
		System.out.println("3. Vancouver");
		System.out.println("4. Coulbia");
		str_answer = in.nextLine();
		
		int_answer = Integer.parseInt(str_answer);
		
		if (int_answer == 1) {
			System.out.println("Correct!");
			correctCounter += 1;
		}
		else {
			System.out.println("Incorrect.");
			incorrectCounter += 1;
		}
		
		//Question 3
		System.out.println("What are the axes of a 3D cartesian graph most commonly called? ");
		System.out.println("1. 1, 2, 3");
		System.out.println("2. A, B, C");
		System.out.println("3. X, Y, Z");
		System.out.println("4. L, W, H");
		str_answer = in.nextLine();
		
		int_answer = Integer.parseInt(str_answer);
		
		if (int_answer == 3) {
			System.out.println("Correct!");
			correctCounter += 1;
		}
		else {
			System.out.println("Incorrect.");
			incorrectCounter += 1;
		}
		
		//Question 4
		System.out.println("What area of science covers the study of living organisms? ");
		System.out.println("1. Physics");
		System.out.println("2. Archeology");
		System.out.println("3. Chemistry");
		System.out.println("4. Biology");
		str_answer = in.nextLine();
		
		int_answer = Integer.parseInt(str_answer);
		
		if (int_answer == 4) {
			System.out.println("Correct!");
			correctCounter += 1;
		}
		else {
			System.out.println("Incorrect.");
			incorrectCounter += 1;
		}
		
		//Question 5
		System.out.println("What is the name given to a screwdriver with a four pointed pattern? ");
		System.out.println("1. Flat head");
		System.out.println("2. Phillips head");
		System.out.println("3. Star head");
		System.out.println("4. Double-flat head");
		str_answer = in.nextLine();
		
		int_answer = Integer.parseInt(str_answer);
		
		if (int_answer == 2) {
			System.out.println("Correct!");
			correctCounter += 1;
		}
		else {
			System.out.println("Incorrect.");
			incorrectCounter += 1;
		}
		
		int correctPercentage = Math.round((correctCounter / 5) * 100);
		
		System.out.println("You got "+correctCounter+" correct and "+incorrectCounter+" wrong. Your percentage of questions right is: "+correctPercentage+"%.");

	}

}
