//possibly add going back function?, method for invalid input
//I want the user's input to be taken as a string so caculatePoints can print
//invalid input as a response if the input is somehow a letter instead of an
//integer without breaking the program but it isn't working...

import java.util.Scanner;

public class Main {
	static Scanner scnr = new Scanner(System.in);

	public static void userStart(String userInput) {
		while (userInput != "") {
			System.out.println("Invalid input, please try again.");
			userInput = scnr.nextLine();
		}
	}

	public static int inputValidity (int userInput){
		while (!(userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4)) {
			System.out.println("Invalid input, please try again.");
			userInput = scnr.nextInt();
		}
		return userInput;
	}

	public static boolean calculatePoints(int userInput, int correctAnswer) {
		if (userInput == correctAnswer) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Main userAnswer = new Main();
		boolean[] answers = new boolean[5];

		System.out.println("Welcome to the arrays quiz! Answer the following questions with a 1, 2, 3, or 4. Press enter to start.");
		userAnswer.userStart(scnr.nextLine());

		System.out.println("Question 1: Which of these is a valid initialization of an array?");
		System.out.println("1. int a = new int[3]; \n2. double[] r = new double[6]; \n3. float[] r = new int[4]; \n4. new boolean a = array[2];");
		int answer1 = userAnswer.inputValidity(scnr.nextInt());
		answers[0] = userAnswer.calculatePoints(answer1, 2);
		//System.out.print(answers[0]); test
	}

}
