public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_image.js";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring() = " + archivo.substring(i+1));
    }
}
