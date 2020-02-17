package chapter3;
/*Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week.
Write a program to calculate the day of the week.*/ 

import java.util.*;
public class Exercise03_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);					
		
		//Prompt users to enter input
		System.out.println("Enter year: (e.g., 2012):");
		
		//Extra data from input
		int year=input.nextInt();
		
		//Prompt users to enter input
		System.out.println("Enter month: 1-12");
		
		//Extra data from input
		int month=input.nextInt();
		
		/*January and February are counted as 13 and 14 in the formula, 
		 so convert the user input 1 to 13 and 2 to 14 for the month 
		 and change the year to the previous year.*/
		
		if (month == 1) {
				month = 13;
			    year-=1; 
           	}
				else if (month == 2) {
				month = 14;
				year -=1; 
				
			}
		
		   
		
		//Prompt users to enter input
		System.out.println("Enter the day of the month: 1-31:");
		//Extra data from input
		int day=input.nextInt();		
		
		//calculate century & yearOfCentury
		int century=year/100;
		int yearOfCentury=year%100;
		
			
		  			  
		//Calculate the day of the week		
		int date = (day + 26*(month+1)/10 + yearOfCentury+ yearOfCentury/4+ century/4 + 5*century) % 7;
		
				
		//Display the output
		System.out.print("Day of the week is ");
				 
		 switch(date){
		    case 0: System.out.println("Saturday"); break;
			case 1: System.out.println("Sunday"); break;
			case 2: System.out.println("Monday"); break;
			case 3: System.out.println("Tuesday"); break;
			case 4: System.out.println("Wednesday"); break;
			case 5: System.out.println("Thursday"); break;
			case 6: System.out.println("Friday");break;
			
	}

	}
}
