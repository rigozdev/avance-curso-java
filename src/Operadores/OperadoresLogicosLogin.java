package Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        // Arreglos

        String[] usernames = { "rodrigo", "admin", "susan"};
        String[] passwords = {"1324", "1234", "12345"};

        /*
        usernames[0] = "rodrigo";
        passwords[0] = "1324";

        usernames[1] = "admin";
        passwords[1] = "12345";
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username.");
        String u = scanner.nextLine();

        System.out.println("Ingrese el password.");
        String p = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){

            esAutenticado = (((usernames[i].equals(u.trim()) && passwords[i].equals(p.trim())))) ? true : esAutenticado;

            /*if(((usernames[i].equals(u.trim()) && passwords[i].equals(p.trim())))){
                esAutenticado = true;
                break;
            }*/
        }


        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") :
                "Usuario o contraseña incorrectos. \nLo sentimos, requiere autenticación.";
        /*if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else{
            System.out.println("Usuario o contraseña incorrectos.");
            System.out.println("Lo siento, requiere autenticación.");
        }*/
        System.out.println(mensaje);
        scanner.close();
    }
}
