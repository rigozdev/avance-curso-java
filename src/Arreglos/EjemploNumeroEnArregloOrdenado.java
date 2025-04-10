package Arreglos;

// Importamos la clase Scanner para leer datos desde consola
import java.util.Scanner;

public class EjemploNumeroEnArregloOrdenado {
    public static void main(String[] args) {

        // Declaramos un arreglo de enteros con 10 espacios
        int[] a = new int[10];

        // Declaramos variables para el nuevo número que se insertará y su posición en el arreglo
        int nuevoElemento, posicion;

        // Creamos el Scanner para leer datos ingresados por el usuario
        Scanner scan = new Scanner(System.in);

        /*
         * Solicitamos al usuario que llene el arreglo con números. Se llenarán 9 posiciones,
         * dejando una vacía al final para permitir la inserción del nuevo número.
         * Supuesto: los números ingresados están en orden ascendente.
         */
        System.out.println("Llene el arreglo con números");
        for(int i = 0; i < a.length - 1; i++){ // Solo hasta la posición 8
            System.out.println("Por favor ingrese un número para la posición " + i);
            a[i] = scan.nextInt(); // Se guarda el número ingresado en la posición correspondiente
        }

        // Se pide el nuevo número que se desea insertar manteniendo el orden del arreglo
        System.out.println("Ingrese el nuevo elemento:");
        nuevoElemento = scan.nextInt();

        /*
         * Ahora buscamos la posición correcta donde debe ir el nuevo número
         * Para eso, partimos desde la posición 0, y mientras no lleguemos al final
         * y el nuevo número sea mayor al actual, avanzamos. Así encontramos el punto
         * justo donde debería ir el nuevo número para mantener el orden.
         */
        posicion = 0;
        while(posicion < a.length && nuevoElemento > a[posicion]){
            posicion++;
        }

        /*
         * Desplazamos todos los elementos desde el final (posición 8)
         * hasta la posición encontrada para dejar espacio al nuevo número.
         * Vamos de atrás hacia adelante para no sobrescribir los valores.
         */
        for(int i = a.length - 2; i >= posicion; i--){
            a[i + 1] = a[i];
        }

        // Insertamos el nuevo número en la posición correcta
        a[posicion] = nuevoElemento;

        // Mostramos el arreglo resultante, indicando la posición y el valor en cada línea
        System.out.println("El arreglo: ");
        for(int i = 0; i < a.length; i++){
            System.out.println(i + ": " + a[i]);
        }
    }
}
