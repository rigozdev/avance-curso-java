package DateCalendar;


import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);


        // SUPER UTIL PARA DAR FORMATO A FECHA Y HORA
        // SimpleDateFormat
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM 'del' yyyy / H:m:s:S");
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");

        String fechaStr = df.format(fecha);
        String fechaStr2 = df2.format(fecha);
        System.out.println("fechaStr2 = " + fechaStr2);
        System.out.println("fechaStr = " + fechaStr);

        long j = 0;
        for(int i = 0; i < 10000000; i++){
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempoFinal = " + tiempoFinal);
    }
}
