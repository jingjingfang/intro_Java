package chapter3;
import java.util.Scanner;

public class Exercise03_11 {

//Write a program that prompts the user to enter the month and year and displays the number of days in the month.

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			
			
			//Prompt the user to enter a month		
			System.out.println("Enter a month in the year (e.g., 1 for Jan):");
			
			//extract data from keyboard;
			int month=input.nextInt();		
						
					
			//Prompt the user to enter a year
			System.out.println("Enter a year:");
			
			//extract data from keyboard
			int year=input.nextInt();
			
			// Check if the year is a leap year 
			  boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		 
			// Display the result  
			switch(month){
				case 1: System.out.println("January " + year +" has 31 days");break;
				case 2: System.out.println("February " + year + " has "+ ((isLeapYear)? "29 days":"28 days"));break;
				case 3: System.out.println("March " + year +" has 31 days");break;
				case 4: System.out.println("April " + year +" has 30 days");break;
				case 5: System.out.println("May " + year +" has 31 days");break;
				case 6: System.out.println("June " + year +" has 30 days");break;
				case 7: System.out.println("July " + year +" has 31 days");break;
				case 8: System.out.println("August " + year +" has 31 days");break;
				case 9: System.out.println("September " + year +" has 30 days");break;
				case 10: System.out.println("Octorber " + year +" has 31 days");break;
				case 11: System.out.println("November " + year +" has 30 days");break;
				case 12: System.out.println("December " + year +" has 31 days");break;
					
				} 

			
		}

	}
