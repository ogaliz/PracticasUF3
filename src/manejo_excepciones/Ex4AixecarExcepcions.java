package manejo_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 Es demana una aplicació que demanarà números sencers a l’usuari entre 1 i 100, i mostrarà
 el residu (mòdul) de la seva divisió per 10.  L’aplicació contindrà una funció que comprovi 
 que el dividend sigui múltiple de 10.  Si no és així llançarà una excepció que mostrarà per 
 pantalla un missatge informant que el número introduït no és múltiple de 10.
 * */
public class Ex4AixecarExcepcions {
	
	static Scanner teclado = new Scanner(System.in);
			
	// Funcio per a demanar un numero sencer a l'usuari
	static int pide_num () throws InputMismatchException {
		
		int num = 0;
		
		try {
			do {
				System.out.println("Entre un numero entre el 1 y el 100");
				num = teclado.nextInt();
			} while (num > 100);
			
		} catch (Exception e) {
			
			System.out.println("ERROR: " + e);			
			
		} finally {
			System.out.println("Programa finalizado.");
		}
		
		return num; 
	}
	
	public int calcula_modulo (int num) {
		
		int resultado = num % 10;
		
		return resultado;
	}

	public static void main(String[] args) {
		
		pide_num();

	}// MAIN ---

}// CLASS ---
