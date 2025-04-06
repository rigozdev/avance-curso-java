package Operadores;

import java.util.Scanner;

public class SistemaEstanqueGasolina {
    public static void main(String[] args) {
        String estanqueLleno        = "Estanque: Lleno";
        String estanqueCasiLLeno    = "Estanque: Casi Lleno";
        String estanqueTresCuartos  = "Estanque: 3/4";
        String medioEstanque        = "Estanque: Medio.";
        String suficiente           = "Estanque: Suficiente";
        String insuficiente         = "Estanque: Insuficiente";
        String mensaje              = "";

        double litros               = 0;


        Scanner scan = new Scanner(System.in);


        System.out.println("Por favor ingrese la cantidad actual de litros del estanque.");
        litros = scan.nextDouble();

        mensaje =   (litros == 70) ? estanqueLleno :
                    (litros >= 60 && litros < 70) ? estanqueCasiLLeno:
                    (litros >= 40 && litros < 60) ? estanqueTresCuartos:
                    (litros >= 35 && litros < 40) ? medioEstanque:
                    (litros > 20 && litros < 35) ? suficiente : insuficiente;

        System.out.println(mensaje);


        scan.close();
    }
}
