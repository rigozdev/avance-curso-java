package Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

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


        arregloReverso(productos);

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
