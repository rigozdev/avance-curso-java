package Arreglos;

import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[12];
        String histo = "*";

        // ingresamos los datos por ejemplo {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
        System.out.println("Ingrese un numero de 1 a 6: ");
        for (int i = 0; i <= arreglo.length-1; i++) {
            System.out.print(i+1 + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // creamos un segundo arreglo llamado arregloCantidadValores (de igual largo)
        // para guardar las cantidades de veces que se repite cada elemento
        // del arreglo principal
        int[] arregloCantidadValores = new int[12];

        // luego llenamos este segundo arreglo con las cantidades de ocurrencia
        // de los elementos del primer arreglo
        for (int i = 0; i < arreglo.length; i++) {
            int cantidad = 0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    cantidad++;
                }
            }
            arregloCantidadValores[i] = cantidad;
        }

        for (int i = 0; i < arregloCantidadValores.length-1; i++) {
            if(arreglo[i] != arreglo[i+1]){
                System.out.println(arreglo[i] + " : " + "*".repeat(arregloCantidadValores[i]));
            }

        };
    }
}
