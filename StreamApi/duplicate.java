package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class duplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 5, 6, 5, 7, 8, 2, 9);
        System.out.println("before removing duplicates: " + list);

        List<Integer> newlist = list.stream().distinct().collect(Collectors.toList());
        System.out.println("after removing duplicates: " + newlist);
    }
}
