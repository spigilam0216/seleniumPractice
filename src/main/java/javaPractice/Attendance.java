/**
 * 
 */
package javaPractice;

import java.util.Scanner;

/**
 * 8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
 *
 */
public class Attendance {
double no_of_classes_held;
double no_of_classes_attended;
double percentage_of_classes_attended;
double percentage_cut_off = 75.0;
String medical_cause;

public void calc_percentage(double held, double attended, String val) {
	no_of_classes_held = held;
	no_of_classes_attended = attended;
	medical_cause = val;
	System.out.println(no_of_classes_held);
	System.out.println(no_of_classes_attended);
	percentage_of_classes_attended = (no_of_classes_attended / no_of_classes_held) * 100;
	System.out.println("Attendance: " + percentage_of_classes_attended);
	
	if (percentage_of_classes_attended < percentage_cut_off && medical_cause != "Y") {
		System.out.println("Shortage of attendance, you are not allowed to sit in exam");
	} else
		System.out.println("You have attendance required, you can sit in exam");
}
	
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Number of Classes Held:");
		double num1 = s1.nextDouble();
		System.out.println("Enter Number of Classes Attended:");
		double num2 = s1.nextDouble();
		System.out.println("Do you have a medical cause: Y/N");
		String medical = s1.next();
		System.out.println("Medical value: " + medical);
		Attendance att = new Attendance();
		att.calc_percentage(num1, num2, medical);
		

	}

}
