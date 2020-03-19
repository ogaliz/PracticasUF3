package Practica1.Ejercicio4;

import java.util.Scanner;

/**
 * Fes una funció per demanar quantitats de diners per teclat a l’usuari, i retornar-les
 * validades (la funció ha de controlar amb excepcions que les dades introduïdes siguin numèriques).
 * En cas que l’usuari introdueixi una quantitat negativa, la funció ha de «petar» (consulteu cóm es fa tant a python com a java).
 * El programa principal farà servir la funció per anar construint una llista de quantitats.  Ha de controlar
 * que en cas que la funció aixequi una excepció (per numero negatiu), s’informi per pantalla a l’usuari de l’error,
 * i en comptes d’afegir el número, s’afegeixi a la llista un element amb el text ‘NULL’.
 * */
public class AixecarExcepcionsMain {

    static Scanner teclado = new Scanner(System.in);
    static double[] quantitats;
    static final String NUMERO_NO_PERMITIDO = "NULL";

    public static void main(String[] args) {

        System.out.println("De cuantos numeros se compone la lista?");
        quantitats = new double[teclado.nextInt()];

        for (double quantitat : quantitats) {

            quantitat = 21;
            System.out.println(quantitat);
        }

    }// cierre del main

}
