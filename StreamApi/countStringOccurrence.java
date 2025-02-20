package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class countStringOccurrence {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice", "Bob","Charlie","Alice", "Alice", "Dennis", "Charlie", "Dennis");

        Map<String, Long> countList = list.stream()
        .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        countList.forEach((name, count) -> System.out.println(name + ": " + count));
    }
}
