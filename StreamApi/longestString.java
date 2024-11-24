package StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class longestString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("grape");
        list.add("fig");

        System.out.println("List of fruits: " + list);

        Optional<String> longest = list.stream().max(Comparator.comparingInt(String::length));
        System.out.println("Longest name of fruit is: " + longest);
    }
}
