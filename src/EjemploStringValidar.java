public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);


        //el metodo concat se debe usar cuando la variable a usar
        //está instanciada porque si es null dará error constantemente
        //y se caerá

        if(esNulo){
            curso = " ";
        }

        boolean esVacio = curso.length()==0;


        System.out.println("esVacio = " + esVacio);
        
        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        if(!esBlanco){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

    }
}
