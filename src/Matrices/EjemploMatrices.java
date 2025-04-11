package Matrices;

public class EjemploMatrices {
    public static void main(String[] args) {
        /*
         * En las matrices el primer conjunto de corchetes [] hace referencia a las filas y
         * el segundo conjunto de corchetes a la fila en cada una de ellas
         * int [][] numeros = new int[2][4]
         *                     [2]filas|[4]columnas
         * int [][] numeros = new int [filas][columnas]
         * las variables de matrices se escriben en plural siempre
         * - Las matrices se recorren con dos for, uno para la fila y otro para las columnas
         *   de la fila
         * */


        int[][] numeros = new int[2][4];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        System.out.println("Números de filas: " + numeros.length);
        System.out.println("Números de columnas: " + numeros[0].length);

        System.out.println("Primer elemento de la matiz: " + numeros[0][0]);
        System.out.println("Último elemento: " + numeros[numeros.length-1][numeros[1].length-1]);

        int num1 = numeros[0][0];
        int num2 = numeros[0][1];
        int num3 = numeros[0][2];
        int num4 = numeros[0][3];
        int num5 = numeros[1][0];
        int num6 = numeros[1][1];
        int num7 = numeros[1][2];
        int num8 = numeros[1][3];

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);
        
    }
}
