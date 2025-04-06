package Wrappers;

public class WrapperInteger {
    public static void main(String[] args) {


        Integer intObjeto = Integer.valueOf(22768);// forma explicita (boxing)
        System.out.println("intObjeto = " + intObjeto);
        Integer intObjeto2 = 20; // forma implicita (autoboxing)
        System.out.println("intObjeto2 = " + intObjeto2);

        //Pasar de primitivo a objeto
        int intPrimitivo = 40;
        Integer intObjeto3 = Integer.valueOf(intPrimitivo);
        System.out.println("intObjeto3 = " + intObjeto3);


        int num = intObjeto;
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "670000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = 32767;
        System.out.println("shortObjeto = " + shortObjeto);
        
        Short shortObjeto1 = intObjeto.shortValue();
        System.out.println("shortObjeto1 = " + shortObjeto1);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);
        
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

        /* Es muy complejo cambiar tipos de valores de tipos de valores
         más grandes a tipos de valores más pequeños porque la perdida de
         información no quiere decir que si el número es más extenso que
         lo que el la clase puede aceptar se cortará de forma que se mantenga
         un valor similar sino que al perder información mostrará un valor
         complegamente ambiguo y distinto, puede hasta cambiar la positividad
         del valor. Pero cambiar el tipo de datos hacia arriba no debería
         cambiar nada
         *
         */

    }

}
