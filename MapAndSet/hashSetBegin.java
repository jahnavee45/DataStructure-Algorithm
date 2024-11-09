package MapAndSet;
import java.util.HashSet;

public class hashSetBegin {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        // print size of set
        System.out.println("The size of set is: " + set.size());

        // print all elements of set
        System.out.println("Elements of set: " + set);
    }
}
