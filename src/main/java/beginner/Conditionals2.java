package beginner;

public class Conditionals2 {

	public static void main(String[] args) {

		int a = 250;
		
		if ( a > 2000) {
			System.out.println("A");
		}else if ( a > 2000 && a > 6000) {
			System.out.println("C");
		}else if ( a > 2000 && a < 6000) {
			System.out.println("B");
		}else if ( a > 2000 && a < 6000 && a > 4000) {
			System.out.println("D");
		}else if ( a > 2000 && a < 6000 && a < 4000) {
			System.out.println("E");
		}else if ( a < 2000) {
			System.out.println("1");
		}else if ( a < 2000 && a < 100) {
			System.out.println("2");
		}else if ( a < 2000 && a > 100) {
			System.out.println("3");
		}else if ( a < 2000 && a > 100 && a < 600) {
			System.out.println("4");
		}else if ( a < 2000 && a > 100 && a > 600) {
			System.out.println("5");
		}else if ( a < 2000 && a > 100 && a < 600 && a > 500) {
			System.out.println("6");
		}else if ( a < 2000 && a > 100 && a < 600 && a < 500) {
			System.out.println("7");
		}
		
	}

}
