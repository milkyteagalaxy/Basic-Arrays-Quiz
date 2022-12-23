package quiz;
import java.util.Scanner;

public class Questions {
	
	Scanner scnr = new Scanner(System.in);
	Validity check = new Validity();
	Calculator points = new Calculator();

	public void start() {
		System.out.println("Welcome to the arrays quiz! Answer the following questions with a 1, 2, 3, or 4. Press enter to start.");
		check.userStart(scnr.nextLine());
	}
	
	public void question1(boolean[] answers) {
		System.out.println("Question 1: Which of these is a valid initialization of an array?");
		System.out.println("1. int a = new int[3]; \n2. double[] r = new double[6]; \n3. float[] r = new int[4]; \n4. new boolean a = array[2];");
		String answer1 = check.inputValidity(scnr.next());
		answers[0] = points.calculatePoints(answer1, 2);
	}
	
	public void question2(boolean[] answers) {
		System.out.println("Question 2: What is the highest-numbered index in the following array?");
		System.out.println("int[] a = new a[9];\n");
		System.out.println("1. 9 \n2. 8 \n3. 10 \n4. Cannot be determined");
		String answer2 = check.inputValidity(scnr.next());
		answers[1] = points.calculatePoints(answer2, 2);
	}

}