package MapAndSet;
import java.util.HashMap;
public class FindDuplicates {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 4, 3, 3};
        examine(a, a.length);
    }

    public static void examine(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) > 1){
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}
