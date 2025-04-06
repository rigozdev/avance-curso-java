import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String familiar1 = "";
        String familiar2 = "";
        String familiar3 = "";

        System.out.println("Ingrese el nombre de familiar 1");
        familiar1 = scanner.nextLine();
        String inicialFamiliar1 = familiar1.substring(1, 2).toUpperCase();
        String terminalesFamiliar1 = familiar1.substring(familiar1.length()-2,familiar1.length());

        System.out.println("Ingrese el nombre de familiar 2");
        familiar2 = scanner.nextLine();
        String inicialFamiliar2 = familiar2.substring(1, 2).toUpperCase();
        String terminalesFamiliar2 = familiar2.substring(familiar2.length()-2,familiar2.length());

        System.out.println("Ingrese el nombre de familiar 3");
        familiar3 = scanner.nextLine();
        String inicialFamiliar3 = familiar3.substring(1, 2).toUpperCase();
        String terminalesFamiliar3 = familiar3.substring(familiar3.length()-2,familiar3.length());



        String f1 = inicialFamiliar1.concat(".".concat(terminalesFamiliar1));
        String f2 = inicialFamiliar2.concat(".".concat(terminalesFamiliar2));
        String f3 = inicialFamiliar3.concat(".".concat(terminalesFamiliar3));

        String texto = f1+"_"+f2+"_"+f3;
        System.out.println(texto);



        scanner.close();
    }
}
