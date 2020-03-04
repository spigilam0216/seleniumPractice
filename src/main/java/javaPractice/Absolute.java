/**
 * 
 */
package javaPractice;

import java.util.Scanner;

/**
 * @author srini
 *
 */
public class Absolute {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num1 = s1.nextInt();
		int absValue = Math.abs(num1);
		System.out.println("Absolute Value of " + num1 + " is " + absValue);
	}

}
