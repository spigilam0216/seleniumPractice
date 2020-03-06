package javaPractice;

public class Multiplication {

	int number;
	public void mult_table (int num) {
		number=num;
		
		for(int i=1; i<=number; i++) {
			System.out.println(number + " X " + i + " = " + number * i);
		}
		System.out.println("-----------------------------------------------");
	}
	public static void main(String[] args) {
		Multiplication m1 = new Multiplication();
		m1.mult_table(20);
		m1.mult_table(50);
		m1.mult_table(29);

	}

}
