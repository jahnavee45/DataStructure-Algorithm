import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class begin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(40);
        list.add(18);
        list.add(7);
        list.add(40);
        list.add(65);
        list.add(9);
        list.add(40);

        // print all elements as a list
        System.out.println(list);

        // print elements
        for(int arr:list){
            System.out.print(arr + " ");
        }

        // update the value of element in list
        list.set(2, 74);
        System.out.print("\n" + list);

        // remove an element using index
        list.remove(2);
        System.out.print("\n" + list);

        // remove duplicate elements
        List<Integer> li = list.stream().distinct().collect(Collectors.toList());
        System.out.println("\n" + li);
    }
}
