package Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {
    public static void arregloReverso(String[] arreglo){
        int totalCount2 = arreglo.length;
        int totalCount = arreglo.length;
        for(int i = 0; i < totalCount2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[totalCount-1 -i];
            arreglo[i] = inverso;
            arreglo[totalCount-1-i] = actual;
            totalCount2--;
        }
    }

    public static void main(String[] args) {
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};

        int totalArreglo = productos.length;
        int contador = 0;


        for(int i = 0; i <totalArreglo -1; i++){
            for(int j = 0; j < totalArreglo-1-i; j++){
                if(productos[j+1].compareTo(productos[j]) < 0){
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;

                }
                contador++;
            }
        }

        System.out.println("contador = " + contador);


        //arregloReverso(productos);
        //Esta implementación es lo mismo que se hizo arriba, pero viene
        //en el jdk de java
        //Collections.reverse(Arrays.asList(productos));


        Collections.reverse(Arrays.asList(productos));
        int totalCount = productos.length;
        for(int i = 0; i < totalCount; i++){
            System.out.println("Para indice " + i + ": "+ productos[i]);
        }

    }
}
