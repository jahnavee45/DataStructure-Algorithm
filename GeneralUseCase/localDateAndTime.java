import java.time.LocalDate;
import java.time.LocalTime;

public class localDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Local Date: " + date);

        LocalTime time = LocalTime.now();
        System.out.println("Local Time: " + time);
    }
}
