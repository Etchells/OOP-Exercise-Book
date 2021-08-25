package beginner;

public class Conditionals {

	public static void main(String[] args) {

//		System.out.println(methodOne());
		System.out.println(methodTwo());

	}
	/*
	 * 1 Create a method which accepts 3 parameters, 2 integers and a Boolean, a. If
	 * the Boolean is true, the method will return a sum of the two numbers, and b.
	 * if it is false it will return the multiplication of the two numbers.
	 */

	public static int methodOne() {
		int num1 = 10;
		int num2 = 20;
		boolean addition = true;

		if (addition == true) {
			return num1 + num2;
		} else {
			return num1 * num2;
		}

	}

	/* 2 Modify your method from conditionals 1 to have another if statement that checks if one of the 
	 *  both the numbers are even. If this is true, return 0.
	 *  
	 *  INCORRECT!!!!!!!!!!! probably need to switch statements around
	 */  
	
	public static int methodTwo() {
		int num1 = 10;
		int num2 = 20;
		boolean addition = true;

		if (addition == true) {
			return num1 + num2;
		} else if ( addition == false) {
			return num1 * num2;
		} else if ( addition == true || addition == false && num1 == num1%2 || num2 == num2%2) {
			return 0;
		}
		return 0;

	}

}
