import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class itratingArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        System.out.println("Printing list: " + list);

        System.out.println("Printing list by iterating each element:");
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
