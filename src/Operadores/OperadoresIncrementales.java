package Operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {
        
        
        // Pre incremento
        int i = 1;
        int j = ++i; //i = i + 1;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // Post incremento
        
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // Pre decremento
        i = 3;
        j = --i; // i = i - 1 = 2

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        
        // Post decremento
        
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);
    }

    /* La clave del pre y post (incremento y decremento
    * es el valor al mostrase en ese "preciso momento"
    * en el pre incremento el valor se incrementa antes
    * de mostrarse y en el post el valor se incrementa luego
    * de mostrarse*/
}
