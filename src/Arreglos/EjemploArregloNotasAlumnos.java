package Arreglos;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMatematicas, claseHistoria, claseLenguaje;

        int sumaNotasMatematicas = 0, sumaNotasHistoria = 0, sumaNotasLenguaje = 0;

        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudiantes para matemáticas");
        for (int i = 0; i < claseMatematicas.length; i++){
            claseMatematicas[i] = scan.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia");
        for (int i = 0; i < claseHistoria.length; i++){
            claseHistoria[i] = scan.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++){
            claseLenguaje[i] = scan.nextDouble();
        }

        for(int i = 0; i < 7; i++){
            sumaNotasMatematicas += claseMatematicas[i];
            sumaNotasHistoria += claseHistoria[i];
            sumaNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematica = (sumaNotasMatematicas/claseMatematicas.length);
        double promedioHistoria = (sumaNotasHistoria/claseHistoria.length);
        double promedioLenguaje = (sumaNotasLenguaje/claseLenguaje.length);
        System.out.println("Promedio clase matemáticas: " + promedioMatematica);
        System.out.println("Promedio clase historia: " + promedioHistoria);
        System.out.println("Promedio clase lenguaje: " + promedioLenguaje);

        double promedioTotal = (promedioLenguaje + promedioHistoria + promedioMatematica)/3;
        System.out.println("Promedio total del curso: " + promedioTotal);


        System.out.println("Ingrese el identificador del alumno (de 0 - 6):");
        int id = scan.nextInt();
        double promedioAlumno = (claseMatematicas[id] + claseHistoria[id] + claseMatematicas[id])/3;
        System.out.println("promedio alumno Nro" + id + ": " + promedioAlumno);
    }

}
