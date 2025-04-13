import java.util.ArrayList;

public class ListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Grapes");
        list.add("Berry");
        list.add("Bananas");

        System.out.println("Printing the arraylist: ");
        list.forEach(ele -> System.out.println(ele));

        System.out.println("Printing array elements after conversion: ");
        String[] arr = list.toArray(new String[list.size()]);
        for(String st : arr){
            System.out.println(st);
        }
    }
}
