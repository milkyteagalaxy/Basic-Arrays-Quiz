package quiz;

public class Calculator {

	public boolean calculatePoints(String userInput, int correctAnswer) { //correct answers are assigned true, incorrect answers assigned with false
		if (Integer.parseInt(userInput) == correctAnswer) {
			return true;
		}
		else {
			return false;
		}
	}

}