import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class localDateAndTime {
    public static void main(String[] args) {

        // to find local date
        LocalDate date = LocalDate.now();
        System.out.println("Local Date: " + date);

        // to find local time
        LocalTime time = LocalTime.now();
        System.out.println("Local Time: " + time);

        // to find date and time according to zone/area
        ZonedDateTime dt = ZonedDateTime.now();
        System.out.println("Zoned date and Time: " + dt);

        // to print a given date
        LocalDate x = LocalDate.of(2024, 12, 31);
        System.out.println(x);
    }
}