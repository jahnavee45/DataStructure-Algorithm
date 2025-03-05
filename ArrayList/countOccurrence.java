import java.util.ArrayList;
import java.util.HashMap;

public class countOccurrence {
        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(3);
            arr.add(2);
            arr.add(2);
            arr.add(3);
            arr.add(1);
            arr.add(4);
            arr.add(2);
    
            ArrayList<Integer> list = majorityEle(arr);
            System.out.println("Majority element are: " + list);
    }

    public static ArrayList<Integer> majorityEle(ArrayList<Integer> arr){
        int floor = (int)Math.floor(arr.size()/3);

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.size(); i++){
            if(map.containsKey(arr.get(i))){
                map.put(arr.get(i), map.get(arr.get(i)) + 1);
            }else{
                map.put(arr.get(i), 1);
            }
        }

        for(int v : map.keySet()){
            if(map.get(v) > floor){
                list.add(v);
            }
        }
        return list;
    }
}
