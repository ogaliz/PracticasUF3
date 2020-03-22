package testExamen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NoSeDetiene {

	public static void main(String[] args) {
		
		int num1 = 0; 
		Scanner teclado = new Scanner(System.in);
		
		while(true) {
		try {
			System.out.println("Introduce un numero entero: ");
			num1 = teclado.nextInt();
			break;
		
		} catch (InputMismatchException e) {
			System.out.println( e + " --> El número debe ser un entero.");
			System.out.println("Introduce un numero entero: ");
			num1 = teclado.nextInt();
	
		} 
		
		}
		teclado.close();
		System.out.println(num1);

	}// --- MAIN

}
