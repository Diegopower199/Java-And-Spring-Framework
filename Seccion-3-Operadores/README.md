# Operadores

## Ejercicio 3
El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.

Podría ser utilizando operador ternario.


## Ejercicio 4

Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.

- Si la capacidad actual es 70 litros: imprimir Estanque lleno
- Si está entre 60 y menor a 70: imprimir Estanque casi lleno
- Si está entre 40 y menor a 60: imprimir Estanque  3/4
- Si está entre 35 y menor a 40: imprimir Medio Estanque 
- Si está entre 20 y menor a 35: imprimir Suficiente
- Si está entre 1 y menor a 20: imprimir Insuficiente


## Ejercicio 5
Obtener el nombre mas largo de tres personas, según los siguientes requerimientos

- Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().
- Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
- Podría usar `.split(" ");` del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.
- Restricción no usar loops en el desarrollo de la tarea.

Ejemplo del resultado: `"Guillermo Doe tiene el nombre más largo."`