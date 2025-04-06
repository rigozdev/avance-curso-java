package FlujosDeControl.Actividades;

import java.util.Scanner;

public class NumeroMenorMultiplesValores {
    public static void main(String[] args) {
        int cantMin = 10;
        int cantIngresada = 0;
        int nroIngresado = 0;
        Scanner scan =  new Scanner(System.in);


        int minimo = Integer.MAX_VALUE;


        while(cantIngresada < cantMin){
            System.out.println("Por favor ingrese un número igual o mayor a 10");
            cantIngresada = scan.nextInt();
        }
        System.out.println("Usted ha decidido ingresar " + cantIngresada + " números.");

        for (int i = 0; i < cantIngresada; i++){
            System.out.println("Ingrese el número " + (i+1));
            nroIngresado = scan.nextInt();

            minimo = (nroIngresado < minimo) ? nroIngresado : minimo;
        }


        if (minimo < cantMin){
            System.out.println("El número mínimo es: " + minimo + "\n El número es menor a 10!");
        } else {
            System.out.println("El número mínimo es: " + minimo + "\n El número es mayor a 10!");
        }
        System.out.println(minimo);


    }
}
