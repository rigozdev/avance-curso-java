package ClaseSystem;

import java.util.Scanner;

public class TareaAreaCirculo
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in);

        System.out.println("Ingresa el radio del circulo para calcular su área");


        double areaCirculo = 0;
        double radioIngresado = scan.nextDouble();

        areaCirculo = Math.PI*Math.pow(radioIngresado, 2);

        System.out.println("El área del circulo es: " + areaCirculo);
    }
}
