public class HolaMundo {

    public static void main(String[] args) {

        String saludar = "Hola mundo desde Java";

        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;

        System.out.println("numero = " + numero);

        boolean valor = true;

        int numero2 = 0;

        System.out.println("numero2 antes de if = " + numero2);

        if (valor){

            numero2 = 20;

            System.out.println("numero2 en if = " + numero2);
        }

        System.out.println("numero2 fuera if = " + numero2);

        var numero3 = "15";

        String nombre;

        nombre = "Rodrigo";

        if (numero > 10){
            nombre = "Ignacio";
        }


    }

}
