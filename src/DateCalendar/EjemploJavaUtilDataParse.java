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
        } catch (ParseException exception) {
            exception.printStackTrace();
        }
    }
}
