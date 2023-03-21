package mainstuff;

import java.util.Scanner;

public class HobbyWinner {

	public static void main(String[] args) {
		String str_answer;
		int int_answer = 0;
		
		Scanner in = new Scanner(System.in);
	    
		//Question 1
		System.out.println("Approximately what number is pi equal to? ");
		System.out.println("1. 3.14");
		System.out.println("2. 4.56");
		System.out.println("3. 3.28");
		System.out.println("4. 2.14");
		str_answer = in.nextLine();
		int_answer = Integer.parseInt(str_answer);
		
		while (int_answer != 1) {
			System.out.println("Incorrect. Please make another choice.");
			str_answer = in.nextLine();
			int_answer = Integer.parseInt(str_answer);
		}
		System.out.println("Correct!");
		
		//Question 2
		System.out.println("What is the capital city of British Coloumbia, Canada? ");
		System.out.println("1. Victoria");
		System.out.println("2. Kelowna");
		System.out.println("3. Vancouver");
		System.out.println("4. Coulbia");
		str_answer = in.nextLine();
		int_answer = Integer.parseInt(str_answer);
		
		while (int_answer != 1) {
			System.out.println("Incorrect. Please make another choice.");
			str_answer = in.nextLine();
			int_answer = Integer.parseInt(str_answer);
		}
		System.out.println("Correct!");
		
		//Question 3
		System.out.println("What are the axes of a 3D cartesian graph most commonly called? ");
		System.out.println("1. 1, 2, 3");
		System.out.println("2. A, B, C");
		System.out.println("3. X, Y, Z");
		System.out.println("4. L, W, H");
		str_answer = in.nextLine();
		int_answer = Integer.parseInt(str_answer);
		
		while (int_answer != 3) {
			System.out.println("Incorrect. Please make another choice.");
			str_answer = in.nextLine();
			int_answer = Integer.parseInt(str_answer);
		}
		System.out.println("Correct!");
		
		//Question 4
		System.out.println("What area of science covers the study of living organisms? ");
		System.out.println("1. Physics");
		System.out.println("2. Archeology");
		System.out.println("3. Chemistry");
		System.out.println("4. Biology");
		str_answer = in.nextLine();
		int_answer = Integer.parseInt(str_answer);
		
		while (int_answer != 4) {
			System.out.println("Incorrect. Please make another choice.");
			str_answer = in.nextLine();
			int_answer = Integer.parseInt(str_answer);
		}
		System.out.println("Correct!");
		
		//Question 5
		System.out.println("What is the name given to a screwdriver with a four pointed pattern? ");
		System.out.println("1. Flat head");
		System.out.println("2. Phillips head");
		System.out.println("3. Star head");
		System.out.println("4. Double-flat head");
		str_answer = in.nextLine();
		int_answer = Integer.parseInt(str_answer);
		
		while (int_answer != 2) {
			System.out.println("Incorrect. Please make another choice.");
			str_answer = in.nextLine();
			int_answer = Integer.parseInt(str_answer);
		}
		System.out.println("Correct!");
		
		System.out.println("You got them all right!");

	}

}
