package Tarea;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir la cantidad de números a ingresar (mínimo 10)
        System.out.print("¿Cuántos números desea ingresar? (mínimo 10): ");

        int cantidadNumeros = scanner.nextInt();

        if (cantidadNumeros < 10) {

            System.out.println("Debe ingresar al menos 10 números.");

            scanner.close();
            return;

        }

        // Inicializar el valor del menor número
        int menorNumero = Integer.MAX_VALUE;

        // Pedir los números al usuario
        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            // Comparar para encontrar el menor número

            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }

        // Imprimir el menor número
        System.out.println("El número menor es: " + menorNumero);

        // Verificar si el menor número es menor que 10
        if (menorNumero < 10) {
            System.out.println("¡El número menor es menor que 10!");

        } else {
            System.out.println("El número menor es igual o mayor que 10.");
        }

        scanner.close();
    }
}
