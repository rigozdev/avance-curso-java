package Operadores;

import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 6, j = 2, suma = i + j, resta = i - j, multi = i * j, div = i / j;
        int resto = i % j;

        float div2 = (float)i / (float)j;

        System.out.println("suma = " + suma);
        System.out.println("(i + j) = " + (i + j));

        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));

        System.out.println("multiplicación = " + multi);
        System.out.println("(i * j) = " + (i * j));

        System.out.println("división = " + div);
        System.out.println("división 2 (con decimal) = " + div2);
        System.out.println("(i / j) = " + (i / j));

        System.out.println("resto = " + resto);
        System.out.println("(i % j) = " + (i % j));
        

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        String mensaje = "";
        if (numero % 2 == 0){
            mensaje = "Número par = " + numero;
            JOptionPane.showMessageDialog(null, mensaje );
        }else{
            mensaje = "Número impar = " + numero;
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}
