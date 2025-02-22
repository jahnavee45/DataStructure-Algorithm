import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class crudOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6);
        System.out.println("Printing list: " + list);

        List<Integer> newList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) != 4){
                newList.add(list.get(i));
            }
        }
        System.out.println("After deletion: " + newList);
    }
}
