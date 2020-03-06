package javaPractice;

public class Factorial {

	// 5*4*3*2*1
	int number;
	int fact =1;
	public void mult_table (int num) {
		number=num;
		
		
		for(int i=1; i<=number; i++) {
			
			fact = fact*i;
			
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		Factorial m1 = new Factorial();
		m1.mult_table(5);
		

	}

}
