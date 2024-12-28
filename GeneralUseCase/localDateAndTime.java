import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class localDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Local Date: " + date);

        LocalTime time = LocalTime.now();
        System.out.println("Local Time: " + time);

        ZonedDateTime dt = ZonedDateTime.now();
        System.out.println("Zoned date and Time: " + dt);

        LocalDate x = LocalDate.of(2024, 12, 31);
        System.out.println(x);
    }
}
