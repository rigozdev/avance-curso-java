package Arreglos;

import java.util.Scanner;

public class EjemploArregloDesplazarPosicion2 {
    public static void main(String[] args) {

        /*
        * En un arreglo de 10 elementos (0-9)
        * insertar un valor en una posición
        * determinada y correr el resto de valores
        * considerando que los valores van del
        * 1 al 9 con un 0 final (ver video 113)
        * */
        int[] a = new int[10];

        /*
        * las variables elemento y posición componen en número
        * a ingresar y la posición en la que se ingresará*/
        int nuevoElemento, posicionNuevoElemento;
        Scanner scan = new Scanner(System.in);


        /*
        * Ponemos los valores al arreglo pero no al total
        * de sus posiciones, sino que hasta a.length-1 (que
        * deja disponible una posición al final, la cual
        * debería ser 0*/
        System.out.println("Llene el arreglo con números");
        for(int i = 0; i < a.length-1; i++){
            System.out.println("Por favor ingrese un número para la posición " + i);
            a[i] = scan.nextInt();
        }

        System.out.println("Ingrese el nuevo elemento:");
        nuevoElemento = scan.nextInt();
        System.out.println("Ingrese la posición del nuevo elemento (0 - 9):");
        posicionNuevoElemento = scan.nextInt();


        /*
        * El siguiente for es crucial, porque es el que moverá
        * los elementos desde la posición indicada. i comienza en
        * el largo de la cadena (a.length-2) y es menos 2 porque
        * hay que contar la posición del valor a agregar y el ultimo
        * valor que en este caso es un 0 al final del arreglo
        * En caso contrario i excedería los límites del arreglo
        *
        * Entonces i recorrerá hasta que sea igual a la posición del
        * nuevo elemento de forma 'negativa' o bajando en el arreglo
        * y por cada vez que avance negativamente, el valor 'siguiente'
        * a 'a[i]' (a[i+1]) será igual al valor de a[i], esto lo irá
        * corriendo una posición hasta llegar al elemento ingresado
        * que no quedará vacío pero posteriormente al salir del arreglo
        * se le asignará al arreglo que la posición indicada contendrá
        * el nuevo valor ingresado
        * */

        for(int i = a.length -2; i >= posicionNuevoElemento; i--){
            a[i+1] = a[i];
        }
        a[posicionNuevoElemento] = nuevoElemento;


        System.out.println("El arreglo: ");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
