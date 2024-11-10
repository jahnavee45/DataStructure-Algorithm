package MapAndSet;
import java.util.HashMap;
import java.util.Map;

public class hashMapBegin {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 6);
        map.put("Orange", 7);
        map.put("Grapes", 6);
        map.put("Cherry", 8);
        map.put("Mango", 10);

        // print the size of hashmap
        System.out.println("Size of hashmap: " + map.size());

        // print elements of hashmap
        System.out.println("Elements of map: " + map);

        // print each element one by one
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print("Key: " + e.getKey() + ", ");
            System.out.print("Value: " +e.getValue() + "\n");
        }

        // chech if key is present
        if(map.containsKey("Apple")){
            System.out.println("Key exists and its value is " + map.get("Apple"));
        }else{
            System.out.println("Key does not exists");
        }
    }
}
