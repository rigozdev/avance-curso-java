import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Ingreso de número decimal
        System.out.println("Ingrese un número entero");

        int numeroDecimal = 0;

        try {
            numeroDecimal = scanner.nextInt();
        } catch (InputMismatchException exception){
            System.out.println("Error! \nDebe ingresar un número entero.");
            main(args);
            System.exit(0);
        }


        //Número binario
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        int numeroBinario = 0b111110100;    //anteponiendo al numero binario "0b" java entenderá
        //que se trata de un número binario


        //Número Octal
        String resultadoOctal = "numero octal de = " + numeroDecimal + " = "+ Integer.toOctalString(numeroDecimal);
        int numeroOctal = 0764; //anteponiendo al numero "0" java entenderá
        //que se trata de un número octal


        //Sistema hexadecimal
        String resultadoHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        int numeroHex = 0x1f4;  //anteponiendo al numero "0x" java entenderá
        //que se trata de un número hexadecimal (puede ser en mayúsculas o minúsculas)



        // Mensaje de salida con JOptionPane.showMessageDialog() => esto es propio de Java Swing
        String mensaje  = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;
        System.out.println(mensaje);
        scanner.close();
    }
}
