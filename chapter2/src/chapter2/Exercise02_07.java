package chapter2;

/*Write a program that prompts the user to enter the minutes (e.g., 1 billion), 
and displays the number of years and days for the minutes.*/
import java.util.Scanner;

public class Exercise02_07 {

	public static void main(String[] args) {
		
		//Create a Scanner
		 Scanner input = new Scanner(System.in);
	       
		 //Enter the number of minutes
		 System.out.println("Enter the number of minutes: ");
	     long minutes=input.nextLong();
	       
	     //Calculate years and days
	     long numberOfDays=minutes/(24*60);
	     long numberOfYears=numberOfDays/365;
	     long remainingDays=numberOfDays%365;
	     
	     //Display the result
	     System.out.println (minutes +" minutes is approximately " + numberOfYears +" years and " + remainingDays+" days");
	}

}


