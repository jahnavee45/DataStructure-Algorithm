package LinkedList;

import java.util.LinkedList;

public class sampleProgram {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(24);
        list.add(52);
        list.add(38);
        list.add(97);

        System.out.println("New List:" + list);

        list.add(1, 40);
        System.out.println("Adding new element:" + list);

        list.remove(1);
        System.out.println(list);
    }
}
