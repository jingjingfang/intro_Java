//calculate future value of an annuity
import java.util.*; 

public class FV {

	public static void main(String[] args) {
	
	
		Scanner input = new Scanner(System.in);
	//declare variables
		double rate, pmt, pv,fv;
		int n;
		
		
	// prompt a user to enter present value
		
		System.out.println("Present Value:");
		pv=input.nextDouble();
		
	// prompt a user to enter interest rate
		
		System.out.println("Interest rate %:");
		rate=input.nextDouble();
		
		
	//prompt a uer to enter the number of payments
				System.out.println("Number of payments");
				n=input.nextInt();
				
	//prompt a user to enter annuity payment
		
		System.out.println("Annuity Payment:$");
		pmt=input.nextDouble();
		
			
	// if payments come at the beginning of each period
		System.out.println("Are the payments come at the beginning of each period? true or false");
		boolean beginning = input.nextBoolean();
		
		if (beginning) {
			
			//Calculate future value
			fv=pmt*(((Math.pow((1+rate/100),n+1)-1)/(rate/100))-1);
			   
		}
		
		
		//if payments come at the end of each period
		else {
	
		//Calculate future value
		   fv=pmt*((Math.pow((1+rate/100),n)-1)/(rate/100));
		   
		}
		   
	   
	 //display result
	   System.out.println("Future Value:$" + String.format("%.2f", fv));
     
		
	}

}
