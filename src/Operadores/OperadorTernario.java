package Operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //variable = condicion ? [si es verdadero] : [si es falso];

        String variable = 7 == 4 ? "Si, es verdadero": "No, es falso";
        //System.out.println("variable = " + variable);


        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        System.out.println("Ingrese las notas de matemáticas entre 2.0 y 7.0");
        matematicas = scanner.nextDouble();

        System.out.println("Ingrese las notas de ciencias entre 2.0 y 7.0");
        ciencias = scanner.nextDouble();

        System.out.println("Ingrese las notas de historia entre 2.0 y 7.0");
        historia = scanner.nextDouble();




        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);


        estado = promedio >= 5.49 ? "Aprobado": "Rechazado";
        System.out.println("estado = " + estado);

        /*if(promedio >= 5.49){
            estado = "Aprobado";
        }else{
            estado = "Rechazado";
        }*/

        scanner.close();
    }
}
