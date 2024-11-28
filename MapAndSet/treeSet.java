package MapAndSet;

import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(14);
        set.add(63);
        set.add(20);
        set.add(8);

        System.out.println("Printing a tree set: " + set);
    }
}
