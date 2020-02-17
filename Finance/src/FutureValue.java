//calculate future value of a single payment
import java.util.*;
public class FutureValue {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		double presentValue, futureValue, interestRate;
		int years;
		
		
		//Prompt a user to enter the future value		
		System.out.print("Present Value:$");
		presentValue = input.nextDouble();
		
		//Prompt a user to enter the interest rate
		System.out.print("Interest Rate %:");
		interestRate = input.nextDouble();
		
		//Prompt a user to enter the number of years
		System.out.print("Number of Years:");
		years = input.nextInt();
		
		//Calculate future value	
		futureValue=presentValue*(Math.pow((1+(interestRate/100)),years));
		
		//Covert present value into two decimal places
		futureValue=Math.round(futureValue*100.0)/100.0;
		
		
	        //Display output
		System.out.println("Future Value: $"+ futureValue);
		}

	}

