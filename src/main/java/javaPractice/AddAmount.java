package javaPractice;

public class AddAmount {
	static int amount = 50;
	
	AddAmount() {
		
	}
	
	AddAmount(int amt) {
		amount = amount + amt;
		
	}
	public static void main(String[] args) {
		// create object
		AddAmount a1 = new AddAmount();
		System.out.println("The amount in PiggyBank:" + AddAmount.amount);
		
		AddAmount a2 = new AddAmount(125);
		System.out.println("The Final amount in PiggyBank:" + AddAmount.amount);

	}

}
