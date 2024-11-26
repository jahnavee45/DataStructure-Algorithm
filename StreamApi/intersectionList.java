package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class intersectionList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 3, 4, 7);

        System.out.println("List 1 is: " + list1);
        System.out.println("List 2 is: " + list2);

        List<Integer> list3 = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println("List 1 and List 2 after intersection: " + list3);
    }
}
