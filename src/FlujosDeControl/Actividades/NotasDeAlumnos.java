package FlujosDeControl.Actividades;

import java.util.Scanner;

public class NotasDeAlumnos {
    public static void main(String[] args) {
        int cantMinimaNotas = 20;
        int cantIngresada = 0;
        int totalMenorCuatro = 0;
        int totalMayorCinco = 0;
        double mayorQueCinco = 0;
        double menorQueCuatro = 0;

        double nota = 0;
        double promedioTotal = 0.0;

        Scanner scan = new Scanner(System.in);

        while (cantIngresada < cantMinimaNotas) {
            System.out.println("Por favor ingrese un número igual o mayor a " + cantMinimaNotas);
            cantIngresada = scan.nextInt();
        }

        for (int i = 0; i < cantMinimaNotas; i++) {
            System.out.println("Ingresa la nota nro " + (i + 1));
            nota = scan.nextDouble();
            if (nota == 0) {
                System.out.println("Error, ha ingresado una nota que no está en el rango, vuelva a ingresar.");
                break;
            }

            promedioTotal += nota;

            if (nota >= 5) {
                mayorQueCinco += nota;
                totalMayorCinco++;
            }

            if (nota <= 4) {
                menorQueCuatro += nota;
                totalMenorCuatro++;
            }
        }

        menorQueCuatro = menorQueCuatro / totalMenorCuatro;
        mayorQueCinco = mayorQueCinco / totalMayorCinco;
        promedioTotal = promedioTotal / cantIngresada;

        System.out.println("Promedio Menor a 4: " + menorQueCuatro);
        System.out.println("Promedio Mayor a 5: " + mayorQueCinco);
        System.out.println("Promedio Total: " + promedioTotal);
    }
}
