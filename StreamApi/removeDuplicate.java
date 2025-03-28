package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 3);
        System.out.println("Before removing duplicates: " + list);

        List<Integer> list1 = list.stream()
        .distinct()
        .collect(Collectors.toList());
        System.out.println("After removing duplicates: " + list1);
    }
}
