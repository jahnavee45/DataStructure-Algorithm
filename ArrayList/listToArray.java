import java.util.ArrayList;

public class listToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Grapes");
        list.add("Berry");
        list.add("Bananas");

        String[] arr = list.toArray(new String[list.size()]);
        for(String st : arr){
            System.out.println(st);
        }
    }
}
