package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortNames {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Plant", "Leaves", "Trees", "Fruits");
        System.out.println(list);

        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
