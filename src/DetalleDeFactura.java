import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura.");
        String nombreFactura = scanner.nextLine();

        System.out.println("Ingrese el precio del producto 1.");
        double producto1 = 0;
        double producto2 = 0;
        try {
            producto1 = scanner.nextDouble();
        }catch (InputMismatchException exception){
            System.out.println("Por favor ingrese números en el precio.");
            main(args);
        }


        System.out.println("Ingrese el precio del producto 2.");
        try {
            producto2 = scanner.nextDouble();
        }catch (InputMismatchException exception){
            System.out.println("Por favor ingrese números en el precio.");
            main(args);
            System.exit(0);
        }


        double totalBruto = producto2 + producto1;

        double totalImpuesto = totalBruto * 0.19;

        double totalConImpuesto = totalBruto + totalImpuesto;



        String mensaje = "La factura " + nombreFactura + " tiene un total bruto de $" + totalBruto + ", con un impuesto de $" + totalImpuesto + " y el monto después de impuesto es de $" + totalConImpuesto;

        System.out.println(mensaje);
        scanner.close();
        System.exit(0);
    }
}
