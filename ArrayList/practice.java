package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class practice {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("apple");
        arr.add("banana");
        arr.add("mango");

        Iterator<String> val = arr.iterator();
        while(val.hasNext()){
            String s = val.next();
            System.out.print(s + " ");
        }
    }
}
