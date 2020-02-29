package javaPractice;

public class Programming {
	String progLang1 = "I love ";
	String progLang2 = "programming languages";
	
	Programming() {
		
	}
	
	Programming(String lang) {
		progLang2 = lang;
		
	}

	public static void main(String[] args) {
		// create an object
		
		Programming p1 = new Programming();
		System.out.println(p1.progLang1 + p1.progLang2);
		
		Programming p2 = new Programming("Java");
		System.out.println(p2.progLang1 + p2.progLang2);
	}

}
