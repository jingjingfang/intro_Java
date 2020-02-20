/*Conversion from kilograms to pounds and pounds to kilograms) Write a program that displays 
  the following two tables side by side:
  
  Kilograms  Pounds  |      Pounds      Kilograms
1             2.2    |      20               9.09
3             6.6    |      25              11.36
...
197         433.4    |      510            231.82
199         437.8    |      515            234.09

 */

package chapter5;
import java.util.*;

public class Exercise05_05 {

	public static void main(String[] args) {
		System.out.println("Kilograms  Pound  | Pounds  Kilograms");
		
		int i, j;
		for (i=1, j=20; i<=199; i+=2,j+=5) {
			System.out.printf("%-5d    %5.1f    | %5d   %6.2f\n", i, i*2.2,j,j/2.2);
			
		}

	}

}
