package Arreglos;

import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[7];
        double contPostivo = 0;
        double sumaPostivo = 0;
        double contNegativo = 0;
        double sumaNegativo = 0;
        double contCero = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingrese el nro " +(i+1));
            arr[i] = sc.nextDouble();

        }

        System.out.println("Arreglo");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                contPostivo++;
                sumaPostivo+=arr[i];
            } else if (arr[i] < 0){
                contNegativo++;
                sumaNegativo-=arr[i];
            }else{
                contCero++;
            }
        }

        double promedioPositivo = sumaPostivo / contPostivo;
        double promedioNegativo = sumaNegativo / contNegativo;


        System.out.println("Promedio positivo: " + promedioPositivo);
        System.out.println("Promedio negativo: " + promedioNegativo);
        System.out.println("Cantidad de 0: " + contCero);

    }
}
