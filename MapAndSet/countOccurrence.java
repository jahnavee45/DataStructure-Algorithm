package MapAndSet;

import java.util.HashMap;

public class countOccurrence {
    public static void main(String[] args) {
        String str = "batty bought the butter";

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }

        System.out.println(map);
    }
}
