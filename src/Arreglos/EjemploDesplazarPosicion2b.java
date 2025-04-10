package Arreglos;

import java.util.Scanner;

public class EjemploDesplazarPosicion2b {
    public static void main(String[] args) {

        int[] a = new int[10];


        int nuevoElemento, posicionNuevoElemento, ultimo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Llene el arreglo con números");
        for(int i = 0; i < a.length; i++){
            System.out.println("Por favor ingrese un número para la posición " + i);
            a[i] = scan.nextInt();
        }

        System.out.println("Ingrese el nuevo elemento:");
        nuevoElemento = scan.nextInt();
        System.out.println("Ingrese la posición del nuevo elemento (0 - 9):");
        posicionNuevoElemento = scan.nextInt();


        ultimo = a[a.length-1];
        for(int i = a.length -2; i >= posicionNuevoElemento; i--){
            a[i+1] = a[i];
        }

        int[] b = new int[a.length+1];
        System.arraycopy(a, 0, b, 0, a.length);

        b[posicionNuevoElemento] = nuevoElemento;

        b[b.length -1] = ultimo;

        System.out.println("El arreglo: ");
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}
