package Tarea;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo es: " + area);

        scanner.close();
    }
}
