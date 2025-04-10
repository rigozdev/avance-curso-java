package Arreglos;

import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {
        // Declaramos los arreglos:
        // 'a' para guardar los números ingresados
        // 'pares' e 'impares' para separar los valores según su tipo
        int[] a, pares, impares;

        // Inicializamos contadores para saber cuántos pares e impares hay
        int totalPares = 0, totalImpares = 0;

        // Inicializamos el arreglo 'a' para guardar 10 números
        a = new int[10];

        // Creamos el Scanner para leer datos del usuario
        Scanner scan = new Scanner(System.in);

        // Pedimos al usuario que ingrese los 10 números
        System.out.println("Ingrese 10 numeros");
        for(int i = 0; i < a.length; i++){
            a[i] = scan.nextInt(); // Guardamos cada número en la posición correspondiente
        }

        // Recorremos el arreglo para contar pares e impares
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                totalPares++; // Si el número es par, aumentamos el contador de pares
            } else {
                totalImpares++; // Si es impar, aumentamos el contador de impares
            }
        }

        // Creamos los arreglos 'pares' e 'impares' con el tamaño exacto según los contadores
        pares = new int[totalPares];
        impares = new int[totalImpares];

        // Usamos dos índices para rellenar los arreglos 'pares' y 'impares'
        int j = 0; // índice para pares
        int k = 0; // índice para impares

        // Recorremos el arreglo original nuevamente para distribuir los valores
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                pares[j++] = a[i]; // Almacenamos en 'pares' y avanzamos el índice j
            } else {
                impares[k++] = a[i]; // Almacenamos en 'impares' y avanzamos el índice k
            }
        }

        // Imprimimos los números pares
        System.out.println("Pares");
        for(int i = 0; i < pares.length; i++){
            System.out.println(pares[i] + " ");
        }

        // Imprimimos los números impares
        System.out.println("\r\nImpares");
        for(int i = 0; i < impares.length; i++){
            System.out.println(impares[i] + " ");
        }

        // Línea en blanco opcional
        System.out.println();
    }
}