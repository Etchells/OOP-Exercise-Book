package beginner;

public class Taxes {

	public static void main(String[] args) {

		/* 1 	Create the tax class, it contains 2 methods. 
		 * a.	Method 1 -  which takes a salary and works out the percentage by which the salary will be taxed.
		 * b.	Method 2 - which works out the exact amount that the user will be taxed using a similar process to that in the first method. This amount should be returned and output to the console.
		 */
		
		/* 2 	The Salaries are taxed as below:
		 * a.	0 – 14999: 0% Tax
		 * b.	15000 – 19999: 10% Tax
		 * c.	20000-29999: 15% Tax
		 * d.	30000-44999: 20% Tax
		 * e.	45000+: 25%: Tax
		 */
//		System.out.println(salaryPercentageCalculation(20000));
		System.out.println("The amount of tax you will pay is: "+salaryAndMyTax(20000));


	}
	public static double salaryPercentageCalculation(double salary) {
		if (salary < 15000) {
			return 0.00;
		}else if (salary >= 15000 && salary < 20000) {
			return 0.10;
		}else if (salary >= 20000 && salary < 30000) {
			return 0.15;
		}else if (salary >= 30000 && salary < 45000) {
			return 0.20;
		}else if (salary >= 45000) {
			return 0.25;
		}
		return 0;
	}
	
	public static double salaryAndMyTax(double salary) {
		if (salary < 15000) {
			return 0.00;
		}else if (salary >= 15000 && salary < 20000) {
			return salary * 0.10;
		}else if (salary >= 20000 && salary < 30000) {
			return salary * 0.15;
		}else if (salary >= 30000 && salary < 45000) {
			return salary * 0.20;
		}else if (salary >= 45000) {
			return salary * 0.25;
		}
		return 0;
		
	}
	
	//3 Finally combine the 2 methods so that the second method utilizes the first method to return the correct result.
}
