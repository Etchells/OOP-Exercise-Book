package beginner;

public class Maths {

	// 1 Create a method that accepts two integers as an input, then returns the
	// integer that is the sum of these two parameters.

	public static double addition(double num1, double num2) {
		return num1 + num2;
	}

	/*
	 * 2 Create the following additional 3 methods that each take 2 parameters: 
	 * 	a. Multiplication – which takes 2 numbers and returns the product.
	 * 	b. Subtraction – which takes 2 numbers, then returns the result of subtraction.
	 * 	c. Division – which takes 2 numbers and returns the result of division.
	 */

	public static double Multiplication(double num1, double num2) {
		return num1 * num2;
	}

	public static double Subtraction(double num1, double num2) {
		return num1 - num2;
	}
	/*
	 * 3 With the Division method, the sum should only execute if the first parameter is smaller than the second, 
	 * 	otherwise it prints out a message saying that the division cannot be performed.
	 */
	
	public static double Division(double num1, double num2) {
		if (num2 > num1) {
			System.out.println("The division cannot be performed");
		}
			
		
		return num1 / num2;
	}

	public static void main(String[] args) {
		double num1 = 10;
		double num2 = 50;
		
		System.out.println(addition(num1, num2));
		System.out.println(Multiplication(num1, num2));
		System.out.println(Subtraction(num1, num2));
		System.out.println(Division(num1, num2));
	}
}
