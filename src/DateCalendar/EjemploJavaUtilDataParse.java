package DateCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDataParse {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con formato yyyy-MM-dd");
        try{

            Date fecha = format.parse(scan.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
            
            Date fecha2 = new Date();
            
            if(fecha.after(fecha2)){
                System.out.println("Fecha es mayor que la fecha actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha es anterior que fecha 2 (Hoy)");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha es igual que fecha 2");
            }

            if(fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha (del usuario) es después que fecha 2 (actual)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha es anterior que fecha 2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Fecha es igual que fecha2");
            }


        } catch (ParseException exception) {
            exception.printStackTrace();
        }
    }
}
