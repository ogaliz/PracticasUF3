package manejo_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 Es demana una aplicaci� que demanar� n�meros sencers a l�usuari entre 1 i 100, i mostrar�
 el residu (m�dul) de la seva divisi� per 10.  L�aplicaci� contindr� una funci� que comprovi 
 que el dividend sigui m�ltiple de 10.  Si no �s aix� llan�ar� una excepci� que mostrar� per 
 pantalla un missatge informant que el n�mero introdu�t no �s m�ltiple de 10.
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
