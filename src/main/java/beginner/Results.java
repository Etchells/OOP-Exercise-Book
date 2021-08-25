package beginner;


public class Results {

	/*
	 * A person takes 3 exams in college, Physics, Chemistry and Biology, each exam
	 * can have a maximum of 150 marks. When all the exam marks have been added
	 * together, we can find the overall percentage that the person has got by
	 * multiplying their score by 100 and then dividing by 450.
	 * 
	 * 1 Create the results class, this class has 5 variables, Physics, Chemistry
	 * and Biology, total and percentage. This class should also have 2 methods: a.
	 * Method 1 - displays the results that the person got for each exam and then
	 * the total mark. Try to make the output neat and bespoke for each exam. b.
	 * Method 2 - which finds and displays the percentage that the person received
	 * for the exams overall.
	 */
	public static void main(String[] args) {

//		methodOne();
//		methodTwo();
//		methodThree();
//		methodFour();
		methodFive();
	}

	public static void methodOne() {
		int physics = 20;
		int chemistry = 50;
		int biology = 100;
		int total = physics + chemistry + biology;
		System.out.println(
				"Your Results: Physics " + physics + ", Chemistry " + chemistry + ", Biology " + biology + ".");
		System.out.println("Total Score: " + total + ".");
	}

	public static void methodTwo() {
		int physics = 20;
		int chemistry = 50;
		int biology = 100;
		int total = physics + chemistry + biology;
		double percentage = (total * 100) / 450;
		System.out.println("Your Results: Physics " + physics + ", Chemistry " + chemistry + ", Biology " + biology + ".");
		System.out.println("Total Score: " + total + ".");
		System.out.println("Percentage: " + percentage + "%.");
	}

	/*
	 * 2 Expand the Results project, there is now a pass rate of 60% for the overall
	 * result; if the person receives under 60%, they get a fail message.
	 */

	public static void methodThree() {
		int physics = 100;
		int chemistry = 150;
		int biology = 100;
		int total = physics + chemistry + biology;
		double percentage = (total * 100) / 450;

		System.out.println("Your Results: Physics " + physics + ", Chemistry " + chemistry + ", Biology " + biology + ".");
		System.out.println("Total Score: " + total + ".");
		System.out.println("Percentage: " + percentage + "%.");
		
		if (percentage >= 60) {
			System.out.println("Pass! Congratulations");
		} else {
			System.out.println("Fail! You are under the 60% required to pass.");
		}
	}
	
	/*
	 * 3 	Expand the previous example so that even if the person gets higher than 60% overall, 
	 * 		if they fail 1 or more of the exams (pass grade of 60% for each exam) they still fail overall.
	 */

	public static void methodFour() {
		int physics = 10;
		double physicsPercentage = (physics * 100) / 150;
		int chemistry = 150;
		double chemistryPercentage = (chemistry * 100) / 150;
		int biology = 100;
		double biologyPercentage = (biology * 100) / 150;
		int total = physics + chemistry + biology;
		double percentage = (total * 100) / 450;
		
		System.out.println("Your Results are as follows");
		System.out.println("Physics: " + physics + " -- " + physicsPercentage + "%");
		System.out.println("Chemistry: " + chemistry + " -- " + chemistryPercentage + "%");
		System.out.println("Biology: " + biology + " -- " + biologyPercentage + "%");
		System.out.println("Total: " + total + " -- " + percentage + "%");
		
		if (physicsPercentage <= 60 || chemistryPercentage <= 60 || biologyPercentage <= 60) {
			System.out.println("FAILED! One or more of your exams did not meet the required 60% pass mark");
		} else {
			System.out.println("PASSED! Congratulations");
		}
	}
	
	/*
	 * 4 	Expand the above so that the message that is displayed varies 
	 * 		depending on the number of subjects that they have failed.
	 */
	
	public static void methodFive() {
		int physics = 10;
		double physicsPercentage = (physics * 100) / 150;
		int chemistry = 150;
		double chemistryPercentage = (chemistry * 100) / 150;
		int biology = 100;
		double biologyPercentage = (biology * 100) / 150;
		int total = physics + chemistry + biology;
		double percentage = (total * 100) / 450;
		
		System.out.println("Your Results are as follows");
		
		if (physicsPercentage >= 60) {
			System.out.println("Physics: " + physics + " -- " + physicsPercentage + "% -- PASSED");
		}else {
			System.out.println("Physics: " + physics + " -- " + physicsPercentage + "% -- FAILED");
		}
		if (chemistryPercentage >= 60) {
			System.out.println("Chemistry: " + chemistry + " -- " + chemistryPercentage + "% -- PASSED");
		}else {
			System.out.println("Chemistry: " + chemistry + " -- " + chemistryPercentage + "% -- FAILED");
		}
		if (biologyPercentage >= 60) {
			System.out.println("Biology: " + biology + " -- " + biologyPercentage + "% -- PASSED");
		}else {
			System.out.println("Biology: " + biology + " -- " + biologyPercentage + "% -- FAILED");
		}
		
		System.out.println("Total: " + total + " -- " + percentage + "%");
		
		if (physicsPercentage <= 60 || chemistryPercentage <= 60 || biologyPercentage <= 60) {
			System.out.println("FAILED! One or more of your exams did not meet the required 60% pass mark");
		} else {
			System.out.println("PASSED! Congratulations");
		}
	}
}
