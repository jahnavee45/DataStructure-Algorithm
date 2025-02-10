package StreamApi;
import java.util.Arrays;
import java.util.List;

public class findSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);

        int sum = list.stream().mapToInt(Integer :: intValue).sum();

        System.out.println("Sum of given list " + list + " is " + sum);
    }
}
