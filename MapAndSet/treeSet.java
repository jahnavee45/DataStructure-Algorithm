package MapAndSet;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(14);
        list.add(63);
        list.add(20);
        list.add(8);
        System.out.println("Printing an arraylist: " + list);
        
        TreeSet<Integer> set = new TreeSet<>();
        set.addAll(list);
        System.out.println("Printing a tree set: " + set);

        
    }
}
