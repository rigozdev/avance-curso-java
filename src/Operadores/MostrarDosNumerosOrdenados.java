package Operadores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MostrarDosNumerosOrdenados {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num1 = 0, num2 = 0;


        try {
            System.out.println("Ingrese el primero número.");
            num1 = scan.nextDouble();
        } catch (InputMismatchException exception){
            System.out.println("Por favor ingrese números.");
            main(args);
        }

        try {
            System.out.println("Ingrese el segundo número.");
            num2 = scan.nextDouble();
        } catch (InputMismatchException exception){
            System.out.println("Por favor ingrese números.");
            main(args);
        }

        String orden = "";
        orden = (num1 > num2) ? "Orden\n1.- " + num1 +"\n2.- " + num2 : "Orden\n1.- " + num2 +"\n2.- " + num1;

        System.out.println(orden);
        scan.close();
        System.exit(0);
    }
}
