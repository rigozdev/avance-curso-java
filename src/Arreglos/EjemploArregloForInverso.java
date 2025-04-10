package Arreglos;

import java.util.Arrays;

public class EjemploArregloForInverso {
    public static void main(String[] args) {
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};

        int totalCount = productos.length;

       /* productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";*/

        System.out.println("=========Usando For Inverso==========");
        Arrays.sort(productos);
        for(int i = 0; i < totalCount; i++){
            System.out.println("Para indice " + i + ": "+ productos[i]);
        }

        for(int i = 0; i <totalCount; i++){
            System.out.println("Para i = " + (totalCount-1-i) + " valor: " + productos[totalCount-1-i]);
        }



        System.out.println("=========Usando For Inverso 2==========");

        for(int i = totalCount-1; i >=0; i--){
            System.out.println("Para i = " + i + " valor: " + productos[i]);
        }
    }
}
