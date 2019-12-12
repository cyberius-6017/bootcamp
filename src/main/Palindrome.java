package main;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//Create a Program that returns True if a word is a palindrome and false if not.
		
		//Read the word - Using Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a word now...");
		String theWord = scanner.nextLine();
		
		theWord = theWord.toLowerCase();
		
		// civic
		// 01234
		
		boolean bool = true;
		for(int i = 0; i < theWord.length()-1; i++) {
			if(theWord.charAt(i) != theWord.charAt(theWord.length()-1-i)) {
				bool = false;
			}
		}
		
		if(bool) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
		
		
		scanner.close();
	}

}
