package Operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 2;  //"i = i + 2"
        System.out.println("i = " + i);

        i += 5;  //i = i + 5;
        System.out.println("i = " + i);

        i -= 4;  //j = j - 4;
        System.out.println("j = " + j);
        
        i *= 3;  //j = j * 4;
        System.out.println("j = " + j);

        String sqlString = "select * from clientes c";
        sqlString += " where c.nombre='Andres'";
        sqlString += " and c.activo=1'";
        System.out.println("sqlString = " + sqlString);
    }
}
