package beginner;

public class UniqueSum {

	public static void main(String[] args) {

		System.out.println(uniqueSum(1, 1, 2));
	}

	/* Given 3 integer values, return their sum. If one value is the same as another value, 
	 * they do not count towards the sum. In other words, only return the sum of unique numbers given. 
	 */
	public static int uniqueSum(int num1, int num2, int num3) {
		if ( num1 != num2 && num1 != num3 ) {
			return num1 + num2 + num3;
		}else if ( num1 == num2 && num2 == num1) {
			return num3;
		}else if ( num2 == num3 && num3 == num2) {
			return num1;
		}else if ( num1 == num3 && num3 == num1) {
			return num2;
		}
		return 0;
	}
}
