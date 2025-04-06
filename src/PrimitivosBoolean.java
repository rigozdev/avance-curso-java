public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        //Para evaluar condiciones

        double d = 98765.43e-3; //98.76543
        System.out.println("d = " + d);

        float f = 1.2345e2f;     //123.45
        System.out.println("f = " + f);

        datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-3 == 1); // 3-3 == 0 (false)
        System.out.println("esIgual = " + esIgual);
        
        
    }
}
