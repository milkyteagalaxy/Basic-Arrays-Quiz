package quiz;

import java.util.Scanner;

public class Validity {

	Scanner scnr = new Scanner(System.in);
	
	public void userStart(String userInput) { //only purpose is to start quiz after first line
		while (userInput != "") {
			System.out.println("Invalid input, please try again.");
			userInput = scnr.nextLine();
		}
	}	

	protected String inputValidity (String userInput) { //receives input and checks if it is a number from 1-4
		while (!(userInput.equals("1") || userInput.equals("2") || userInput.equals("3") || userInput.equals("4"))) {
			System.out.println("Invalid input, please try again.");
			userInput = scnr.next();
		}
		return userInput;
	}

}