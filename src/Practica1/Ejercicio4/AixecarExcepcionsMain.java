package Practica1.Ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Fes una funció per demanar quantitats de diners per teclat a l’usuari, i retornar-les
 * validades (la funció ha de controlar amb excepcions que les dades introduïdes siguin numèriques).
 * En cas que l’usuari introdueixi una quantitat negativa, la funció ha de «petar» (consulteu cóm es fa tant a python com a java).
 * El programa principal farà servir la funció per anar construint una llista de quantitats.  Ha de controlar
 * que en cas que la funció aixequi una excepció (per numero negatiu), s’informi per pantalla a l’usuari de l’error,
 * i en comptes d’afegir el número, s’afegeixi a la llista un element amb el text ‘NULL’.
 */
public class AixecarExcepcionsMain {

    static Scanner teclado = new Scanner(System.in);
    static String[] quantitats;
    static final String NUMERO_NO_PERMITIDO = "NULL";
    static int cantidadIntroducida;

    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("De cuantos numeros se compone la lista?");
                quantitats = new String[teclado.nextInt()];
                System.out.println("El listado se compone de: " + quantitats.length + " valores.");
                break;

            } catch (InputMismatchException e) {
                System.out.println("El dato debe ser númerico: " + e);
                teclado.next();

            } catch (NegativeArraySizeException e) {
                System.out.println("El programa no puede montar listas de cantidad negativa: " + e);
            }
        }

        for (int i = 0; i < quantitats.length; i++) {

            System.out.println("Cantidad num.: " + (i + 1));

            if (teclado.hasNextInt())
                cantidadIntroducida = teclado.nextInt();
            else
                System.out.println("La entrada debe ser númerica");
            quantitats[i] = NUMERO_NO_PERMITIDO;

            if (cantidadIntroducida < 0) {

                System.out.println("El numero negativo se ha anulado.");
                quantitats[i] = NUMERO_NO_PERMITIDO;

            } else {
                quantitats[i] = Integer.toString(cantidadIntroducida);
            }
        }

        // 3. Mostramos todos los elementos de la lista
        System.out.println("Los elementos que ha introducido son:");
        for (String quantitat : quantitats) {

            System.out.print(quantitat + " ");
        }
    }
}
