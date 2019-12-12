/*
 * Starters.java
 * This program is an outline of the basics for Java programming and FRC programming.
 * Made as a guide for Cyberius 6017 Bootcamp - Programming
 * */
package main;

import java.util.Scanner;

public class Starters {
	
	public static int i = 0; //Global Variable 

	public static void main(String[] args) {

		int numero = 8; // Numero Entero
		double numeroDec = .15; // Numero Decimal
		char c = 'a'; // Char
		String palabra = "el parque"; // Palabra o Palabras
		boolean bool = false; // True/False
		
		holacomoestas
		double numeroDecimalQueNoVoyAUsar = 0.0;

		// System.out.println(bool);

		// int arr[] = new int[20];
		// 0 1 2 3 4 5 6 7 8 9
		// int arr[] = {1,2,3,4,5,6,7,8,9,10};
		// System.out.println(arr[1]);

		Scanner scanner = new Scanner(System.in);
		
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//		int c2 = a+b;
//		System.out.println(c2);
//		System.out.println(suma(a,b));
		
		
		for( ; i < 5; i++) {
			//System.out.println(i);
		}
		
		blah();
	}

	/*
	 * //Name Example System.out.println("Cual es tu nombre?"); //Input String name
	 * = scanner.nextLine(); //Recibe Valor System.out.println("Hola " + name +
	 * "!"); //Imprime Valor
	 */

	// Loops

	//
	// int numero2 = 0;
	// while(numero2 <= 100){
	// System.out.println(numero2);
	// numero2++;
	// }
	// Lo que esta adentro del While se ejecuta mientras la condicion sea cierta.
	// Se usa cuando no sabes cuantas veces pasa el loop

	// Sabemos cuantas "loops" queremos hacer
	// for(int i = 100; i > 0; i--) {
	// System.out.println(i);
	// }

	// En el Do While minimo se ejecuta el codigo una vez.
	// int num3 = 0;
	// do{
	// //num3++;
	// System.out.println(num3);
	// num3++;
	// }while(num3<0);

	// if (boolean) (var1 < var2) (var1 == var2) (var1 != var2)
	// boolean condicion = false;
	// int num1 = 12;
	// int num2 = 1;
	//
	// if (num1 == num2) {
	// System.out.println("Son iguales");
	// } else if (num1 < num2) {
	// System.out.println("Num1 es menor a Num2");
	// } else if (num1 > num2) {
	// System.out.println("Num1 es mayor a Num2");
	// } else if (num1 != num2) {
	// System.out.println("Son diferentes");
	// } else {
	// System.out.println("No");

	// COMMENT

	/*
	 * Multiline comment
	 * 
	 */

	public static int suma(int a, int b) {
		return a + b;
	}
	
	public static void blah() {
		System.out.println(i);
	}

}
