package Tarea;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Determinar si el resultado será negativo o positivo
        boolean esNegativo = (num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0);

        // Convertir los números a positivos para facilitar la multiplicación
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        // Realizar la multiplicación mediante sumas sucesivas
        int resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }

        // Ajustar el signo del resultado
        if (esNegativo) {
            resultado = -resultado;
        }

        // Imprimir el resultado
        System.out.println("El resultado de la multiplicación es: " + resultado);

        scanner.close();
    }
}
