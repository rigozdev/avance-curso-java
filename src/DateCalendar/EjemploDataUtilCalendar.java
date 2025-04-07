package DateCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploDataUtilCalendar {

    
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        //calendario.set(2025, 03, 13, 9, 13);

        calendario.set(Calendar.YEAR, 2025);
        calendario.set(Calendar.MONTH, Calendar.APRIL);
        calendario.set(Calendar.DAY_OF_MONTH, 13);

        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd 'de' MMMM 'del' yyyy");
        String fechaFormateada = sdf.format(fecha);
        System.out.println("fechaFormateada = " + fechaFormateada);
    }

}
