import java.util.ArrayList;
import java.util.Collections;

public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(34);
        list.add(11);
        list.add(59);
        list.add(47);

        System.out.println("List before sorting: " + list);
        Collections.sort(list);

        System.out.print("List after sorting : " );
        list.forEach((ele) -> System.out.print(ele + " "));
    }
}
