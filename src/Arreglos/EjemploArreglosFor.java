package Arreglos;

import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {
        String[] productos = new String[7];

        int totalCount = productos.length;

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        System.out.println("=========Usando For==========");
        Arrays.sort(productos);
        for(int i = 0; i < totalCount; i++){
            System.out.println("Para indice " + i + ": "+ productos[i]);
        }


        System.out.println("=========Usando ForEach==========");
        for (String prod: productos){
            System.out.println("prod = " + prod);
        }

        int i = 0;
        System.out.println("=========Usando While==========");
        while(i < totalCount ){
            System.out.println("Para indice " + i + ": "+ productos[i]);
            i++;
        }

        System.out.println("=========Usando Do While==========");


        int j = 0;
        do{
            System.out.println("Para indice " + j + ": "+ productos[j]);
            j++;
        } while(j < totalCount );

        int[] numeros = new int[10];

        int totalNumeros = numeros.length;
        for(int k = 0; k < totalNumeros; k++){
            numeros[k] = k*3;
        }
        for(int k = 0; k < totalNumeros; k++){
            System.out.println("numeros[k] = " + numeros[k]);
        }
    }
}
