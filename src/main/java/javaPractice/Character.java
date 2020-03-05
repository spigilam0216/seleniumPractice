package javaPractice;

import java.util.Scanner;

public class Character {
	String character;
	
	public void check_case(String ch2) {
		character = ch2;
		
		
		if (character.equals(character.toLowerCase())) {
			System.out.println("You have entered a Lower Case letter " + character);
		} else 
			System.out.println("You have entered an Upper Case letter " + character);
	}

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a character:");
		String String1 = s1.nextLine();
		
		Character ch1 = new Character();
		ch1.check_case(String1);
	}

}
