//todo: going back function, free response question, check what user got wrong, ask to try again (if no, exit)

package quiz;

public class Main {
	
	public static void main(String[] args) {
		boolean[] answers = new boolean[5];

		Questions user = new Questions();

		user.start();
		user.question1(answers);
		user.question2(answers);
		
		//test
		//System.out.print(answers[0]); 
		//System.out.print(answers[1]);
	}

}
