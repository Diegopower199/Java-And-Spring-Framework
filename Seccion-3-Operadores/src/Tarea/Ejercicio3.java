package Tarea;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {

        int num1, num2 = 0;

        Scanner scanner = new Scanner(System.in);

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if (num1 < num2) {
            System.out.print("Numeros ordenados de mayor a menor: " + num2 + ", " + num1);
        } else {
            System.out.print("Numeros ordenados de mayor a menor: " + num1 + ", " + num2);
        }

        scanner.close();
    }
}
