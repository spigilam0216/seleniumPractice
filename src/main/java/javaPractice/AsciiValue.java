package javaPractice;

public class AsciiValue {
	
	public void find_value() {
		
		for (int i=0; i<=255; i++) {
			char b = (char) i;
			System.out.println("The ASCII value of " + i + " is: " + b);
		}
		
		
	}

	public static void main(String[] args) {
		AsciiValue asc = new AsciiValue();
		asc.find_value();

	}

}
