package beginner;

public class HelloWorld {

	public static void main(String[] args) {

		//1 	Output “Hello World!” to the console.
		System.out.println("Hello World!");

		//2 	Store “Hello World!” in a variable, then output it to the console.
		String myText = "Hello World!";
		System.out.println(myText);
		
		//3 	Create a method that accepts a String as a parameter, and then outputs it to the console.
		printMessage();

		//4 	Modify your method to return a String once called, which you then use to output to the screen.
		printMessage2("Hello World!");
	}
	
	public static void printMessage() { // question 3
		String message = "Hello World!";
	    System.out.println(message);;
	}
	
	public static void printMessage2(String message) { // question 4
		System.out.println(message);
	}

}
