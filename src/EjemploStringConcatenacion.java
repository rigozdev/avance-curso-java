public class EjemploStringConcatenacion {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println("Debido a la precedencia de un String, asume que será \nuna concatenación la instrucción y no una suma. \nSe evalúa de izq. a derecha");
        System.out.println("");
        System.out.println(detalle + numeroA + numeroB);

        System.out.println(detalle + (numeroA + numeroB));

        //como concat es de la clase String (un metodo) lo que hace es retornar
        //un nuevo String y no altera ninguno de los dos utilizados
        System.out.println(curso.concat(profesor));
        
        
        String detalle2 = curso.concat(" con ".concat(profesor));
        System.out.println("detalle2 = " + detalle2);

    }
}
