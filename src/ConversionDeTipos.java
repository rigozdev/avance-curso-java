public class ConversionDeTipos {
    public static void main(String[] args) {

        //Conversiones de String a otro primitivo
        String numero = "50";

        int numeroInt = Integer.parseInt(numero);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "98765.43";
        
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);


        String logicoStr = "false";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);

        System.out.println("logicoBoolean = " + logicoBoolean);

        //Conversiones de primitivo a String

        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);

        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        otroNumeroStr = String.valueOf(otroNumeroInt + 10);

        System.out.println("otroNumeroStr valueOf = " + otroNumeroStr);
        
        
        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);

        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);
    }
}
