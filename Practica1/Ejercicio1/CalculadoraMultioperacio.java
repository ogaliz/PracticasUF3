package Ejercicio1;

import java.util.Scanner;

/**
 * Exercici 1. La calculadora multioperació (versió 3)
 * Desenvolupa una calculadora senzilla que demani a l’usuari un primer operand numèric,
 * una operació entre (+ - * /) i un segon operand, i escrigui el resultat d’aplicar l’operació als operands.
 * Un cop mostrat el resultat, la calculadora demana a l’usuari si vol realitzar un nou càlcul.
 * El programa continuarà oferint a l’usuari la possibilitat de calcular, fins que l’usuari respongui negativament.
 * Les operacions (suma, resta, multiplicació i divisió) han de calcular-se cadascuna amb una funció respectivament,
 * que rebi com a paràmetres els dos operands.
 * Controleu l'error de divisió per zero amb excepcions.
 * Controleu possibles errors en els tipus introduïts amb excepcions, es a dir per exemple, si l'usuari ha de introduir un enter i introdueix una lletra.
 * */
public class CalculadoraMultioperacio {


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Operaciones operacion = new Operaciones();

        boolean continuar;

        do {

            System.out.println("Que operación desea realizar? + - * / ");
            String seleccion = teclado.next();
            teclado.reset();

            System.out.println("Introduzca el primer operando:");
            double num1 = teclado.nextInt();
            System.out.println("Intrduzca el segundo operando");
            double num2 = teclado.nextInt();

            switch (seleccion){
                case "+":
                    System.out.println("El resultado de la suma es:");
                    System.out.println(operacion.suma(num1, num2));
                    break;
                case "-":
                    System.out.println("El resultado de la resta es:");
                    System.out.println(operacion.resta(num1, num2));
                    break;
                case "*":
                    System.out.println("El resultado de la multiplicacion es:");
                    System.out.println(operacion.multiplicacion(num1, num2));
                    break;
                case "/":
                    System.out.println("El resultado de la division es:");
                    System.out.println(operacion.division(num1, num2));
                    break;
                default:
                    System.out.println("No ha entrado en el switch-case, ERROR!!");
            }

            System.out.println("Desea hacer otra operacion? SI / NO");
            String continuamos = teclado.next();
            teclado.reset();

            continuar = continuamos.equals("SI");

        } while (continuar);

        teclado.close();
    }
}
