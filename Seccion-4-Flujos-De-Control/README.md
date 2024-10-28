# Flujos de control


## Ejercicio 6
Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:

- Calcular el menor número e imprimir el valor.
- Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero menor es igual o mayor que 10!".



## Ejercicio 7
Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).

Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.



## Ejercicio 8
Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).

Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.



## Ejercicio 9

Para la tarea se requiere un menú para administrar a los productos con las opciones: actualizar, eliminar, crear, listar y salir.

Para la clase con el método main vamos a contar con un menú para poder seleccionar el tipo de operación, puede ser con la clase Scanner indicando una lista con las opciones, cada opción asociada a un numero.

O bien! otra forma mucho mejor seria usando la clase JOptionPane para un menú con interfaces graficas de la siguiente forma:
```
int opcionIndice = 0;
...
 
// los Map (o mapas) los veremos mas adelante en el curso en profundidad
// pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
// también se les conoce como diccionarios para almacenar datos en base a un nombre.
Map<String, Integer> opciones = new HashMap();
opciones.put("Actualizar", 1);
opciones.put("Eliminar", 2);
opciones.put("Agregar", 3);
opciones.put("Listar", 4);
opciones.put("Salir", 5);
 
Object[] opArreglo = opciones.keySet().toArray();
 
Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción", 
                     "Mantenedor de Productos", 
                     JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);
 
if (opcion == null) {
    JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
} else {
    opcionIndice = opciones.get(opcion.toString());
	
   // aca un if o switch para las distintas opciones.
}
```

Según el numero ingresado usar un if o switch para implementar cada una de las 4 operaciones y 5 para salir.

Dentro de cada sentencia o switch imprimir un texto relacionado a la opción, por ejemplo para actualizar: `JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");` o mediante sout en consola: `System.out.println("Usuario actualizado correctamente");`

Para eliminar el mensaje "Usuario eliminado correctamente" y así sucesivamente dependiendo de la opción.

Usar un do while para iterar hasta que la opción sea salir, cada vez que se selecciona una operación distinta a salir, al finalizar con dicha operación debe volver al menú para continuar con otra, al finalizar con la opción salir (5) se debe mostrar el mensaje `"Haz salido con exito!"` y finalizar el programa.