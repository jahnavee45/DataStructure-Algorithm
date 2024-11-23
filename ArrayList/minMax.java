import java.util.ArrayList;
import java.util.Collections;

public class minMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(13);
        list.add(6);
        list.add(90);
        list.add(55);
        list.add(78);

        System.out.println("Given list is: " + list);
        System.out.println("Minimum element in list is: " + findMin(list));
        System.out.println("Maximum element in list is: " + findMax(list));
    }

    private static int findMax(ArrayList<Integer> list) {
        if(list == null || list.size() == 0){
            return Integer.MIN_VALUE;
        }

        return Collections.min(list);
    }

    private static int findMin(ArrayList<Integer> list) {
        if(list == null || list.size() == 0){
            return Integer.MAX_VALUE;
        }

        return Collections.max(list);
    }
}
