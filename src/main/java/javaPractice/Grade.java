/**
 * 
 */
package javaPractice;

import java.util.Scanner;

/**A school has following rules for grading system:
*a. Below 25 - F
*b. 25 to 45 - E
*c. 45 to 50 - D
*d. 50 to 60 - C
*e. 60 to 80 - B
*f. Above 80 - A
*Ask user to enter marks and print the corresponding grade
 */

public class Grade {
int marks;

public void calc_grade(int marks) {
	this.marks = marks;
	
	if (marks < 25) {
		System.out.println("Your Grade is: F");
	} else if (marks >= 25 && marks <= 45){
		System.out.println("Your Grade is: E");
	} else if (marks >= 45 && marks <= 50) {
		System.out.println("Your Grade is: D");
	} else if (marks >= 50 && marks <= 60) {
		System.out.println("Your Grade is: C");
	} else if (marks >= 60 && marks <= 80) {
		System.out.println("Your Grade is: B");
	} else
		System.out.println("Your Grade is: A");
}
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your marks:");
		int num1 = s1.nextInt();
		Grade grd1 = new Grade();
		grd1.calc_grade(num1);

	}

}
