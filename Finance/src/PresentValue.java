//Calculate present value for a single payment
import java.util.*;
public class PresentValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		double futureValue, interestRate, presentValue;
		int years;
		
    //Prompt a user to enter the future value		
	System.out.print("Future Value:$");
	futureValue = input.nextDouble();
	
	//Prompt a user to enter the interest rate
	System.out.print("Interest Rate %:");
	interestRate = input.nextDouble();
	
	//Prompt a user to enter the number of years
	System.out.print("Number of Years:");
	years = input.nextInt();
	
	//Calculate present value	
	presentValue=futureValue*(1/Math.pow((1+(interestRate/100)),years));
	
	//Covert present value into two decimal places
	presentValue=Math.round(presentValue*100.0)/100.0;
	
    //Display output
	System.out.println("Present Value: $"+ presentValue);
	}

}





