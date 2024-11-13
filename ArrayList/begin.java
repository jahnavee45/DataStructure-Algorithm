import java.util.ArrayList;

public class begin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(40);
        list.add(18);
        list.add(7);
        list.add(65);
        list.add(9);

        System.out.println(list);

        for(int arr:list){
            System.out.print(arr + " ");
        }
    }
}
