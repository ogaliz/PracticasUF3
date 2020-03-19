package Practica1.Ejercicio3;

import javax.swing.*;
import java.util.Scanner;

/**
 * Reescriu el darrer exercici que hagis fet dels blocs següents:
 * Iteració mentre
 * Recorreguts nomèrics
 * Arrays (java) -----------> Encontrado este ejercicio de la UF1, manejo de Arrays
 * Strings
 * Llistes (python)
 * Afegint ara un tractament d’errors que facin els codis anteriors 100% robustos
 * (no han de cancel·lar sota cap condició: tipus de dades incorrecta, posicions inexistents, ... o qualsevol altre)
 * */
/**
 * Crea un programa de gestió d’un institut. El programa sol·licitarà el número d’alumnes d’un institut,
 * i a continuació les notes de cadascun. Com a resultat ens mostrarà la nota més alta, la més baixa,
 * la quantitat d’alumnes que han aprovat i els que han suspès, i la mitja de les notes.
 */
public class MilloraProgramesMain {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] numNotes;
        int notaMesAlta = 0;
        int notaMesBaixa = 10;
        int aprovats = 0;
        int suspesos = 0;
        float mitja = 0;

        // 1. Rellenamos un array con notas y lo mostramos por pantalla.
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "De cuantas notas se compone la lista?"));
        numNotes = new int[num];

        for (int i = 0; i < numNotes.length; i++) {

            do {
                System.out.println("Que saco el alumno " + (i + 1));
                numNotes[i] = teclado.nextInt();

                if (numNotes[i] < 0 || numNotes[i] > 10) {
                    System.out.println("La nota debe estar dentro del rango 0 - 10");
                }

            } while (numNotes[i] < 0 || numNotes[i] > 10);

            if (numNotes[i] < 5) {
                suspesos++;
            } else {
                aprovats++;
            }
        }
        teclado.close();

        for (int i : numNotes) {
            System.out.print(i + ", ");
        }

        System.out.println("\nEl numero de aprobados es " + aprovats);
        System.out.println("El numero de suspendidos es " + suspesos);

        // 2. Calcula la media
        for (int i = 0; i < numNotes.length; i++) {

            mitja += numNotes[i];
        }

        mitja = mitja / numNotes.length;

        System.out.println("La media de las notas de al escuela es: " + mitja);

        // 3. Sacamos las notas mas alta y mas baja de nuestra clase.
        for (int i = 0; i < numNotes.length; i++) {

            if (numNotes[i] > notaMesAlta) {

                notaMesAlta = numNotes[i];
            }
            if (numNotes[i] < notaMesBaixa) {

                notaMesBaixa = numNotes[i];
            }
        }

        System.out.println("La nota mas alta ha resultado ser un " + notaMesAlta + "\n"
                + "y la nota mas baja ha sido un " + notaMesBaixa + ".");

    }// cierre del main

}
