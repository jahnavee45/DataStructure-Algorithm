import java.util.ArrayList;
import java.util.Collections;

public class sortList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(34);
        list.add(11);
        list.add(59);
        list.add(47);

        System.out.println("List before sorting: " + list);
        Collections.sort(list);
    }
}
