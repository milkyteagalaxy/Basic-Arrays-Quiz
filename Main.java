//possibly add going back function?

import java.util.Scanner;

public class Main {
	static Scanner scnr = new Scanner(System.in);

	public static void userStart(String userInput) { //only purpose is to start quiz after first line
		while (userInput != "") {
			System.out.println("Invalid input, please try again.");
			userInput = scnr.nextLine();
		}
	}

	public static String inputValidity (String userInput) { //receives input and checks if it is a number from 1-4
		while (!(userInput.equals("1") || userInput.equals("2") || userInput.equals("3") || userInput.equals("4"))) {
			System.out.println("Invalid input, please try again.");
			userInput = scnr.next();
		}
		return userInput;
	}

	public static boolean calculatePoints(String userInput, int correctAnswer) { //correct answers are assigned true, incorrect answers assigned with false
		if (Integer.parseInt(userInput) == correctAnswer) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		boolean[] answers = new boolean[5];

		System.out.println("Welcome to the arrays quiz! Answer the following questions with a 1, 2, 3, or 4. Press enter to start.");
		userStart(scnr.nextLine());

		System.out.println("Question 1: Which of these is a valid initialization of an array?");
		System.out.println("1. int a = new int[3]; \n2. double[] r = new double[6]; \n3. float[] r = new int[4]; \n4. new boolean a = array[2];");
		String answer1 = inputValidity(scnr.next());
		answers[0] = calculatePoints(answer1, 2);
		//System.out.print(answers[0]); test

		System.out.println("Question 2: What is the highest-numbered index in the following array?");
		System.out.println("int[] a = new a[9];\n");
		System.out.println("1. 9 \n2. 8 \n3. 10 \n4. Cannot be determined");
	}

}
