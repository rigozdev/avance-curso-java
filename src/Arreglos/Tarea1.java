package Arreglos;

import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingresa un entero para la posición " + i);
            arr[i] = scan.nextInt();
        }

        System.out.println("Contenido del  original");
        int contador=0;
        for (int contenido: arr){
            System.out.println(contador + ": " + contenido);
            contador++;
        }

        int i = 0, j = arr.length-1;
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("arr[i]" + arr[i]);
        System.out.println("arr[j]" + arr[j]);

        //mientsa se cumpla esto (que será siempre hasta que se aumenten los valores
        //Ir aumentando y disminuyendo el valor de i y j respectivamente para que se encuentren

        while(i < j){
            System.out.println(arr[j--]); // último, penúltimo, antepenúltimo...
            System.out.println(arr[i++]); // primero, segundo, tercero...
        }

        // Si hay un elemento al centro (cuando i == j), imprímelo una vez

    }
}
