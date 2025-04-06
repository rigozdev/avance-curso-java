package Operadores;

public class PresedenciaOperadores {
    public static void main(String[] args) {
        int i = 14, j = 8, k = 20;

        double promedio = (i + j + k) / 3d;
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / 3d * 10; // 14 + 8 + 66.6
        System.out.println("promedio = " + promedio);
        
        // Los resultados pueden variar mucho producto del uso (o no) de paréntesis
        
        promedio = ++i + j-- + k / 3d * 10;

        System.out.println("promedio = " + promedio);

        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
