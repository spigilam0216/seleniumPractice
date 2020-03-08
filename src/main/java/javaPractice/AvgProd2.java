/**
 * 
 */
package javaPractice;

import java.util.Scanner;

public class AvgProd2 {
static int num1;
static int counter;


	
	public static void main(String args[]) {
		Scanner s1 = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			System.out.println("Enter Integer:");
			num1 += s1.nextInt();
			
			System.out.println("Do you want to quit: q");
			String str1= s1.nextLine();
			
			if(str1.equalsIgnoreCase("q")) {
				break;
			}
			counter++;
			//System.out.println("Numbers ADD: " + num1);
			//System.out.println("Counter: " + counter);
			int average = num1/counter;
			
			
			//System.out.println("Average: " + average);
			
		}
		
	}

}
