package FlujosDeControl;

import javax.swing.*;

public class SentenciaForArregloJava {
    public static void main(String[] args) {


        String [] nombres  = {"Rodrigo", "Pepe", "Susan", "Nicole", "Génesis", "Marisol", "Mario", "Jaime"};
        int count = nombres.length;
        for (int i = 0; i <  count; i++){
            if (nombres[i].contains("rodrigo".toLowerCase()) ||
                    nombres[i].contains("Pepa".toLowerCase())){
                continue;
            }

            System.out.println(i + ".- " +nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingresa un nombre, ejempli \"pepe\" o \"maría\" ");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;

        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres[i] = " + nombres[i]);
        }

        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
        }else{
            JOptionPane.showMessageDialog(null, buscar + "no existe en el sistema");
        }
    }
}
