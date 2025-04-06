package FlujosDeControl;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }

                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

        System.out.println("\n=================================================");
        etiqueta:
        for (int i = 1; i <= 7; i++) {
            System.out.println();
            int j = 1;
            while (j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Día " + i + " de descanso!");
                    continue etiqueta;
                }
                System.out.println("Día: " + i + " Trabajando a las: " + j + " hrs.");
                j++;
            }


        }
    }
}
