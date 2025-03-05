import java.util.ArrayList;

public class countOccurrence {
    private static final String List = null;
    
        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(3);
            arr.add(2);
            arr.add(2);
            arr.add(3);
            arr.add(1);
            arr.add(4);
    
            List<Integer> list = majorityEle(arr);
            System.out.println("Majority element are: " + list);
    }
}
