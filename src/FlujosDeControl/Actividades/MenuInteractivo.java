package FlujosDeControl.Actividades;

import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {

        int opcIndice = 0;

        String mensaje = "";

        Scanner scan = new Scanner(System.in);



        do {

            System.out.println("Seleccione una opción,Mantenedor de productos");
            System.out.println("Opción 1 Actualizar");
            System.out.println("Opción 2 Eliminar");
            System.out.println("Opción 3 Agregar");
            System.out.println("Opción 4 Listar");
            System.out.println("Opción 5 Salir");

            opcIndice = scan.nextInt();

            switch (opcIndice){
                case 1:
                    mensaje = "Usuario actualizado con éxito";
                    System.out.println(mensaje);
                    break;
                case 2:
                    mensaje = "Usuario eliminado con éxito";
                    System.out.println(mensaje);
                    break;
                case 3:
                    mensaje = "Usuario agregado con éxito";
                    System.out.println(mensaje);
                    break;
                case 4:
                    mensaje = "Usuario listado con éxito";
                    System.out.println(mensaje);
                    break;
                case 5:
                    System.out.println("Haz salido con éxito!");
                    break;
            }


        } while (opcIndice!=5);





    }
}
