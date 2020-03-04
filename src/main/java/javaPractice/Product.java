package javaPractice;

import java.util.Scanner;

/** 3.	A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
*Ask user for quantity
*Suppose, one unit will cost 100.
*Judge and print total cost for user.
*/
public class Product {
	int quantity;
	double total_cost;
	double discount = 0.1;
	int unit_cost = 100;
	
	
	public void calculate(int qty) {
		quantity = qty;
		total_cost = quantity * unit_cost;
		if (quantity > 1000) {
			total_cost = total_cost - (discount*total_cost);
			System.out.println("Quantity " + quantity + " is greater than 1000 ");
			
		    }
		System.out.println("Total Cost is: $" + total_cost);
		
	    }
	

	public static void main(String[] args) {
		Product p1 = new Product();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Quantity:");
		int num1 = s1.nextInt();
		p1.calculate(num1);
		
	}

}
