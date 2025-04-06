import javax.swing.*;

public class SistemasNumericosSwing {
    public static void main(String[] args) {
        // Ingreso de número decimal
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException exception){
            JOptionPane.showMessageDialog(null, "Error! \nDebe ingresar un número entero.");
            main(args);
            System.exit(0);
        }


        //Número binario
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        int numeroBinario = 0b111110100;    //anteponiendo al numero binario "0b" java entenderá
                                            //que se trata de un número binario


        //Número Octal
        String resultadoOctal = "numero octal de = " + numeroDecimal + " = "+ Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 0764; //anteponiendo al numero "0" java entenderá
                                //que se trata de un número octal


        //Sistema hexadecimal
        String resultadoHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexa);
        int numeroHex = 0x1f4;  //anteponiendo al numero "0x" java entenderá
                                //que se trata de un número hexadecimal (puede ser en mayúsculas o minúsculas)



        // Mensaje de salida con JOptionPane.showMessageDialog() => esto es propio de Java Swing
        String mensaje  = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
