package functions;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Func {

    public static void td(){
        var dayNumber = LocalDateTime.now().getDayOfMonth();
        var monthName = LocalDateTime.now().getMonth();
        var year = (Integer) LocalDateTime.now().getYear();
        var yearstr = year.toString().substring(2);
        var hour = LocalDateTime.now().getHour();
        var min = LocalDateTime.now().getMinute();

        System.out.printf("%s %s %s %s %s ", dayNumber,monthName,yearstr,hour,min);
    }
    public static void main(String... args){
        td();
    }
}
