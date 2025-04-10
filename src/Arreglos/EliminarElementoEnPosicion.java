package Arreglos;

import java.util.Scanner;

public class EliminarElementoEnPosicion {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.println("Ingrese un número:");
            a[i] = scan.nextInt();
        }

        System.out.println("Ingrese una posición a eliminar entre 0 - 9");
        int posicion = scan.nextInt();


        /*
        * el indice se da por la posicion del arreglo dado, */
        for(int i = posicion; i < a.length -1; i++){
            a[i] = a[i+1];
        }

        //Se crea un arreglo nuevo basado en el largo del primer arreglo
        int[] b = new int [a.length-1];

        //el arraycopy toma un objeto (en este caso arreglo o matriz de origen),
        //el indice de la matriz de origen, la matriz de destino, el indice incial
        //de la matriz de destino y la cantidad de elementos que deben copiarse
        System.arraycopy(a, 0, b,0, b.length);

        for(int i = 0; i < b.length; i++){
            System.out.println(i+": " + a[i]);
        };

    }
}
