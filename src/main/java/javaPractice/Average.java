package javaPractice;

import java.util.Scanner;

public class Average {
	int num;
	int num2;
	double average;
	int max_limit = 10;
	static int sum;
	
	public void calc_avg() {
		Scanner s1 = new Scanner(System.in);
		
		for(int i=0; i<max_limit; i++) {
		System.out.println("Enter the number:");
		num = s1.nextInt();
		
		sum = num + sum;
		System.out.println("Sum:" + sum);
		
	          }
		average = sum/max_limit;
		System.out.println("Average :" + average);
	 }

	public static void main(String[] args) {
		Average avg = new Average();
		avg.calc_avg();
	
		}

}
