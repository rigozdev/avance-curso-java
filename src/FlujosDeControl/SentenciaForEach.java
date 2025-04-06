package FlujosDeControl;

public class SentenciaForEach {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
    
        for(int numero: numeros){
            System.out.println("numero = " + numero);
        }


        String[] nombres  = {"Rodrigo", "Pepe", "Susan", "Nicole", "Génesis", "Marisol", "Mario", "Jaime"};

        int count = 1;
        for(String nombre: nombres){


            System.out.println(count + " nombre = " + nombre);
            count++;
        }
    }
}
