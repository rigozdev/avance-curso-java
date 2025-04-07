package ValorReferencia;


class Persona{
    private String nombre;

    public void modificarNOmbre(String nuevoNombre){
        this.nombre = nuevoNombre;
        //this.nombre hace referencia a que es de la clase
        //nuevoNombre (que está al lado) es el parámetro
        //Si son distintos los nombres se puede entender que nombre (atributo) es distinto
        //del parametro y no es necesario 'this.'

    }

    public String leerNombre(){
        return this.nombre;
    }
}


public class PasarPorReferencia2 {
    public static void main(String[] args) {



        Persona persona = new Persona();
        persona.modificarNOmbre("Rodrigo");

        System.out.println("iniciamos el método main");
        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Después de llamar al método test");

        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("Finaliza el método main con los datos de la persona modificados!");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el método test ");
        persona.modificarNOmbre("Pepe");
        System.out.println("Finaliza el método test ");
    }
}
