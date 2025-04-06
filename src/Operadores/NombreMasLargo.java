package Operadores;

import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String persona1 = "", persona2 = "", persona3 = "";
        String[] nombre1 = {"", ""};
        String[] nombre2 = {"", ""};
        String[] nombre3 = {"", ""};

        double largoNombre1 = 0, largoNombre2 = 0, largoNombre3 = 0;
        String textoNombreMasLargo = " tiene el nombre más largo.";
        String nombreMasLargo = "";

        String textoBienvenida = "Ingrese el nombre y apellido del familiar ";

        JOptionPane.showMessageDialog(null, textoBienvenida.concat("nro 1"));
        persona1 = JOptionPane.showInputDialog("").trim();
        nombre1 = persona1.split(" ");

        JOptionPane.showMessageDialog(null, textoBienvenida.concat("nro 2"));
        persona2 = JOptionPane.showInputDialog("").trim();
        nombre2 = persona2.split(" ");

        JOptionPane.showMessageDialog(null, textoBienvenida.concat("nro 3"));
        persona3 = JOptionPane.showInputDialog("").trim();
        nombre3 = persona3.split(" ");

        largoNombre1 = nombre1[0].length();
        largoNombre2 = nombre2[0].length();
        largoNombre3 = nombre3[0].length();


        nombreMasLargo =    largoNombre1 > largoNombre2 ? persona1.concat(" con "+largoNombre1+ " letras") :
                            largoNombre2 > largoNombre3 ? persona2.concat(" con "+largoNombre2+ " letras") :
                            largoNombre3 > largoNombre1 ? persona3.concat(" con "+largoNombre3+ " letras"):
                            persona1.concat(" con "+largoNombre1 + " letras");

        JOptionPane.showMessageDialog(null, nombreMasLargo.concat(textoNombreMasLargo));

    }
}
