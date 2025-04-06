public class SistemasNumericos {
    public static void main(String[] args) {

        //Número decimal
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));


        //Número binario
        int numeroBinario = 0b111110100;    //anteponiendo al numero binaro "0b" java entenderá
                                            //que se trata de un número binario
        System.out.println("numeroBinario = " + numeroBinario);


        //Número Octal
        System.out.println("numero octal de = " + numeroDecimal + " = "+ Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764; //anteponiendo al numero "0" java entenderá
                                //que se trata de un número octal
        System.out.println("numeroOctal = " + numeroOctal);

        //Sistema hexadecimal
        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4;  //anteponiendo al numero "0x" java entenderá
                                //que se trata de un número hexadecimal (puede ser en mayúsculas o minúsculas)
        System.out.println("numeroHex = " + numeroHex);

    }
}
