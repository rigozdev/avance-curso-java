package FlujosDeControl;

import java.util.Locale;

public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {


        String frase = "Ttrigores tristes tigres tragan trigo trigo trigo en un trigal trigo".toLowerCase(Locale.ROOT);
        String palabra = "trigo";

        int largoPalabra = palabra.length();
        int largoFrase = frase.length() - largoPalabra; //largo de la frase

        int cantidad = 0;
        char letra = 't';

        buscar:
        for(int i = 0; i <= largoFrase; i++){
            int k = i;
            for (int j = 0; j < largoPalabra; j++) {
                //consulta cada letra de la frase, si es distinta (a 't') continúa
                //"porque si son distintos no tiene sentido contabilizar
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }
        System.out.println("Encontrado " + cantidad + " veces la palabra " + palabra);
    }
}
