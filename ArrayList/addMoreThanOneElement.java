import java.util.ArrayList;

public class addMoreThanOneElement {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        System.out.println("Printing list1: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println("Printing list1: " + list2);

        list1.addAll(1, list2);
        System.out.println("Printing list1 after adding list2: " + list1);

    }
}