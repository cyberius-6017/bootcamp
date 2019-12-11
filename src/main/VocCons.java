/*
 * Program that recieves a word and then counts the number of vocals and consonants and returns them to the console.
 * Made as an activity for Cyberius 6017 Bootcamp - Programming
 * */
package main;

import java.util.Scanner;

public class VocCons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vocales = 0, consonantes = 0;
		
		String palabra = scanner.nextLine();
		
		//Para recorrer cada letra individual de la palabra.
		for(int i = 0; i < palabra.length(); i++){
			if(palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
				vocales++;
			}else {
				consonantes++;
			}
		}
		
		System.out.println("Consonantes: " + consonantes);
		System.out.println("Vocales: " + vocales);
		
		
		scanner.close();
		

	}

}
