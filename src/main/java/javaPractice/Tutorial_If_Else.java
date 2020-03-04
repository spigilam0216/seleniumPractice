/**
 * 
 */
package javaPractice;

import java.util.Scanner;

/** 1.	Take values of length and breadth of a rectangle 
* from user and check if it is square or not.
*   2.	Take two int values from user and print greatest among them.
*/
public class Tutorial_If_Else {
	int length;
	int breadth;
	int number1;
	int number2;

	public void check_If_Else(int lngt, int brdt) {
		this.length = lngt;
		this.breadth = brdt;
		
		if (length == breadth)
				{
			System.out.println("Length is: " + length + " and Breadth is :" + breadth + " both are Equal, so its Square");
				}
		else
			System.out.println("Length is :" + length + " and Breadth is: " + breadth + " both are NOT Equal, so its NOT a Square");	
		
	}
	
	public void compare_Numbers(int num1, int num2) {
		this.number1 = num1;
		this.number2 = num2;
		
		if (number1 > number2) 
		{
			System.out.println("Number " + number1 + " is greater than Number " + number2);
			System.out.println("The greatest Number is: " + number1);
		} else {
			System.out.println("Number " + num2 + " is greater than Number " + num1);
			System.out.println("The greatest Number is: " + number2);
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 = scan.nextInt();
		System.out.println("Enter another number:");
		int num2 = scan.nextInt();
		
		Tutorial_If_Else obj1 = new Tutorial_If_Else();
		//Check if it is a Square or not
		obj1.check_If_Else(num1, num2);
		System.out.println("*********************************************************************************");
		// compare numbers
		obj1.compare_Numbers(num1, num2);
	}
}

