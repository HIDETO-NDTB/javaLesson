package practice_programs;

import java.util.Scanner;

public class String_To_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("Character at "+i+" position "+ch);
		}
	}

}
