package Tarea;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la capacidad actual del estanque (máx 70 litros): ");

        double capacidadActual = scanner.nextDouble();

        if (capacidadActual == 70) {
            System.out.println("Estanque lleno");
        } else if (capacidadActual >= 60 && capacidadActual < 70) {
            System.out.println("Estanque casi lleno");
        } else if (capacidadActual >= 40 && capacidadActual < 60) {
            System.out.println("Estanque 3/4");
        } else if (capacidadActual >= 35 && capacidadActual < 40) {
            System.out.println("Medio Estanque");
        } else if (capacidadActual >= 20 && capacidadActual < 35) {
            System.out.println("Suficiente");
        } else if (capacidadActual >= 1 && capacidadActual < 20) {
            System.out.println("Insuficiente");
        } else if (capacidadActual < 1) {
            System.out.println("Capacidad fuera de rango");
        }

        scanner.close();
    }
}
