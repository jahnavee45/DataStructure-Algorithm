package MapAndSet;

import java.util.HashMap;

public class evenOdd {
    public static void main(String[] args) {
       int[] arr = {3, 42, 72, 11, 59, 60};
       
       HashMap<String, Integer> map = new HashMap<>();
       for(int i = 0; i < arr.length; i++) {
        if(arr[i] % 2 == 0){
            map.put("Even", arr[i]);
        }
        else{
            map.put("Odd", arr[i]);
        }
       }
    }
}
