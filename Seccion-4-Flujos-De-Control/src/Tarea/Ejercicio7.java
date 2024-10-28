package Tarea;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Inicialización de variables
        double sumaNotasMayores5 = 0;
        double sumaNotasMenores4 = 0;
        double sumaTotal = 0;
        int contadorMayores5 = 0;
        int contadorMenores4 = 0;
        int contadorNotas1 = 0;

        // Bucle para ingresar las 20 notas
        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese la nota final del alumno " + i + " (de 1 a 7): ");
            double nota = scanner.nextDouble();

            // Si la nota es 0, terminar el programa
            if (nota == 0) {
                System.out.println("Error: Se ha ingresado una nota inválida (0). Finalizando el programa.");

                scanner.close();
                return;
            }

            // Validar si la nota está en el rango de 1 a 7
            if (nota < 1 || nota > 7) {
                System.out.println("Nota fuera de rango. Debe ser entre 1 y 7.");
                i--; // Para que no cuente el ciclo si la nota no es válida
                continue;
            }

            // Acumular la suma total
            sumaTotal += nota;

            // Contabilizar las notas según su valor
            if (nota > 5) {
                sumaNotasMayores5 += nota;
                contadorMayores5++;
            } else if (nota < 4) {
                sumaNotasMenores4 += nota;
                contadorMenores4++;
            }

            if (nota == 1) {
                contadorNotas1++;
            }
        }

        // Cálculo de promedios
        double promedioMayores5 = contadorMayores5 > 0 ? sumaNotasMayores5 / contadorMayores5 : 0;
        double promedioMenores4 = contadorMenores4 > 0 ? sumaNotasMenores4 / contadorMenores4 : 0;
        double promedioTotal = sumaTotal / 20;

        // Mostrar resultados
        System.out.println("Promedio de notas mayores a 5: " + promedioMayores5);
        System.out.println("Promedio de notas menores a 4: " + promedioMenores4);
        System.out.println("Cantidad de notas 1: " + contadorNotas1);
        System.out.println("Promedio total: " + promedioTotal);

        scanner.close();
    }
}
