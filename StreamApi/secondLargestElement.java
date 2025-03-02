import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class secondLargestElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(4);
        list.add(0);

        System.out.println("Before sorting: " + list);

        List<Integer> sortedList = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("After sorting: " + sortedList);

        if (sortedList.size() > 1) {
            System.out.println("Second largest element is: " + sortedList.get(1));
        }
    }
}
