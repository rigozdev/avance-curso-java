package Matrices;

public class EjemploMatrices {
    public static void main(String[] args) {
        int[][] numeros = new int[2][4];

        System.out.println("Números de filas: " + numeros.length);
        System.out.println("Números de columnas: " + numeros[0].length);

        System.out.println("Primer elemento de la matiz: " + numeros[0][0]);
        System.out.println("Último elemento: " + numeros[numeros.length-1][numeros[1].length-1]);
    }
}
