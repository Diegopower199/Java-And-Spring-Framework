package Tarea;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio9 {

    public static void main(String[] args) {
        // Mapa de opciones
        Map<String, Integer> opciones = new HashMap<>();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        // Convertir las claves del mapa en un arreglo de objetos para usar en
        // JOptionPane
        Object[] opArreglo = opciones.keySet().toArray();

        int opcionIndice = 0; // Para almacenar la opción seleccionada

        do {
            // Mostrar el menú con JOptionPane
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            // Verificar si se seleccionó una opción
            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                // Obtener el índice de la opción seleccionada
                opcionIndice = opciones.get(opcion.toString());

                // Switch para las distintas operaciones
                switch (opcionIndice) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Producto agregado correctamente");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Lista de productos");
                        // Aquí podrías agregar la lógica para listar los productos
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Haz salido con éxito!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                        break;
                }
            }

        } while (opcionIndice != 5); // Iterar hasta que se seleccione la opción "Salir"
    }
}
