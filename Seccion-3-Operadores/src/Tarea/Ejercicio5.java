package Tarea;

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Pedir nombres completos usando JOptionPane
        String persona1 = JOptionPane
                .showInputDialog("Introduce el nombre completo de la primera persona (nombre y apellido):");
        String persona2 = JOptionPane
                .showInputDialog("Introduce el nombre completo de la segunda persona (nombre y apellido):");
        String persona3 = JOptionPane
                .showInputDialog("Introduce el nombre completo de la tercera persona (nombre y apellido):");

        // Separar el nombre del apellido
        String nombre1 = persona1.split(" ")[0];
        String nombre2 = persona2.split(" ")[0];
        String nombre3 = persona3.split(" ")[0];

        // Determinar el nombre más largo
        String nombreMasLargo = nombre1.length() >= nombre2.length() ? nombre1 : nombre2;
        nombreMasLargo = nombreMasLargo.length() >= nombre3.length() ? nombreMasLargo : nombre3;

        // Determinar a quién pertenece el nombre más largo
        String personaConNombreMasLargo = nombreMasLargo.equals(nombre1) ? persona1
                : nombreMasLargo.equals(nombre2) ? persona2 : persona3;

        // Imprimir el resultado
        JOptionPane.showMessageDialog(null, personaConNombreMasLargo + " tiene el nombre más largo.");
    }
}
