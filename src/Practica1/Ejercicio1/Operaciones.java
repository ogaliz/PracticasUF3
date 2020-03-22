package Practica1.Ejercicio1;

import java.util.Scanner;

class Operaciones {

    Scanner teclado = new Scanner(System.in);
    double resultado = 0;

    double suma(double num1, double num2){

        resultado = num1 + num2;

        return resultado;
    }

    double resta(double num1, double num2){

        resultado = num1 - num2;

        return resultado;
    }

    double multiplicacion(double num1, double num2){

        resultado = num1 * num2;

        return resultado;
    }

    double division(double num1, double num2){

        resultado = num1 / num2;

        return resultado;
    }
}
