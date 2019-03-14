package manejo_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
Desenvolupa un programa que demani la nota final (enter del 0 al 10) d'alumnes d'un curs.
Un cop introdu�des totes les notes, el programa demanar� la posici� d'una de les notes i 
una nova nota amb que substituir� la nota que es trobava en aquella posici�.
Finalment, el programa mostra les notes abans i despr�s del canvi.

int num = Integer.parseInt(JOptionPane.showInputDialog(null, "De cuantas notas se compone la lista?"));
 * */
public class Ex2CorregeixNota {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int[] notas = new int[5];
		int posicion;
		int notaCambiada;
		
//		Rellenamos el array con las cinco notas
		for (int i = 0; i < 5; i++) {
			
			try {
				System.out.println("introduce la nota " + (i+1));
				notas[i] = teclado.nextInt();
				
			} catch (InputMismatchException e) {
				
				System.out.println("Por favor debe ser un n�mero entero.");
				break;
			}
			
		}
		
//		Mostrando el primer array de notas
		for (int i : notas) {
			
			System.out.print(i + " ");	
		}
		
		System.out.println("\nEn que posici�n se encuentra la nota que desea cambiar?");
		posicion = (teclado.nextInt() - 1);
		
		System.out.println("Cual es la nueva nota del registro?");
		notaCambiada = teclado.nextInt();
		
		for (int i = 0; i < notas.length; i++ ) {
			
			if (i == posicion) {
				notas[i] = notaCambiada;
			}
		}
		
//		Mostramos los nuevos registros: 
		System.out.println("La nota ha sido modificada con �xito");
		for (int num : notas) {
			System.out.print(num + " ");
		}
		
		teclado.close();
		
//		Calculamos cual es la media de los registros
		float notaMedia = 0;
		
		for (int num : notas) {
			notaMedia += num;
		}

		System.out.println("\n" + notaMedia);
		System.out.println("La nota media final ha sido: " + (notaMedia / notas.length));
		
	}//cierre del main
}
