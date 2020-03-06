package javaPractice;

public class Pattern {

	public void check_pattern() {
		
		for(int i=0; i<5; i++) {
			
			for (int j=0; j<i; j++) {
				System.out.print("*");
				
			 }
			System.out.println();
		}
		
	
		System.out.println("-------------------------------------------------------------------------------");
		
		for(int i=0; i<5; i++) {
			
			for (int j=0; j<3-i; j++) {
				System.out.print(" ");
				
			 }
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			
			for(int l=0; l<=2-i; l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		System.out.println("-------------------------------------------------------------------------------");	
		
		
		for(int i=0; i<5; i++) {
			
			for (int j=0; j<5-i; j++) {
				System.out.print(" ");
				
			 }
			for (int k=0; k<i; k++) {
				System.out.print	("* ");
			}
			System.out.println();
		}
		
		
		
		
			
	}
	
	public static void main(String args[]) {
		Pattern p1 = new Pattern();
		p1.check_pattern();
	}
}
