/*
 * EJERCICIO:
 * Crea dos variables utilizando los objetos fecha (date, o semejante) de tu lenguaje:
 * - Una primera que represente la fecha (día, mes, año, hora, minuto, segundo) actual.
 * - Una segunda que represente tu fecha de nacimiento (te puedes inventar la hora).
 * Calcula cuántos años han transcurrido entre ambas fechas.
 *
 * DIFICULTAD EXTRA (opcional):
 * Utilizando la fecha de tu cumpleaños, formatéala y muestra su resultado de
 * 10 maneras diferentes. Por ejemplo:
 * - Día, mes y año.
 * - Hora, minuto y segundo.
 * - Día de año.
 * - Día de la semana.
 * - Nombre del mes.
 * (lo que se te ocurra...)
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Four {
    public static int Dif(){
        LocalDate fecha_actual = LocalDate.now();
        LocalDate bornDate = LocalDate.of(1999, 11, 30);

        Period periodo = Period.between(bornDate,fecha_actual);

        return periodo.getYears();
    }

    public static void main(String[] args) {
        System.out.println(Dif()+" años");
        LocalDate bornDate = LocalDate.of(1999, 11, 30);
        LocalDateTime bornDateTime = bornDate.atTime(4, 25, 45);
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE, d 'de' MM 'de' yyyy ");
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatoYear = DateTimeFormatter.ofPattern("yyyy");
        DateTimeFormatter formatoTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        DateTimeFormatter formatoTimeAMPM = DateTimeFormatter.ofPattern("'Las' HH:mm:ss a");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm a");


        System.out.println(1+".-" + bornDate.format(formatoLargo));
        System.out.println(2+".-" + bornDate.format(formatoCorto));
        System.out.println(3+".-" + bornDate.format(formatoYear));
        System.out.println(4+".-" + bornDateTime.format(formatoTime));
        System.out.println(5+".-" + bornDateTime.format(formatoTimeAMPM));
        System.out.println(6+".-" + bornDate.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("Es")));
        System.out.println(7+".-" + bornDate.getDayOfYear());
        System.out.println(8+".-" + bornDate.getMonth().getDisplayName(TextStyle.FULL, new Locale("Es")));
        System.out.println(9+".-" + bornDate.getEra().getDisplayName(TextStyle.FULL, new Locale("es")));
        System.out.println(10+".-" + bornDateTime.format(dateTimeFormatter));
    }
}

