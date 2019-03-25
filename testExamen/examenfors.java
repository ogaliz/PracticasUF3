package testExamen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Fes un programa gravamitjana que demani a l’usuari 5 números enters, 
 * calculi la seva mitjana aritmètica (amb decimals), i gravi aquesta dada en el fitxer /tmp/mitjana.bin.  
 * Fes un segon programa llegeixmitjana que llegeixi aquest fitxer i mostri per pantalla aquest número real, 
 * i calculi (i mostri) el seu quadrat.  Feu les comprovacions d’error que considereu oportunes.
 * */

public class examenfors {
	
	public static void main(String [] arg) {
		
		int[] array;
		array = cogerNumeros();
		
		for(int numero : array){
			System.out.print( numero );
		}
	}// -- MAIN
	
	public static int[] cogerNumeros() {
		
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[5];
		int num = 0;
		
		while ( num <= numeros.length ) {
			
			num++;
			
			try{
					
				for(int i=0; i < numeros.length; i++) {
						
					System.out.print("Introdueix valor " + (i+1) + ": ");
					numeros[i] = teclado.nextInt(); 
				}
						
			}catch(Exception e) {
				System.out.println("Error: " + e);
					
			}
			
		}
		
		teclado.close();
		return numeros;
		
	}// -- cogerNumeros
}
