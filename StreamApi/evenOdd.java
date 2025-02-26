package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class evenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 7);
        System.out.println("Given list is: " + list);

        Map<Boolean, List<Integer>> check = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("List after partitioning even and odd: " + check);

        List<Integer> even = check.get(true);
        List<Integer> odd = check.get(false);

        System.out.println("Even numbers are: " + even);
        System.out.println("Odd numbers are: " + odd);

    }
}
