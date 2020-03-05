package javaPractice;

public class Expression {
	int x=2;
	int y=5;
	int z=0;
	
	
	public void find_values() {
		System.out.println(x==2);
		System.out.println(x!=5);
		System.out.println(x!=5 && y >=5);
		System.out.println(z!=0 || x==2);
		System.out.println(!(y<10));
				
		}

	public static void main(String[] args) {
		Expression exp1 = new Expression();
		exp1.find_values();
		
		
	}

}
