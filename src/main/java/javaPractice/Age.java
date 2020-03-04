/**
 * 
 */
package javaPractice;

import java.util.Scanner;

/**
 *6.Take input of age of 3 people by user and determine oldest and youngest among them.
 *
 */
public class Age {
int age1, age2, age3;
	
	public void calc_old_young(int numb1, int numb2, int numb3) {
		age1 = numb1;
		age2 = numb2;
		age3 = numb3;
		
		System.out.println("Age1: " + age1);
		System.out.println("Age2: " + age2);
		System.out.println("Age3: " + age3);
		if (age1 > age2 && age1 > age3) {
			System.out.println("Your age is: " + age1 + " years is greater than " + age2 + " years " + "and " + age3 + " years");
			System.out.println("Age1 - You are the oldest, OLDIE!!!!!!!!");
		} else if (age2 > age1 && age2 > age3) {
			System.out.println("Your age is: " + age2 + " years is greater than " + age1 + " years " + "and " + age3 + " years");
			System.out.println("Age2 - You are the oldest, OLDIE!!!!!!!!");
		} else
			
		System.out.println("Age3 - You are the oldest, OLDIE!!!!!!!!");
	}
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter person 1 Age:");
		int num1 = s1.nextInt();
		System.out.println("Enter person 2 Age:");
		int num2 = s1.nextInt();
		System.out.println("Enter person 3 Age:");
		int num3 = s1.nextInt();
		Age ag1 = new Age();
		ag1.calc_old_young(num1, num2, num3);

	}

}
