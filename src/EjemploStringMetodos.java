public class EjemploStringMetodos {
    public static void main(String[] args) {


        String nombre = "Rodrigo";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.tuUpperCase()" + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase()" + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Rodrigo\") = " + nombre.equals("Rodrigo"));
        System.out.println("nombre.equals(\"Rodrigo\") = " + nombre.equals("rodrigo"));
        System.out.println("nombre.equalsIgnoreCase(\"Rodrigo\") = " + nombre.equalsIgnoreCase("rodrigo"));
        System.out.println("nombre.compareTo(\"Rodrigo\") = " + nombre.compareTo("Rodrigo"));
        System.out.println("nombre.compareTo(\"Rodrigo\") = " + nombre.compareTo("Rodrigo"));
        System.out.println("nombre.charAt() = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(4,6) = " + nombre.substring(4,6));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));
    
        
        //segunda parte
        
        String trabalengua = "trabalengua";
        System.out.println("trabalengua.replace(\"a\",\".\") = " + trabalengua.replace("a","."));
        System.out.println("trabalengua.indexOf('u') = " + trabalengua.indexOf('u'));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));
        System.out.println("trabalengua.indexOf(\"z\") = " + trabalengua.indexOf("z"));
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("t"));
        System.out.println("trabalengua.startsWith(\"tr\") = " + trabalengua.startsWith("tr"));
        System.out.println("trabalengua.endsWith(\"a\") = " + trabalengua.endsWith("a"));
        System.out.println("   trabalengua  ");
        System.out.println("   trabalengua  ".trim());
    }
}
