package chapter2;

/* Write a program that reads the subtotal and the gratuity rate, 
then computes the gratuity and total.*/

import java.util.Scanner;
public class Exercise02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner
		Scanner input=new Scanner(System.in);
		
		//Enter subtotal and the gratuity rate
		System.out.println("Enter the subtotal and a gratuity rate:");		
		double subtotal=input.nextDouble();
		double rate=input.nextDouble();
		
		//Calculate the gratuity and total
		double gratuity=subtotal*rate/100;
		double total=subtotal+gratuity;
		
		//display the result
		System.out.println("The gratuity is $"+ gratuity +" and total is $"+total);
		

	}

}

