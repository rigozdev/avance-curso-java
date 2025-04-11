package Matrices;

public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {


        String [][] nombres = {{"Pepa", "Pepe"}, {"Josefa", "Paco"}, {"Lucas", "Pancha"}};

        System.out.println("Iterando foreach: ");

        for(String[] fila:nombres){
            for(String nombre: fila){
                System.out.println(nombre +"\t");
            }
            System.out.println();
        }
    }
}
