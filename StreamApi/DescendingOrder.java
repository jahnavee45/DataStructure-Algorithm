package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 1, 4, 6, 3, 0);

        List<Integer> order = list.stream()
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
        System.out.println("After reversing: " + order);
    }
}
