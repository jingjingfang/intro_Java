package chapter4;

/*Write a program that prompts the user to enter an int between 0 and 15 and displays 
its corresponding hex number.
For an incorrect input number, display invalid input.*/
import java.util.Scanner;
public class Exercise04_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
	Scanner input=new Scanner(System.in);
	
	//Prompt a user to enter a integer between 0 and 15
	System.out.println("Enter a decimal value (0 and 15):");
	int i=input.nextInt();
	
	
		
	// Display decimal value for the hex digit
		  
	  if (i <= 15 && i >= 10) {		
		
		String hexString=Integer.toHexString(i);
		System.out.println("The hex value is " + hexString.toUpperCase());
		  
		 
	  }
	 		  
	  else if (i<=9 && i>=0) {
		 System.out.println("The hex value is  " +i);
   }
	  else {
	    System.out.println(i + " is an invalid input");
	  }
	}
}

