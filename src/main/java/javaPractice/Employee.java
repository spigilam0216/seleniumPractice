package javaPractice;

import java.util.Scanner;
/**
*4.  A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
*Ask user for their salary and year of service and print the net bonus amount.
*/

public class Employee {
	double bonus = 0.05;
	double salary;
	int years_of_services;
	
	public void calc_bonus(int years, double sal) {
		 years_of_services = years;
		 salary = sal;
		 
		 if ( years_of_services > 5) {
			 System.out.println("You net bonus amount is : $" + (bonus*salary));
			 
		 } else
			 System.out.println("You don't have enough years of service to qualify for Bonus");
	}

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Number of Years in Service:");
		int num1 = s1.nextInt();
		System.out.println("Enter your Salary:");
		double num2 = s1.nextDouble();
		Employee emp1 = new Employee();
		emp1.calc_bonus(num1, num2);

	}

}
