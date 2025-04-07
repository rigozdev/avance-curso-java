package DateCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);






        //FECHA NACIMIENTO
        try{
            System.out.println("Por favor ingresa tu fecha de nacimiento con el siguiente formato: yyyy-MM-dd");
            //HOY

            SimpleDateFormat formatoHoy = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaNac = formatoHoy.parse(scan.nextLine());
            Date diaHoy = new Date();

            //patron numerico //Este patron numerico no sé de dónde se lo sacó (PREGUNTAR CON CHATGPT)
            formatoHoy = new SimpleDateFormat("yyyyMMdd");

            int fNacimiento = Integer.parseInt(formatoHoy.format(fechaNac));
            int fActual = Integer.parseInt(formatoHoy.format(diaHoy));
            int edad =  (fActual - fNacimiento)/10000;






            System.out.println("La edad es " + edad);
        } catch (ParseException exception) {
            exception.printStackTrace();
        }
    }
}