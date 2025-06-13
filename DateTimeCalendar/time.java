package DateTimeCalendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class time {
    public static void main(String[] args) {
        LocalDate d =LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();//date
        System.out.println(dt);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");//formatter
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MM/yyyy --E H:m a");//formatter

        String mydate= dt.format(dtf);
        String mydate2= dt.format(dtf2);

        System.out.println(mydate);
        System.out.println(mydate2);
        

        
    }
}
