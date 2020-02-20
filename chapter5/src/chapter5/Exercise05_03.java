/*(Conversion from kilograms to pounds) Write a program that displays the following table 
 * (note that 1 kilogram is 2.2 pounds):
 */


package chapter5;

public class Exercise05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kilograms=0;
		double pounds=0.0;
		
		System.out.println("Kilograms    Pounds");
	
		
		for (kilograms=1;kilograms<=199;kilograms+=2) {
			pounds=2.2*kilograms;
			
			System.out.printf("%5d     %4.1f\n", kilograms, pounds);
			
			
					
			
		}
		}
		

	}

