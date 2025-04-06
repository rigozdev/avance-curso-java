package FlujosDeControl;

public class TestEjem {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);       // true 😮 (porque está en el rango cacheado)
        System.out.println(a.equals(b));  // true ✅

        Integer x = 1000;
        Integer y = 1000;
        System.out.println(x == y);       // false ❌ (no están en el rango cacheado)
        System.out.println(x.equals(y));  // true ✅




       /* 🧠 ¿Por qué a == b da true en el primer caso y false en el segundo?
                Java tiene una caché interna para los objetos Integer del rango
                -128 a 127. Si creas un Integer con un valor dentro de ese rango
                usando valueOf() (o por autoboxing), Java te da el mismo objeto.

        Pero si es fuera de ese rango (como 1000), Java crea un nuevo objeto, y por eso == da false.
    */

        int c = 200;
        int d = 200;
        System.out.println(c==d);
        //System.out.println(c.equals(d));

        /*Tipo de dato	    | ¿Usar ==?	        | ¿Usar .equals()?
          Primitivos	    |   ✅ Sí	        |   ❌ No permitido
        Objetos (Integer)	|  ⚠️ Con cuidado  	|   ✅ Recomendado
        */
    }
}
