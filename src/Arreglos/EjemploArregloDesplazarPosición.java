package Arreglos;

import java.util.Scanner;

public class EjemploArregloDesplazarPosición {
    public static void main(String[] args) {
        int[] a = new int[10];

        int ultimo;
        Scanner scan = new Scanner(System.in);



        for(int i = 0; i < a.length; i++){
            System.out.println("Ingrese el número:");
            a[i] = scan.nextInt();
        }

        ultimo = a[a.length-1];
        for(int i = a.length -2; i >= 0; i--){
            a[i+1] = a[i];
        }

        a[0] = ultimo;


        System.out.println("El arreglo: ");

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
