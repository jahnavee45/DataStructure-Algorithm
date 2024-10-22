package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class practice {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("apple");
        arr.add("cherry");
        arr.add("mango");

        System.out.println("Printing arraylist using iterator method: ");
        Iterator<String> val = arr.iterator();
        while(val.hasNext()){
            String s = val.next();
            System.out.print(s + " ");
        }

        System.out.println("\nPrinting arraylist using loop: ");
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}
